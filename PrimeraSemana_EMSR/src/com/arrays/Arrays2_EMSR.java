package com.arrays;

public class Arrays2_EMSR {

	public static void main(String[] args) {
		// 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		// 1 al 100. Obt�n la suma de todos ellos y la media.
		
		System.out.println("============================");
		System.out.println("Ejercicio 2=================");
		System.out.println("============================");
		
		int i2 =0;
		float promedio=0; 
		int[] numeros = new int [100];
		
		
		
		for (int i =0 ; i < numeros.length; i++) {
			numeros[i]=i+1;
			i2= i2 + numeros[i];
		}

		System.out.println("La suma de los numeros del 1 al 100 es: " + i2 );
		promedio = i2/100;
		System.out.println("La media  es: " + promedio );
		
	}

}
