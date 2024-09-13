package com;

public class Celular {
	
	// Abstraccion - definir nuestro objeto de a cuerdo
	// a un contexto, con sus atributos y comportamientos
	
	// Atributos o caracteristicas de mis objetos a crear
	// Encapsulacion _ Potege los atributos, clases, metodos
	// de ciertos niveles de acceso o modificacion
	// Se utilizan los modificadores private, public, protected, default
	private String marca;
	private String modelo;
	private String color;
	private double tamañoPantella;
	private double ram;
	private double memoria;
	
	
	// metodos constructores
	// Nos permiten iniciar a nuestros objetos con sus atributos
	// iniciados si asi lo necesitamos
	
	//construir vacio
	// Nos permite iniciar o crear un objeto de esta clase
	// sin necesidad de asignarle valores en un inicio a sus atributos
	
	public Celular () {
		
	}

 
		// constructos con todos los argumentos
	// Me va a permitir crear un objeto pero con todos sus atributos iniciados al crearlo
	public Celular(String marca, String modelo, String color, double tamañoPantella, double ram, double memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamañoPantella = tamañoPantella;
		this.ram = ram;
		this.memoria = memoria;
	}

 //Podemos tener mas constructores con determinados atributos si fuera necesario
	//Pero convencionalmente con el vacio y el de todos los argumentos es mas que suficiente
	public Celular(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}


	
	// Metodos Getters y Setters
	//Metodos Get  Devuelven el valor de un atributo
	//Metodos set Nos permiten asignar un valor a un atributo privado
	
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


	public double getTamañoPantella() {
		return tamañoPantella;
	}


	public void setTamañoPantella(double tamañoPantella) {
		this.tamañoPantella = tamañoPantella;
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

	// Metodo toString
	// nos ayuda a visualizar en formato string los atributos de mi objeto
	//Permitiendome ver como se compone mi objeto como si de una radiografia se tratara
	
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamañoPantella="
				+ tamañoPantella + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	
	
	
	
	
	

}
