package com;

public class Celular {
	//Abstraccion: Definir nuestro objeto de acuerdo a un contexto con sus atributos y comportamientos.
	//Encapsulacion: Protegen los datos de su manipulacion usando los modificacdores de acceso.
	private String marca;
	private String modelo;
	private String color;
	private double tamaņoDePantalla;
	private double ram;
	private double memoria;
	
	//metodos constructores Nos permiten inicializar los objetos con sus atributos
	//Ejemplo de constructor Vacio

	public Celular()// Constructor vacio
	{
		
	}
	//constructor con todos los argumentos
	public Celular(String marca, String modelo, String color, double tamaņoDePantalla, double ram, double memoria) 
	{
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamaņoDePantalla = tamaņoDePantalla;
		this.ram = ram;
		this.memoria = memoria;
	}
	public Celular(String marca, String modelo)
	{
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	// Gettters an Setters
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getTamaņoDePantalla() {
		return tamaņoDePantalla;
	}
	public void setTamaņoDePantalla(double tamaņoDePantalla) {
		this.tamaņoDePantalla = tamaņoDePantalla;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamaņoDePantalla="
				+ tamaņoDePantalla + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	
	
}
