package com;

public class Maritimo extends Transporte {

	private String tipo;
	private String compañia;
	private double capacidad;
	
	public Maritimo() {}

	public Maritimo(String medio, String id, String tipo, String compañia, double capacidad) {
		super(medio, id);
		this.tipo = tipo;
		this.compañia = compañia;
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Maritimo [tipo=" + tipo + ", compañia=" + compañia + ", capacidad=" + capacidad + ", toString()="
				+ super.toString() + "]";
	}
	
}
