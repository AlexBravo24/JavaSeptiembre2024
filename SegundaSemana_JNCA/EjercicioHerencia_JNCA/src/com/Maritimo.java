package com;

public class Maritimo extends Transporte {

	private String tipo;
	private String compa�ia;
	private double capacidad;
	
	public Maritimo() {}

	public Maritimo(String medio, String id, String tipo, String compa�ia, double capacidad) {
		super(medio, id);
		this.tipo = tipo;
		this.compa�ia = compa�ia;
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Maritimo [tipo=" + tipo + ", compa�ia=" + compa�ia + ", capacidad=" + capacidad + ", toString()="
				+ super.toString() + "]";
	}
	
}
