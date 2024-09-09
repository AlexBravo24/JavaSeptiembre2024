package com.condicionales;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales2_EMSR {

	public static void main(String[] args) {
		/*
		 * 2.Realiza un programa que pida un número por teclado y nos indique si es par  
           o impar.
		 */

		int numero1;

		System.out.println("============================");
		System.out.println("Ejercicio 2=================");
		System.out.println("============================");
		
        Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el numero para saber si es par o impar");
		numero1 = entrada.nextInt();
		
		int division = numero1 % 2;
		
		if (division==0) {
			System.out.println("El Numero: " + numero1 + " es par");
		} else {
			System.out.println("El Numero: " + numero1 + " es impar");
		}
		
	}

}
