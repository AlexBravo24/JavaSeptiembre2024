package com;

import java.util.Scanner;

//Para implementar los métodos de una interface
//se utiliza la palabra reservada implements
//y podemos implementar más de una interface

public class Cientifica extends Calculadora implements ITermometro{
	
	public Cientifica() {}
	
	//Si no declaro algún atributo en mi clase Cientifica
	//puedo generar el constructor desde la clase Padre
	//Source>Generate Constructors From Superclass
	
	public Cientifica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(double a, double b) {
		System.out.println("La suma es: " + (a+b));
		
	}
	
	//Voy a crear un nuevo método sumar que no me pida parametros
	//pero que si mes los solicite a través de un Scanner el método
	public void sumar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un primer número para sumar");
		double a = input.nextDouble();
		System.out.println("Introduce un segundo número para sumar");
		double b = input.nextDouble();
		
		System.out.println("El resultado de la suma es: " + (a+b));
	}
	

	@Override
	public void restar(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	//¿De donde toman/adquieren comportamientos los objetos?
	
	//Las clases/objetos toman comportamientos de 3 lados:
	//1. de métodos propios
	//2. de métodos heredados de clases convencionales
	//incluidos de clases abstractas
	//3. de interfaces
	
	//Ejemplo de método abstracto
	
	//Ejemplo de .substring()

}
