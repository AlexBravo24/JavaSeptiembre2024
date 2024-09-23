package com;

public class Celular {
	//ABSTRACCION - DEFINIR NUESTRO objeto 
	// de acuerdo a un contexto
	//cin sus atributos y comportamientos
	//atributos o caracteristicas de mis objetos a crear
	//
	private String marca;
	private String modelo;
	private String color;
	private double tamañoPantalla;
	private double ram;
	private double memoria;
	 //metodos constructores
	//nos permiten iniciar a nuestros objetos con sus atributos
	//iniciados di asi lo necesitamos
	 
	//contructor vacio
	// nos permite iniciar o crar un objeto de 
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String color, double tamañoPantalla, double ram, double memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamañoPantalla = tamañoPantalla;
		this.ram = ram;
		this.memoria = memoria;
	}
//metodos getters y setters
	//metodo get devuelven el valor de un atributo
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

	public double getTamañoPantalla() {
		return tamañoPantalla;
	}

	public void setTamañoPantalla(double tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
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
//nos ayuda a visualizar en formato string los atributos de mi objeto
	//permitiendo ver de que se compone 
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamañoPantalla="
				+ tamañoPantalla + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	
}
