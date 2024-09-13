package com;

public class Autos {
	
	private String marca;
	private String color;
	private double Kilometraje;
	
	public Autos () {
		
	}

	public Autos(String marca, String color, double kilometraje) {
		super();
		this.marca = marca;
		this.color = color;
		Kilometraje = kilometraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getKilometraje() {
		return Kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		Kilometraje = kilometraje;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", color=" + color + ", Kilometraje=" + Kilometraje + "]";
	}

	
	
	
	
	
	
}
