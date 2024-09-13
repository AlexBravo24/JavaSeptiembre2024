package com;

public class Motor {

	private int numCilindros;
	private int caballosDeFuerza;
	private String tipoCombustible;
	
	public Motor () {
		
	}

	public Motor(int numCilindros, int caballosDeFuerza, String tipoCombustible) {
		super();
		this.numCilindros = numCilindros;
		this.caballosDeFuerza = caballosDeFuerza;
		this.tipoCombustible = tipoCombustible;
	}

	public int getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "Motor [numCilindros=" + numCilindros + ", caballosDeFuerza=" + caballosDeFuerza + ", tipoCombustible="
				+ tipoCombustible + "]";
	}
	
	
	
}
