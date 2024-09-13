package com;

public class Celular {
	
	//ABSTRACCIÓN - Definir nuestro objeto 
	//de acuerdo a un contexto, con sus atributos
	//y comportamientos
	
	//Atributos o características de mis objetos a crear
	//ENCAPSULACIÓN - Protege los atributos, clases, métodos
	//de ciertos niveles de acceso o modificación
	//Se utilizan los modificadores private, public, protected, default
	private String marca;
	private String modelo;
	private String color;
	private double tamañoPantalla;
	private double ram;
	private double memoria;
	
	//Métodos constructores
	//Nos permiten iniciar a nuestros objetos con sus atributos
	//iniciados si así lo necesitamos
	
	//Constructor vacío
	//Nos permite iniciar o crear un objeto de esta clase
	//Sin necesidad de asignarle valores en un inicio a sus atributos
	
	public Celular() {
		
	}

	//Constructor con todos los argumentos
	//Me va a permitir crear un objeto pero con todos sus atributos iniciados al crearlo
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
	//Pero convencionalmente con el vacio y el de todos los argumentos es más que suficiente
	public Celular(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	
	//MÉTODOS GETTERS Y SETTERS
	//Métodos Get - devuelven el valor de un atributo
	//Métodos Set - nos permiten asignar un valor a un atributo privado
	
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

	
	//Método toString()
	//nos ayuda a visualizar en formato String los atributos de mi objeto
	//permitiendome ver cómo se compone mi objeto como si de una radiografía se
	//tratase
	
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamañoPantalla="
				+ tamañoPantalla + ", ram=" + ram + ", memoria=" + memoria + "]";
	}
	

}
