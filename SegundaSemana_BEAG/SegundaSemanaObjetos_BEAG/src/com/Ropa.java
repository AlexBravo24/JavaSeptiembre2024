package com;

public class Ropa {

	private String tipo;
	private String marca;
	private String talla;
	private String material;
	private double precio;

	// Crear constructores:
	// Constructor vacío:
	public Ropa() {

	}

	// Constructor con todos los parámetros:
	// click derecho + source + using Fields
	public Ropa(String tipo, String marca, String talla, String material, double precio) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.talla = talla;
		this.material = material;
		this.precio = precio;
	}

	//Constructor Getters and Setters
	//click derecho + soruce + getters and setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//Método to String
	//click derecho + source + GeneratetoString 
	@Override
	public String toString() {
		return "Ropa [tipo=" + tipo + ", marca=" + marca + ", talla=" + talla + ", material=" + material + ", precio="
				+ precio + "]";
	}
	
	

	
	
}
