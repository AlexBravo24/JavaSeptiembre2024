package com;

public class Procesador {

	private String modelo;
	private int precio;
	private double Velocidad;
	
	public Procesador() {
		
	}

	public Procesador(String modelo, int precio, double velocidad) {
		super();
		this.modelo = modelo;
		this.precio = precio;
		Velocidad = velocidad;
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(double velocidad) {
		Velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Procesador [modelo= " + modelo + ", precio= $" + precio + ", Velocidad= " + Velocidad + "Hz]";
	}
	
	
}
