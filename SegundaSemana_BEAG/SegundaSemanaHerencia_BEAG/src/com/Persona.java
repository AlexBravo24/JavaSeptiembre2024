package com;

public abstract class Persona {

	// Esta clase ca a ser una "Clase Padre", porque le heredar� los
	// atributos y m�todos a otra

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

	// -------------------------------------------------

	// M�TODOS PROPIOS
	// Acciones que pueden ejecutar nuestros objetos

	// Existen 2: M�todos sin retorno y con retorno

	// 1. M�TODOS SIN RETORNO - void
	// Ejecutan algo sin necesidad de devolver el valor de un tipo de dato

	public void comer() { // acci�n que hace una persona
		// Lo que queremos que se ejecute lo escribimos aqu�
		// Cuando utilice este m�todo a trav�s de un objeto persona, se realizar�
		// lo siguiente:
		System.out.println("Estoy comiendo...");
	}

	// 2. M�TODO CON RETORNO
	// Debe de retornar el tipo de dato que el m�todo declara

	public String saludar() {
		// Lo que queremos que este m�todo ejecute va aqu� pero al final debe de
		// retornar el tipo de dato que se especifica
		String saludo = "Hola, buen d�a";

		return saludo;
	}

	// ---------------------------------------------------

	// M�TODO POLIM�RFICO
	// El POLIMORFISMO es otro pilar de la POO
	// Se ve m�s com�n en m�todos que pueden tener el mismo nombre pero ejecutarse
	// de forma distinta
	// Esto se lleva a cabo gracias a la sobrecarga de argumentos para que podamos
	// tener sobrecarga de m�todos
	
	public void comer(String comida) { //Todo lo que va entre ( ), comida, se le coonoce como argumentos
		
		System.out.println("Estoy comiendo "+ comida);
	}

	//Entre m�s argumentos tenga, se le conoce como "sobrecarga de argumentos"
	//"Sobrecarga de m�todos" ser�a "comer", donde se ejecuta de formas distintas
	public void comer (String comida, int raciones) { //Los argumentos ser�a: comida y raciones
		
		System.out.println("Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	//----------------------------------------------------------------------
	
	//M�TODO ABSTRACTO
	
	//Aprovechando que le estamos heredando esto a Empleado
	//vamos a declarar un M�TODO ABSTRACTO que s�lo Empleado pueda definir
	
	//Un m�todo abstracto es aquel que nos dice QU� se va a hacer pero no C�MO
	
	//El C�MO se va a hacer ser� definido por las clases hijas que se ver�n obligadas
	//a definir la l�gica del m�todo
	
	public abstract void trabajar();
	
	
	
}
