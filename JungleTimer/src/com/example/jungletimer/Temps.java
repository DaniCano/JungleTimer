package com.example.jungletimer;

public class Temps {
	private int codi, nombre;

	public Temps(int codi, int nombre) {
		this.codi = codi;
		this.nombre = nombre;
	}

	public Temps() {
		// TODO Auto-generated constructor stub
	}

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Temps [codi=" + codi + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
