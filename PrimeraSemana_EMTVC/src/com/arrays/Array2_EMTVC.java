package com.arrays;

public class Array2_EMTVC {
	public static void main(String[] args) {
		/*
		 * Crea un array de números de 100 posiciones, que contendrá los números del 1
		 * al 100. Obtén la suma de todos ellos y la media
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 2 ============");
		System.out.println("====================================");

		int  i = 0;
		double num=0,media;
		int[] numeros = new int[100];
		
		while(i<100) {
			numeros[i]= i+1;
			System.out.println("Dato "+ (i+1) +" --> " + numeros[i]);
			num= num + numeros[i];
			i++;		
		}
		
		System.out.println("La suma del total es: " + num);
		media=(num/numeros.length);
		System.out.println("Su media es: "+media );

	}
}
