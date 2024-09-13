package com;

public class Celular {

	// Pilares:
	// ABSTRACCIÓN - Definir nuestro objeto de acuerdo a un contexto,
	// con sus atributos y comportamientos

	// ENCAPSULACIÓN - Protege los atributos, clases, métodos de ciertos niveles de
	// acceso
	// o modificación
	// Se utilizan los modificadores private, public, protected, defaul

	// Atributos o carcaterísticas de mis objetos a crear
	private String marca;
	private String modelo;
	private String color;
	private double tamañoPantalla;
	private double ram;
	private double memoria;

	
	// --------------------------------------------
	// Métodos Constructores:
	// Nos permiten iniciar a nuestros objetos con sus atributos iniciados si así lo
	// necesitamos

	// 1. CONSTRUCTOR VACÍO
	// Nos permite iniciar o crear un objeto de esta clase sin necesidad de
	// asignarle valores en un inicio a sus atributos

	public Celular() { // Método constructor + objeto
	}

	// 2. CONSTRUCTOR CON TODOS LOS ARGUMENOTS:
	// Me va a permitir crear un objeto pero con todos sus atributos iniciados al crearlo
	// Se genera dando clic derecho + source + Generate Constructor using Fields
	public Celular(String marca, String modelo, String color, double tamañoPantalla, double ram, double memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamañoPantalla = tamañoPantalla;
		this.ram = ram;
		this.memoria = memoria;
	}

	//Podemos tener más constructores con determinados atributos si fuera necesario
	//Pero convencionalmente con el Vacio y el de Todos los argumentos, es más que suficiente
	public Celular(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//MÉTOSOS GETTERS Y SETTERS
	// Métodos Get - devuelven el valor de un atributo
	// Métodos Set - nos permiten asignar un valor a un atributo privado
	
	//Para ponerlo, damos clic derecho + source + Generate Getters and Setters

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

	// -------------------------------------------
	
	// Método toString ()
	//nos ayuda a visualizar en forma String los atributos de mi objeto
	//permitiéndome ver cómo se compone mi objeto, como si de una radiografía se tratase
	
	// clic derecho + source + Generate toString
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamañoPantalla="
				+ tamañoPantalla + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	

	// --------------------------------------------
	
	

}
