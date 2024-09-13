package com;

public class Autos {

	private String marca;
	private int modelo;
	private String color;
	
	public Autos() {
		
	}

	public Autos(String marca, int modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}

	
}
