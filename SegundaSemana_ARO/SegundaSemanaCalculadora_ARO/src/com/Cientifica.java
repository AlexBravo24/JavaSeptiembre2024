package com;

import java.util.Scanner;
//para implementar los metodos de una interface
//se utiliza la palabra reservada implements
//y podemos implementar mas de una
public class Cientifica extends Calculadora implements ITermometro {
public Cientifica() {

// TODO Auto-generated constructor stub
}
	// TODO Auto-generated constructor stub
//si no declaro algun atributo en clase cientifica 
//puedo generar el constructor desde la clase padre
//sourse>generate desde super clase
double a;
double b;

	public Cientifica(String marca, String modelo, String color) {
	super(marca, modelo, color);
	// TODO Auto-generated constructor stub
}

	@Override
	public void sumar(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("la suma es: " + (a+b));
	}
public void sumar() {
	Scanner input = new Scanner(System.in);
	System.out.println("introduce el primer numero a sumar");
	a = input.nextDouble();
	System.out.println("introduce el segundo numero a sumar");
	b = input.nextDouble();
	System.out.println("la suma de " + a + "+ " + b + "es igual a: " + (a+b));
}
	@Override
public void restar() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("introduce el primer numero a restar");
		a = input.nextDouble();
		System.out.println("introduce el segundo numero a restar");
		b = input.nextDouble();
		System.out.println("la resta de " + a + "+ " + b + "es igual a: " + (a-b));	
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("introduce el primer numero a multiplicar");
		a = input.nextDouble();
		System.out.println("introduce el segundo numero a multiplicar");
		b = input.nextDouble();
		System.out.println("la multiplicacion de " + a + "+ " + b + "es igual a: " + (a*b));
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("introduce el primer numero a dividir");
		a = input.nextDouble();
		System.out.println("introduce el segundo numero a dividir");
		b = input.nextDouble();
		System.out.println("la division de " + a + "+ " + b + "es igual a: " + (a/b));
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

	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("temperatura normal");
	}
//las clases/objetos toman comportamientos de 3 lados
	//1 de metodos propios
	//2 de metodos herados incluidos abstractos
	//3 de interfaces
}
