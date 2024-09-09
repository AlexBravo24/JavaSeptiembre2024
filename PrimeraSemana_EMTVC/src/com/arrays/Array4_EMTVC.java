package com.arrays;

public class Array4_EMTVC {

	public static void main(String[] args) {
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero
		 * con los valores invertidos, es decir, que el segundo array deberá tener los
		 * valores {5,4,3,2,1}.
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 4 ============");
		System.out.println("====================================");

		int i;
		int[] numeros = { 1, 2, 3, 4, 5 };
		int[] numeros2 = new int[5];
		System.out.println("Array 1");
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Dato " + (i + 1) + " --> " + numeros[i]);
		}
		System.out.println("Array 2");
		for (i = 0; i < numeros2.length; i++) {
			numeros2[i]= numeros[(4-i)];
			System.out.println("Dato " + (i+1) + " --> " + numeros2[i]);
			
		}
	}

}
