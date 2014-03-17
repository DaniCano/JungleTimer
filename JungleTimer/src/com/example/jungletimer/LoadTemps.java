package com.example.jungletimer;

import java.util.ArrayList;
import java.util.Collections;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class LoadTemps extends Activity implements OnItemClickListener {

	Button crear;
	Button tancar;
	Button refresh;
	EditText temps;
	ListView timeViewer;
	
	ArrayList<Integer> my_array;

	private Cursor tempsC;
	private TempsSQLiteHelper titHelper;
	private TempsAdapter adapter2;
	private TempsConversor tempsConv;
	private SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_load_temps);

		titHelper = new TempsSQLiteHelper(this, "temps.db", null, 1);
		db = titHelper.getWritableDatabase();
		tempsConv = new TempsConversor(titHelper);

		crear = (Button) findViewById(R.id.button1);
		tancar = (Button) findViewById(R.id.button2);
		refresh = (Button) findViewById(R.id.button3);

		temps = (EditText) findViewById(R.id.editText1);
		timeViewer = (ListView) findViewById(R.id.timeViewer);

		my_array = new ArrayList<Integer>();
		my_array = refreshData();

		@SuppressWarnings("unchecked")
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_spinner_dropdown_item, my_array);
		timeViewer.setAdapter(adapter);

		crear.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				desar();

				Toast.makeText(LoadTemps.this, "Desat", Toast.LENGTH_SHORT)
						.show();
			}
		});

		tancar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				finish();
			}
		});
		
		refresh.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				refresh();
			}
		});
		timeViewer.setOnItemClickListener(LoadTemps.this);
	}

	private void desar() {
		try {

			// Si s'ha obert correctament la BD
			if (db != null) {

				tempsConv.save(new Temps(0, Integer.parseInt(temps.getText()
						.toString())));

				refresh();
				setResult(RESULT_OK);
			}
		} catch (Exception e) {
			setResult(RESULT_CANCELED);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.load_temps, menu);
		return true;
	}

	private ArrayList<Integer> refreshData() {

		ArrayList<Integer> my_array = new ArrayList<Integer>();
		try {
			tempsC = tempsConv.getAll();

			if (tempsC.moveToFirst()) {
				do {
					Integer NOMBRE = tempsC.getInt(1);
					my_array.add(NOMBRE);

				} while (tempsC.moveToNext());
			}
			tempsC.close();
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), "Error encountered.",
					Toast.LENGTH_LONG).show();
		}
		return my_array;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		final AdapterContextMenuInfo info = new AdapterContextMenuInfo(arg1, arg2, arg3);
		tempsC = tempsConv.getAll();
		adapter2 = new TempsAdapter(this, tempsC);
		
	    //es prepara la alerta al crear la instancia
        AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
        alertbox.setMessage("Vols esborrar el temps seleccionat?");
        //cas afirmatiu
        alertbox.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            //Funcion llamada cuando se pulsa el boton Si
            public void onClick(DialogInterface arg0, int arg1) {
            	//Eliminem l'item seleccionat
        		tempsConv.remove(adapter2.getItem(info.position));
        			// actualitzar la llista
        		refresh();
                    Toast.makeText(LoadTemps.this, "Temps Eliminat", Toast.LENGTH_SHORT).show();	  
        }});
 
        //cas negatiu
        alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
       
                Toast.makeText(LoadTemps.this, "Temps NO Eliminat", Toast.LENGTH_SHORT).show();	
                	
            }
        });
 
        //mostrem alertbox
        alertbox.show();
	

	}
	
	public void refresh(){
		my_array = refreshData();
		@SuppressWarnings("unchecked")
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_spinner_dropdown_item, my_array);
		timeViewer.setAdapter(adapter);
	}

}
