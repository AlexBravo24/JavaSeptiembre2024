package com;

public class Vivienda {

	private String estilo;
	private double precio;
	private double metrosCuadrados;
	private int numPisos;
	private String ubicación;

	// Crear constructores:
	// Constructor vacío:
	public Vivienda() {

	}

	// Constructor con todos los parámetros:
	// click derecho + source + using Fields
	public Vivienda(String estilo, double precio, double metrosCuadrados, int numPisos, String ubicación) {
		super();
		this.estilo = estilo;
		this.precio = precio;
		this.metrosCuadrados = metrosCuadrados;
		this.numPisos = numPisos;
		this.ubicación = ubicación;
	}

	// Constructor Getters and Setters
	// click derecho + soruce + getters and setters
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public String getUbicación() {
		return ubicación;
	}

	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}

	// Método to String
	// click derecho + source + GeneratetoString
	@Override
	public String toString() {
		return "Vivienda [estilo=" + estilo + ", precio=" + precio + ", metrosCuadrados=" + metrosCuadrados
				+ ", numPisos=" + numPisos + ", ubicación=" + ubicación + "]";
	}

}
