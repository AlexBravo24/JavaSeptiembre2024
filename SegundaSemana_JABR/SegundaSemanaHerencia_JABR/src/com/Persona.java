package com;

public abstract class Persona {
	
	//Esta clase va a ser una clase Padre
	//porque le heredar� los atributos y m�todos a otra
	
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
	
	//M�TODOS PROPIOS
	//Acciones que pueden ejecutar nuestros objetos
	
	
	//M�TODOS SIN RETORNO - void
	//Ejecutan algo sin necesidad de devolver el valor de un tipo de dato
	
	public void comer () {
		//Cuando utilice est� m�todo a trav�s de un objeto persona
		//se realizar� lo siguiente
		System.out.println("Estoy comiendo....");
	}
	
	
	//M�TODO CON RETORNO
	//Debe retornar el tipo de dato que el m�todo declara
	
	public String saludar () {
		//Lo queremos que est� m�todo ejecute va aqu� pero al final debe
		//retornar el tipo de dato que especifica
		String saludo = "Hola Buen D�a";
		
		return saludo;
	}
	
	//M�TODO POLIMORFICO
	//El POLIMORFISMO es otro pilar de la POO
	//Se ve m�s comunmente en m�todos que pueden tener el mismo nombre pero ejecutarse
	//de forma distinta
	//Esto se lleva a cabo gracias a la sobrecarga de argumentos para que podamos tener
	//sobrecarga de m�todos
	
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
	//vamos a declarar un m�todo abstracto que solo Empleado pueda definir
	
	//Un m�todo abstracto es aquel que nos dice QU� se va a hacer pero no C�MO
	
	//El C�MO se va a hacer ser� definido por las clases hijas que se ver�n obligadas
	//a definir la l�gica del m�todo
	
	public abstract void trabajar();
	
}
