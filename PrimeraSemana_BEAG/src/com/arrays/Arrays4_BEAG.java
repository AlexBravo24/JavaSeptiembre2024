package com.arrays;

public class Arrays4_BEAG {

	public static void main(String[] args) {

		/*
		 * 4. Dado un array de números de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero
		 * con los valores invertidos, es decir, que el segundo array deberá tener los
		 * valores {5,4,3,2,1}
		 */

		System.out.println("------ EJERCICIO 4 ------");
		
		//Array originar
		int [] array1 = {1, 2, 3, 4, 5};
		
		//Almacenar los valores invertidos
		int[] array2= new int[array1.length];
		
		//Invertir el array
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[array1.length-1-i];
		}
		
		System.out.println("De acuerdo con el array 1 2 3 4 5.");
		System.out.println("Los números invertidos son: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
	}

}
