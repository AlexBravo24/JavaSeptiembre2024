package com.arrays;

import java.util.Scanner;

public class Arrays2_BEAG {

	public static void main(String[] args) {
		
		/* 2. Crea un array de números de 100 posiciones, que contendrá los números del
		 * 1 al 100. Obtén la suma de todos ellos y la media.
		 */
		
		System.out.println("------ EJERCICIO 2 ------");

		// Array de 100 posiciones
		int[] numeros = new int[100];
		int suma = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		
		//La suma de los números
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i]; // += Se encarga de acumular la suma
		}
		
		//La media es:
		double media = (double) suma / numeros.length;
		
		System.out.println("La suma del 1 al 100 es: "+suma);
		System.out.println("La media es: "+ media);
	}

}
