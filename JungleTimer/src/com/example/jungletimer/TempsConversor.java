package com.example.jungletimer;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
 
/**
 * Classe conversora d'objectes Titular a BD
 * 
 * @author Marc Nicolau Reixach
 *
 */
public class TempsConversor {
 
	private TempsSQLiteHelper helper;
 
	/**
	 * Consructor per defecte
	 */
	public TempsConversor() {
 
	}
 
	/**
	 * Constructor amb paràmetres
	 * @param helper l'ajudant de la BD de Titulars
	 */
	public TempsConversor(TempsSQLiteHelper helper) {
		this.helper = helper;
	}
 
	/**
	 * Desa un nou titular a la taula
	 * @param titular l'objecte a desar
	 * @return l'id del nou titular desat
	 */
	public long save(Temps temps) {		
		long index = -1;
		// s'agafa l'objecte base de dades en mode escriptura
		SQLiteDatabase db = helper.getWritableDatabase();
		// es crea un objecte de diccionari (clau,valor) per indicar els valors a afegir 
		ContentValues dades = new ContentValues();
 
    	dades.put("temps", temps.getNombre());
    	try {
    		index = db.insertOrThrow("Temps", null, dades);
    		// volem veure en el log el que passa
    		Log.i("Temps", dades.toString() + " afegit amb codi " + index);
    	}
    	catch(Exception e) {
    		// volem reflectir en el log que hi ha hagut un error
    		Log.e("Temps", e.getMessage());
    	}
    	return index;
	}	
 
	/**
	 * Retorna un cursor amb totes les dades de la taula
	 * @return
	 */
	public Cursor getAll() {
		SQLiteDatabase db = helper.getReadableDatabase();
 
		return db.query(true, "Temps", 
						new String[]{"codi","temps"}, 
						null, null, null, null, null, null);
	}
 
	/**
	 * Esborra el titular passat per paràmetre
	 * @param t el titular a esborrar
	 * @return la quantitat de titulars eliminats
	 */
	public boolean remove(Temps t) {		
		// obtenir l'objecte BD en mode esriptura
		SQLiteDatabase db = helper.getWritableDatabase();
 
		return db.delete("Temps", "codi=" + t.getCodi(),null ) > 0;
	}
	/**
	 * Esborra tots els Temps de la taula
	 * @return 
	 */
	public boolean removeAll() {		
		// obtenir l'objecte BD en mode escriptura
		SQLiteDatabase db = helper.getWritableDatabase();
 
		return db.delete("Temps", null, null ) > 0;
	}
}
