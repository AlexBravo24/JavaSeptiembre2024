package com;

//Heredar de la Clase Padre Calculadora a la Clase Hija Científica
//Para implementar los métodos de una interfase se utiliza la palabra reservada IMPLEMENTS
//y podemos implementar más de una interfase

public class Cientifica extends Calculadora implements InterfaseTermometro {

	public Cientifica () {
		
	}
	
	// Si no declaro algún atributo en mi Clase Científica,puedo generar el
	//constructor desde la clase Padre
	//Source + Generate Constructors from Superclass:
	public Cientifica(String marca, String color, int modelo) {
		super(marca, color, modelo);
	}
	

	// MÉTODO ABSTRACTO
	@Override
	public void sumar(double a, double b) {
		System.out.println("Suma: " + (a + b));

	}

	@Override
	public void restar(double a, double b) {
		System.out.println("Resta: " + (a - b));

	}

	@Override
	public void multiplicar(double a, double b) {
		System.out.println("Multiplicación: " + (a * b));

	}

	@Override
	public void dividir(double a, double b) {
		if (b != 0) {
			System.out.println("División: " + (a / b));
		} else {
			System.out.println("Error: División entre cero.");
		}
	}

	public void sumar(double a, double b, double c) {
		System.out.println("Suma de tres números: ");
	}

	public void restar(double a, double b, double c) {
		System.out.println("Resta de tres números: ");
	}

	public void multiplicar(double a, double b, double c) {
		System.out.println("Multiplicación de tres números: " + (a * b * c));
	}

	public void dividir(double a, double b, double c) {
		if (b != 0 && c != 0) {
			System.out.println("División de tres números: " + (a / b / c));
		} else {
			System.out.println("Error: División entre cero.");
		}

	}

	@Override
	public void tomarTemp() {
		System.out.println("Temperatura normal");
		
	}
	
	//¿De dónde adquieren/toman comportamientos los objetos?
	
	//Las clases/objetos toman comportamientos de 3 lados:
	//1. de métodos propios
	//2. de métodos heredados de clases convencionales, incluidos de clases abstractas
	//3. de interfases
	

}
