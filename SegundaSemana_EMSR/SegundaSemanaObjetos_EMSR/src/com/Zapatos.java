package com;

public class Zapatos {

	private String marca;
	private double Talla;
	private double precio;
	
	public Zapatos () {
		
	}
	
	
	public Zapatos(String marca, double talla, double precio) {
		super();
		this.marca = marca;
		Talla = talla;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getTalla() {
		return Talla;
	}


	public void setTalla(double talla) {
		Talla = talla;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Zapatos [marca=" + marca + ", Talla=" + Talla + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
	
}
