package com;

public abstract class Persona {
	
	//Esta clase va a ser una clase Padre
	//porque le heredará los atributos y métodos a otra
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	//MÉTODOS PROPIOS
	//Acciones que pueden ejecutar nuestros objetos
	
	
	//MÉTODOS SIN RETORNO - void
	//Ejecutan algo sin necesidad de devolver el valor de un tipo de dato
	
	public void comer () {
		//Cuando utilice esté método a través de un objeto persona
		//se realizará lo siguiente
		System.out.println("Estoy comiendo....");
	}
	
	
	//MÉTODO CON RETORNO
	//Debe retornar el tipo de dato que el método declara
	
	public String saludar () {
		//Lo queremos que esté método ejecute va aquí pero al final debe
		//retornar el tipo de dato que especifica
		String saludo = "Hola Buen Día";
		
		return saludo;
	}
	
	//MÉTODO POLIMORFICO
	//El POLIMORFISMO es otro pilar de la POO
	//Se ve más comunmente en métodos que pueden tener el mismo nombre pero ejecutarse
	//de forma distinta
	//Esto se lleva a cabo gracias a la sobrecarga de argumentos para que podamos tener
	//sobrecarga de métodos
	
	public void comer(String comida) {
		
		System.out.println("Estoy comiendo " + comida);
		
	}
	
	public void comer(String comida, int raciones) {
		System.out.println("Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	public void comer(String comida, String restaurante) {
		
		System.out.println("Estoy comiendo " + comida + " en " + restaurante);
		
	}
	
	//Aprovechando que le estamos heredando esto a Empleado
	//vamos a declarar un método abstracto que solo Empleado pueda definir
	
	//Un método abstracto es aquel que nos dice QUÉ se va a hacer pero no CÓMO
	
	//El CÓMO se va a hacer será definido por las clases hijas que se verán obligadas
	//a definir la lógica del método
	
	public abstract void trabajar();
	
}
