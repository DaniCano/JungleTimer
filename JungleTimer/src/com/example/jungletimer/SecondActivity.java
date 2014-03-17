package com.example.jungletimer;

import java.util.ArrayList;
import java.util.Collections;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SecondActivity extends ActionBarActivity {

	private Cursor temps;
	private TempsAdapter adapter;
	private TempsSQLiteHelper tmpHelper;
	private TempsConversor tempsConv; 
	SQLiteDatabase db;
	ArrayList<Integer>  my_array;

	Spinner TimeDelay;
	ToggleButton box1;
	ToggleButton box2;
	Button afegir;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		// Show the Up button in the action bar.
		setupActionBar();
		
		tmpHelper = new  TempsSQLiteHelper(this, "temps.db", null, 1);
        // obtenir l'objecte BD 
        db = tmpHelper.getWritableDatabase();
        tempsConv = new TempsConversor(tmpHelper);
        // Si s'ha obert correctament la BD    

		TimeDelay = (Spinner) findViewById(R.id.spinner1);

		box1 = (ToggleButton) findViewById(R.id.checkBox1);
		box2 = (ToggleButton) findViewById(R.id.checkBox2);
		afegir = (Button) findViewById(R.id.btn1);

		my_array = new ArrayList<Integer>();
		my_array = refreshData();
		
		TimeDelay = (Spinner) findViewById(R.id.spinner1);
		@SuppressWarnings("unchecked")
		ArrayAdapter adapter2 = new ArrayAdapter(this,
		        android.R.layout.simple_spinner_dropdown_item,
		            my_array);
		    TimeDelay.setAdapter(adapter2);

		afegir.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(SecondActivity.this, LoadTemps.class);

				startActivity(i);
			}
		});

	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		/*
		 * switch (item.getItemId()) { case android.R.id.home: // This ID
		 * represents the Home or Up button. In the case of this // activity,
		 * the Up button is shown. Use NavUtils to allow users // to navigate up
		 * one level in the application structure. For // more details, see the
		 * Navigation pattern on Android Design: // //
		 * http://developer.android.com
		 * /design/patterns/navigation.html#up-vs-back //
		 * NavUtils.navigateUpFromSameTask(this);
		 * NavUtils.navigateUpTo(sourceActivity, upIntent) return true; }
		 */
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onPause() {
		super.onPause();
		save(box1.isChecked(), "box1");
		save(box2.isChecked(), "box2");
		saveSpinner();
	}

	@Override
	public void onResume() {
		super.onResume();
		box1.setChecked(load("box1"));
		box2.setChecked(load("box2"));

		my_array = refreshData();
		ArrayAdapter adapter2 = new ArrayAdapter(this,
		        android.R.layout.simple_spinner_dropdown_item,
		            my_array);
		    TimeDelay.setAdapter(adapter2);
		    
		    TimeDelay.setSelection(loadSpinner());
	}

	private void save(final boolean isChecked, String name) {
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putBoolean(name, isChecked);
		editor.commit();
	}

	private boolean load(String name) {
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		return sharedPreferences.getBoolean(name, false);
	}
	
	private void saveSpinner(){
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
	    SharedPreferences.Editor editor = sharedPreferences.edit();
	    editor.putInt("spinnerPosition", (int) TimeDelay.getSelectedItemId());//Desem la posicio de l'spinner
	    editor.putString("spinnerValue", TimeDelay.getSelectedItem().toString());//Desem el nombre de la seleccio de l'spinner
	    editor.commit();
	}
	
	private int loadSpinner(){
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		return sharedPreferences.getInt("spinnerPosition", 0);
	}
	
	private ArrayList<Integer> refreshData() {
		
        ArrayList<Integer> my_array = new ArrayList<Integer>();
       try {
        	temps = tempsConv.getAll();
 
            if (temps.moveToFirst()) {
                do {
                    Integer NOMBRE = temps.getInt(1);
                    my_array.add(NOMBRE);
 
                } while (temps.moveToNext());
            }
            temps.close();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Error encountered.",
                    Toast.LENGTH_LONG).show();
        }
        Collections.sort(my_array);
        return my_array;
    }
}
