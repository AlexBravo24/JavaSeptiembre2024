package com;

public class Llanta {
	
	private String tipo;
	private double tama�o;
	private int numeroTotalLlantas;
	
	public Llanta () {
		
	}

	public Llanta(String tipo, double tama�o, int numeroTotalLlantas) {
		super();
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.numeroTotalLlantas = numeroTotalLlantas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public int getNumeroTotalLlantas() {
		return numeroTotalLlantas;
	}

	public void setNumeroTotalLlantas(int numeroTotalLlantas) {
		this.numeroTotalLlantas = numeroTotalLlantas;
	}

	@Override
	public String toString() {
		return "Llanta [tipo=" + tipo + ", tama�o=" + tama�o + ", numeroTotalLlantas=" + numeroTotalLlantas + "]";
	}
	
	
	

}
