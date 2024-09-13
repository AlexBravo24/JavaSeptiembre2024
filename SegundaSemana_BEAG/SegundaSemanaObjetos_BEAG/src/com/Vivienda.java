package com;

public class Vivienda {

	private String estilo;
	private double precio;
	private double metrosCuadrados;
	private int numPisos;
	private String ubicaci�n;

	// Crear constructores:
	// Constructor vac�o:
	public Vivienda() {

	}

	// Constructor con todos los par�metros:
	// click derecho + source + using Fields
	public Vivienda(String estilo, double precio, double metrosCuadrados, int numPisos, String ubicaci�n) {
		super();
		this.estilo = estilo;
		this.precio = precio;
		this.metrosCuadrados = metrosCuadrados;
		this.numPisos = numPisos;
		this.ubicaci�n = ubicaci�n;
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

	public String getUbicaci�n() {
		return ubicaci�n;
	}

	public void setUbicaci�n(String ubicaci�n) {
		this.ubicaci�n = ubicaci�n;
	}

	// M�todo to String
	// click derecho + source + GeneratetoString
	@Override
	public String toString() {
		return "Vivienda [estilo=" + estilo + ", precio=" + precio + ", metrosCuadrados=" + metrosCuadrados
				+ ", numPisos=" + numPisos + ", ubicaci�n=" + ubicaci�n + "]";
	}

}
