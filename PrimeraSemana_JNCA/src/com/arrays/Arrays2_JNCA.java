package com.arrays;

public class Arrays2_JNCA {

	public static void main(String[] args) {
//		2. Crea un array de números de 100 posiciones, que contendrá los números del 
//		1 al 100. Obtén la suma de todos ellos y la media.

		int [] numeros = new int[100]; //declaro el array de 100 posiciones
		for (int i = 0; i < numeros.length; i++) { //uso el bucle para iterar de 0 a 100 posiciones
			numeros[i] = i + 1; //El array tendra numeros del 1 al 100
		}
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) { 
			suma = suma + numeros[i]; //se suman todos los valores
		}
		double media = suma / numeros.length;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("numero en la posicion " + i + "= " + numeros[i]);
		}
		
		System.out.println("La suma de todos los numeros es: " + suma);
		System.out.println("La media de todos los numeros es: " + media);
	}

}
