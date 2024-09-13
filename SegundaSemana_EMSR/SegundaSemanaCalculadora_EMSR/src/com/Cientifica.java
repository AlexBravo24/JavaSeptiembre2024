package com;
import java.util.Scanner;

// Para implementar los metodos de una interface
//se utiliza la palabra reservada implements
// y podemos implementar mas de una interface

public class Cientifica extends Calculadora implements ITermometro {
	
	
	

	public Cientifica() {
		super();
		// Si no declaro algun atributo en mi clase Cientifica
		//puedo generar el constructor desde la clase Padre
		//Sourca>Generate constructora from superclass
	}

	public Cientifica(String marca, String color, String fuenteenergia) {
		super(marca, color, fuenteenergia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("La suma es "+ (a+b));
	}

	// Voy a crear un nuevo metodo sumar que no me pida parametros
	//pero que si me los solicite a traves de un scanner el metodo
	
	public void sumar() {
		Scanner input = new Scanner(System.in );
		System.out.println("Introduce el primer numero para sumar ");
		double a = input.nextDouble();
		System.out.println("Introduce un segundo numero para sumar ");
		double b = input.nextDouble();
		System.out.println("El resultado de la suma es "+ (a+b));
	}
	
	@Override
	public void sumar(float a, float b, float c) {
		// TODO Auto-generated method stub
		System.out.println("La suma es "+ (a+b+c));
	}

	@Override
	public void restar(float a, float b, float c) {
		// TODO Auto-generated method stub
		System.out.println("La resta es "+ (a-b-c));
	}

	@Override
	public void restar(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("La resta es "+ (a-b));
	}

	@Override
	public void multiplicar(float a, float b, float c) {
		// TODO Auto-generated method stub
		
		System.out.println("La multiplicacion es "+ (a*b*c));
	}

	@Override
	public void multiplicar(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("La multiplicacion es "+ (a*b));
		
	}

	@Override
	public void dividir(float a, float b, float c) {
		// TODO Auto-generated method stub
		if (b==0) {
			System.out.println("Error ");
			
		}else if (c==0) {
			System.out.println("Error ");
		}else {
		System.out.println("La Division es "+ (a/b/c));
		}
		
	}

	@Override
	public void dividir(float a, float b) {
		// TODO Auto-generated method stub
		
		if (b==0) {
			System.out.println("Error ");	
		}else {
		System.out.println("La Division es "+ (a/b));
		}
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal ");
	}
	
	//¿De donde toman/adquieren comportamientos los objetos?

	// Las clases/ objetos toman comportamientos de 3 lados:
//	1. de metodos propios
//	2. de metodo heredados incluidos de clases abstractas
	//incluidos de clases abstractas
//	3. de interfaces

}
