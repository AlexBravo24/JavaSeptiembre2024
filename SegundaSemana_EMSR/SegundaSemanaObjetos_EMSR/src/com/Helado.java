package com;

public class Helado {

	private String Sabor;
	private String marca;
	private double precio;
	
	
	public Helado () {
		
	}


	public Helado(String sabor, String marca, double precio) {
		super();
		Sabor = sabor;
		this.marca = marca;
		this.precio = precio;
	}


	public String getSabor() {
		return Sabor;
	}


	public void setSabor(String sabor) {
		Sabor = sabor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Helado [Sabor=" + Sabor + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
}
