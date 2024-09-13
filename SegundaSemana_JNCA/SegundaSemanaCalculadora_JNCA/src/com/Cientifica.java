package com;

import java.util.Scanner;

//Para implementar los metodos de una interface
//se utiliza la palbra reservada implements
//y podemos implementar mas de una interface

public class Cientifica extends Calculadora implements ITermometro{

	public Cientifica() {}
	
	//Si no declaro algun atributo en mi clase cientifica
	//puedo generar el constructor desde la clase Padre
	//Source>Generate Constructors from Superclass
	
	
	
	public Cientifica(String marca, String color, String modelo) {
		super(marca, color, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(double a, double b, double c) {
		System.out.println("La suma es: " + (a+b+c));
		
	}

	//voy a crear un nuevo metodo sumar que no me pida parametros
	//pero que si me los solicite a traves de un Scanner el metodo
	public void sumar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce un primer numero para sumar");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("El resultado de la suma es: " + (a+b));
		
	}
	@Override
	public void restar(double a, double b, double c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicar(double a, double b, double c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dividir(double a, double b, double c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura Normal");
		
	}
	
	//¿De donde toman/adquieren comportamientos los objetos?
	
	//Las clases u objetos toman comportamientos de 3 lados:
	//1. de metodos propios
	//2. de metodo heredados de clases convencionales
	//incluidos de clases abstractas
	//3. de interfaces 

	

	
}
