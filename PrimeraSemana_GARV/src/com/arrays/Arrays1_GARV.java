package com.arrays;

import java.util.Scanner;

public class Arrays1_GARV {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
 
		System.out.println("==Arrays 1==");
		int [] numeros = new int [10];
				
		Scanner entrada = new Scanner (System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un valor para la posicion ("+ (i+1) + "):");
			numeros[i] = entrada.nextInt();
		
		}
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Posición (" + (i+1)+ ") = " + numeros[i]);
		}
					
						
		}
}
		
		
		
				

