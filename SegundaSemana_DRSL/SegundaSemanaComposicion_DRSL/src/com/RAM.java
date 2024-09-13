package com;

public class RAM {

	private String marca;
	private String modelo;
	private float capacidad;
	
	public RAM()
	{
		
	}
	public RAM(String marca, String modelo, float capacidad) 
	{
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
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
	public float getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(float capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", modelo=" + modelo + ", capacidad=" + capacidad + "]";
	}
	
}
