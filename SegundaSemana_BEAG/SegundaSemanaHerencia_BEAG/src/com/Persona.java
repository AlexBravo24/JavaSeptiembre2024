package com;

public abstract class Persona {

	// Esta clase ca a ser una "Clase Padre", porque le heredará los
	// atributos y métodos a otra

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

	// MÉTODOS PROPIOS
	// Acciones que pueden ejecutar nuestros objetos

	// Existen 2: Métodos sin retorno y con retorno

	// 1. MÉTODOS SIN RETORNO - void
	// Ejecutan algo sin necesidad de devolver el valor de un tipo de dato

	public void comer() { // acción que hace una persona
		// Lo que queremos que se ejecute lo escribimos aquí
		// Cuando utilice este método a través de un objeto persona, se realizará
		// lo siguiente:
		System.out.println("Estoy comiendo...");
	}

	// 2. MÉTODO CON RETORNO
	// Debe de retornar el tipo de dato que el método declara

	public String saludar() {
		// Lo que queremos que este método ejecute va aquí pero al final debe de
		// retornar el tipo de dato que se especifica
		String saludo = "Hola, buen día";

		return saludo;
	}

	// ---------------------------------------------------

	// MÉTODO POLIMÓRFICO
	// El POLIMORFISMO es otro pilar de la POO
	// Se ve más común en métodos que pueden tener el mismo nombre pero ejecutarse
	// de forma distinta
	// Esto se lleva a cabo gracias a la sobrecarga de argumentos para que podamos
	// tener sobrecarga de métodos
	
	public void comer(String comida) { //Todo lo que va entre ( ), comida, se le coonoce como argumentos
		
		System.out.println("Estoy comiendo "+ comida);
	}

	//Entre más argumentos tenga, se le conoce como "sobrecarga de argumentos"
	//"Sobrecarga de métodos" sería "comer", donde se ejecuta de formas distintas
	public void comer (String comida, int raciones) { //Los argumentos sería: comida y raciones
		
		System.out.println("Estoy comiendo " + raciones + " raciones de " + comida);
	}
	
	//----------------------------------------------------------------------
	
	//MÉTODO ABSTRACTO
	
	//Aprovechando que le estamos heredando esto a Empleado
	//vamos a declarar un MÉTODO ABSTRACTO que sólo Empleado pueda definir
	
	//Un método abstracto es aquel que nos dice QUÉ se va a hacer pero no CÓMO
	
	//El CÓMO se va a hacer será definido por las clases hijas que se verán obligadas
	//a definir la lógica del método
	
	public abstract void trabajar();
	
	
	
}
