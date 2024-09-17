package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{

	

	@Override
	public void sumar(int i) {
		Scanner entrada = new Scanner(System.in);
		int acum=0;
		for (int j = 1; j <= i; j++) {
			
			System.out.println("Ingrese el valor "+j+":");
			int valor=entrada.nextInt();
			acum=acum+valor;
			//System.out.println(acum);
		}
		System.out.println("La suma total es: " + acum);
		entrada.close();
	}
	
	public void restar(int i) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor 1:");
		int valor=entrada.nextInt();
		int acum=valor;
		for (int j = 2; j <= i; j++) {
			
			System.out.println("Ingrese el valor "+j+":");
			valor=entrada.nextInt();
			acum=acum-valor;
			//System.out.println(acum);
		}
		System.out.println("El resultado es: " + acum);
		entrada.close();
	}
	
	public void dividir(int i) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor 1:");
		int valor=entrada.nextInt();
		int acum=valor;
		for (int j = 2; j <= i; j++) {
			
			System.out.println("Ingrese el valor "+j+":");
			valor=entrada.nextInt();
			acum=acum/valor;
			//System.out.println(acum);
		}
		System.out.println("El resultado es: " + acum);
		entrada.close();
	}
	
	public void multiplicar(int i) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el valor 1:");
		int valor=entrada.nextInt();
		int acum=valor;
		for (int j = 2; j <= i; j++) {
			
			System.out.println("Ingrese el valor "+j+":");
			valor=entrada.nextInt();
			acum=acum*valor;
			//System.out.println(acum);
		}
		System.out.println("El resultado es: " + acum);
		entrada.close();
	}
}
