package com;

public class Medicamento {

	private String nombre;
	private String marca;
	private double numeroPastillas;
	
	public Medicamento() {}

	public Medicamento(String nombre, String marca, double numeroPastillas) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.numeroPastillas = numeroPastillas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getNumeroPastillas() {
		return numeroPastillas;
	}

	public void setNumeroPastillas(double numeroPastillas) {
		this.numeroPastillas = numeroPastillas;
	}

	@Override
	public String toString() {
		return "Medicamento [nombre=" + nombre + ", marca=" + marca + ", numeroPastillas=" + numeroPastillas + "]";
	}

}