package com.arrays;

import java.util.Scanner;

public class Arrays1_BEAG {

	public static void main(String[] args) {

		/*
		 * 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		 * Muestra por consola el �ndice y el valor al que corresponde.
		 */

		System.out.println("------ EJERCICIO 1 ------");

		Scanner entrada = new Scanner(System.in);

		// Array de 10 posiciones
		int[] numeros = new int[10];


		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa 10 n�meros enteros: ");
			numeros[i] = entrada.nextInt();
		}

		for (int j = 0; j < numeros.length; j++) {
			System.out.println("El n�mero " + numeros[j] + " esta en la posici�n " + j); 
			
		}

	}

}
