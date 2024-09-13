package com;

public class Computadora {

	private String marca;
	private float precio;
	private int puertosUSB;
	
	public Computadora()
	{
		
	}

	public Computadora(String marca, float precio, int puertosUSB) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.puertosUSB = puertosUSB;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getPuertosUSB() {
		return puertosUSB;
	}

	public void setPuertosUSB(int puertosUSB) {
		this.puertosUSB = puertosUSB;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", precio=" + precio + ", puertosUSB=" + puertosUSB + "]";
	}

}
