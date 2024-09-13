package com;

public class Laptop {

	//Declarar atributos
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	
	//Aquí declaramos como ejemplo atributos que formarán parte de Laptop
	//pero en realidad son otros objetos más pequeños que las componen
	//Así que primero debo crear esas clases que son parte de Laptop
	private Ram ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	//Contructor vacío
	public Laptop () {
		
	}

	//Contructor con todos los argumentos
	public Laptop(String marca, String modelo, String color, double precio, Ram ram, Almacenamiento disco,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
	}

	//Constructor getters and setters
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	//Método toString
	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", ram="
				+ ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}
	
	
	
	
	
	
}
