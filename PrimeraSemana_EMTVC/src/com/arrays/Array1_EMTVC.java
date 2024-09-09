package com.arrays;

import java.util.Scanner;

public class Array1_EMTVC {
	public static void main(String[] args) {
		/*
		 * Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 1 ============");
		System.out.println("====================================");

		int num, i=0;
		int [] numeros = new int[10];
		
		Scanner entrada = new Scanner(System.in);
		
		
		while(i<10) {
			System.out.print("ingrese el Dato "+ (i+1) +" --> ");
			num = entrada.nextInt();
			numeros[i]=num;
			i++;
			
		}
		entrada.close();
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Dato "+ (i+1) +" --> "+numeros[i]);
		}
		
		
	}
}
