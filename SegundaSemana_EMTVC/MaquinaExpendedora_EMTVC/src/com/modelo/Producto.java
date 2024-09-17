package com.modelo;

public class Producto {

	private String marca;
	private String modelo;
	private String sabor;
	private double precio;
	private int cantidad;
	
	public Producto() {}

	

	public Producto(String marca, String modelo, String sabor, double precio, int cantidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.sabor = sabor;
		this.precio = precio;
		this.cantidad = cantidad;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getSabor() {
		return sabor;
	}



	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "[" + modelo + " "+ sabor + "  $" + precio + "]";
	}
	
	
	
}
