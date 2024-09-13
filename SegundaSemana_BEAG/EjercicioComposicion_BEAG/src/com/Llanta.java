package com;

public class Llanta {
	
	private String tipo;
	private double tamaño;
	private int numeroTotalLlantas;
	
	public Llanta () {
		
	}

	public Llanta(String tipo, double tamaño, int numeroTotalLlantas) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.numeroTotalLlantas = numeroTotalLlantas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getNumeroTotalLlantas() {
		return numeroTotalLlantas;
	}

	public void setNumeroTotalLlantas(int numeroTotalLlantas) {
		this.numeroTotalLlantas = numeroTotalLlantas;
	}

	@Override
	public String toString() {
		return "Llanta [tipo=" + tipo + ", tamaño=" + tamaño + ", numeroTotalLlantas=" + numeroTotalLlantas + "]";
	}
	
	
	

}
