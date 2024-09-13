package com;

public class Lente {
	private float apertura;
	private float tamano;
	
	public Lente(float apertura, float tamano) {
		super();
		this.apertura = apertura;
		this.tamano = tamano;
	}

	public float getApertura() {
		return apertura;
	}

	public void setApertura(float apertura) {
		this.apertura = apertura;
	}

	public float getTamano() {
		return tamano;
	}

	public void setTamano(float tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Lente [apertura=" + apertura + ", tamano=" + tamano + "]";
	}
	
	
}
