package com;

public abstract class Persona {

	//Esta clase va a ser una clase Padre
	//porque le heredara los atributos y metodos a otra
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}

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
	
	//METODOS PROPIOS
	//Acciones que pueden ejecutar nuestros objetos
	
	//METODOS SIN RETORNO - void
	//Ejecutan algo sin necesidad de devolver el valor de un tipo de dato
	
	public void comer() {
		//Cuando utilize este metodo a traves de un objeto persona
		//se realizara lo siguiente
		System.out.println("Estoy comiendo....");
	}
	
	//METODO CON RETORNO
	//Debe retornar el tipo de dato que el metodo declara
	
	public String saludar () {
	    //Lo que queremos que este metodo ejecute va aqui pero al final debe
		//retornar el tipo de dato que especifica
		String saludo = "Hola buen dia";
		
	return saludo;
	}
	
	//METODO POLIMORFICO
	//El POLIMORFISMO es otro pilar de la POO
	//Se ve mas comunmente en metodos que pueden tener el mismo nombre pero ejecutarse
	//de forma distinta
	//Esto se lleva a cabo gracias a la sobrecarga de argumentos para que podamos tener
	//sobrecarga de metodos
	
	public void comer (String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
	
	public void comer(String comida, int raciones) {
		System.out.println("Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	//Aprovechando que le estamos heredando esto a Empleado
	//Vamos a declarar un metodo abstracto que solo Empleado puedo definir
	
	//Un metodo abstracto es aquel que nos dice QUE se va a hacer pero no COMO
	
	//EL COMO se va a hacer sera definido por las clases hijas que se veran obligadas
	//a definir la logica del metodo
	
	public abstract void trabajar();
	
	
	
	
}
	
	