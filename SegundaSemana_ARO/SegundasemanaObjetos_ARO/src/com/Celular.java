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
	private double tama�oPantalla;
	private double ram;
	private double memoria;
	 //metodos constructores
	//nos permiten iniciar a nuestros objetos con sus atributos
	//iniciados di asi lo necesitamos
	 
	//contructor vacio
	// nos permite iniciar o crar un objeto de 
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String color, double tama�oPantalla, double ram, double memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tama�oPantalla = tama�oPantalla;
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

	public double getTama�oPantalla() {
		return tama�oPantalla;
	}

	public void setTama�oPantalla(double tama�oPantalla) {
		this.tama�oPantalla = tama�oPantalla;
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
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tama�oPantalla="
				+ tama�oPantalla + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	
}
