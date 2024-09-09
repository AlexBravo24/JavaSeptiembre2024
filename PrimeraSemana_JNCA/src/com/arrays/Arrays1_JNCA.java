package com.arrays;

import java.util.Scanner;

public class Arrays1_JNCA {

	public static void main(String[] args) {
//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde

		int [] numeros = new int[10]; //declaro el array de 10 posiciones
		Scanner entrada = new Scanner(System.in); //creo un objeto para leer los datos introducidos
		System.out.println("introduce 10 numeros");
		for (int i = 0; i < numeros.length; i++) { //uso el bucle para iterar de 0 a 9 posiciones
			System.out.println("numero en la posicion" + i + ":");
			numeros[i] = entrada.nextInt(); //solicito los numeros los cuales
			                                //seran guardados en el array
		}
		entrada.close();
		System.out.println("indice y valor");
		for (int i = 0; i < numeros.length; i++) { //ahora se itera sobre el array o sea los numeros
			System.out.println("indice " + i + ": " + numeros[i]); //para cada indice i, imprime el valor
			                                  //almacenado en esa posicion del arrays
		}
		
		
		
		
	}

}
