package com.example.jungletimer;

import android.app.Activity;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;
 
/**
 * Classe que implementa un adaptador de dades per un ListView
 * 
 * @author Marc Nicolau Reixach (marc.nicolau@gmail.com)
 *
 */
public class TempsAdapter extends BaseAdapter {
	private Activity context;
	private Cursor dades;
 
	/**
	 * Constructor
	 * @param context el context de l'aplicaci�
	 * @param dades cursor amb les dades
	 */
	TempsAdapter(Activity context, Cursor dades) {
		super();
	    this.context = context;
	    this.dades = dades;
	}
 
	/**
	 * Sobreescriptura del m�tode getView per indicar com s'han de mostrar
	 * les dades d'una fila del ListView
	 */
	public View getView(int position, View convertView, ViewGroup parent) {
		View element = convertView;
 
		Temps t = getItem(position);
 
		if(element == null) {
			LayoutInflater inflater = context.getLayoutInflater();
			element = inflater.inflate(R.layout.activity_second, null);
		}		
 
		return element;
	}
 
	/**
	 * Sobreescriptura del m�tode getCount que indica quantes dades gestiona
	 * l'adaptador.
	 */
	public int getCount() {
		return dades.getCount();
	}
	/**
	 * Sobreescriptura del m�tode getItem que retorna l'objecte que ocupa la 
	 * posici� indicada amb el par�metre.
	 */
	public Temps getItem(int pos) {
		Temps t = new Temps();
		if(dades.moveToPosition(pos)) {
			t.setCodi(dades.getInt(0));
			t.setNombre(dades.getInt(1));
		}	
		return t;
	}
	/**
	 * Sobreescriptura del m�tode getItemId que retorna l'id de l'objecte
	 * que ocupa la posici� indicad amb el par�metre.
	 */
	public long getItemId(int position) {
		return getItem(position).getCodi();
	}
}

