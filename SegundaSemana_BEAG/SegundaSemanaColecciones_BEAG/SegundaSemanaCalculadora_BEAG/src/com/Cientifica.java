package com;

//Heredar de la Clase Padre Calculadora a la Clase Hija Cient�fica
//Para implementar los m�todos de una interfase se utiliza la palabra reservada IMPLEMENTS
//y podemos implementar m�s de una interfase

public class Cientifica extends Calculadora implements InterfaseTermometro {

	public Cientifica () {
		
	}
	
	// Si no declaro alg�n atributo en mi Clase Cient�fica,puedo generar el
	//constructor desde la clase Padre
	//Source + Generate Constructors from Superclass:
	public Cientifica(String marca, String color, int modelo) {
		super(marca, color, modelo);
	}
	

	// M�TODO ABSTRACTO
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
		System.out.println("Multiplicaci�n: " + (a * b));

	}

	@Override
	public void dividir(double a, double b) {
		if (b != 0) {
			System.out.println("Divisi�n: " + (a / b));
		} else {
			System.out.println("Error: Divisi�n entre cero.");
		}
	}

	public void sumar(double a, double b, double c) {
		System.out.println("Suma de tres n�meros: ");
	}

	public void restar(double a, double b, double c) {
		System.out.println("Resta de tres n�meros: ");
	}

	public void multiplicar(double a, double b, double c) {
		System.out.println("Multiplicaci�n de tres n�meros: " + (a * b * c));
	}

	public void dividir(double a, double b, double c) {
		if (b != 0 && c != 0) {
			System.out.println("Divisi�n de tres n�meros: " + (a / b / c));
		} else {
			System.out.println("Error: Divisi�n entre cero.");
		}

	}

	@Override
	public void tomarTemp() {
		System.out.println("Temperatura normal");
		
	}
	
	//�De d�nde adquieren/toman comportamientos los objetos?
	
	//Las clases/objetos toman comportamientos de 3 lados:
	//1. de m�todos propios
	//2. de m�todos heredados de clases convencionales, incluidos de clases abstractas
	//3. de interfases
	

}
