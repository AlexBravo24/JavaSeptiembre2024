package com;

public class ConsolaVideojuegos extends AparatoElectrico
{
	private String modelo;
	private int numeroDeControles;
	private boolean soportaDisco;
	
	public ConsolaVideojuegos()
	{
		
	}
	
	public ConsolaVideojuegos(float consumoEnergetico, int numeroDeCapacitores, int numeroDeResistencias, String modelo,
			int numeroDeControles, boolean soportaDisco) {
		super(consumoEnergetico, numeroDeCapacitores, numeroDeResistencias);
		this.modelo = modelo;
		this.numeroDeControles = numeroDeControles;
		this.soportaDisco = soportaDisco;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroDeControles() {
		return numeroDeControles;
	}
	public void setNumeroDeControles(int numeroDeControles) {
		this.numeroDeControles = numeroDeControles;
	}
	public boolean isSoportaDisco() {
		return soportaDisco;
	}
	public void setSoportaDisco(boolean soportaDisco) {
		this.soportaDisco = soportaDisco;
	}

	@Override
	public String toString() {
		return "ConsolaVideojuegos [modelo=" + modelo + ", numeroDeControles=" + numeroDeControles + ", soportaDisco="
				+ soportaDisco + ", toString()=" + super.toString() + "]";
	}
	

	
	
}
