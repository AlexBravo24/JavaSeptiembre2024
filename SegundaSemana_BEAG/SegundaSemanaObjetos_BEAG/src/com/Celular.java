package com;

public class Celular {

	// Pilares:
	// ABSTRACCI�N - Definir nuestro objeto de acuerdo a un contexto,
	// con sus atributos y comportamientos

	// ENCAPSULACI�N - Protege los atributos, clases, m�todos de ciertos niveles de
	// acceso
	// o modificaci�n
	// Se utilizan los modificadores private, public, protected, defaul

	// Atributos o carcater�sticas de mis objetos a crear
	private String marca;
	private String modelo;
	private String color;
	private double tama�oPantalla;
	private double ram;
	private double memoria;

	
	// --------------------------------------------
	// M�todos Constructores:
	// Nos permiten iniciar a nuestros objetos con sus atributos iniciados si as� lo
	// necesitamos

	// 1. CONSTRUCTOR VAC�O
	// Nos permite iniciar o crear un objeto de esta clase sin necesidad de
	// asignarle valores en un inicio a sus atributos

	public Celular() { // M�todo constructor + objeto
	}

	// 2. CONSTRUCTOR CON TODOS LOS ARGUMENOTS:
	// Me va a permitir crear un objeto pero con todos sus atributos iniciados al crearlo
	// Se genera dando clic derecho + source + Generate Constructor using Fields
	public Celular(String marca, String modelo, String color, double tama�oPantalla, double ram, double memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tama�oPantalla = tama�oPantalla;
		this.ram = ram;
		this.memoria = memoria;
	}

	//Podemos tener m�s constructores con determinados atributos si fuera necesario
	//Pero convencionalmente con el Vacio y el de Todos los argumentos, es m�s que suficiente
	public Celular(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//M�TOSOS GETTERS Y SETTERS
	// M�todos Get - devuelven el valor de un atributo
	// M�todos Set - nos permiten asignar un valor a un atributo privado
	
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

	// -------------------------------------------
	
	// M�todo toString ()
	//nos ayuda a visualizar en forma String los atributos de mi objeto
	//permiti�ndome ver c�mo se compone mi objeto, como si de una radiograf�a se tratase
	
	// clic derecho + source + Generate toString
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tama�oPantalla="
				+ tama�oPantalla + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	

	// --------------------------------------------
	
	

}
