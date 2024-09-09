package com.arrays;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes


public class Arrays1_EMSR {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde. 
		System.out.println("============================");
		System.out.println("Ejercicio 1=================");
		System.out.println("============================");

		Scanner entrada = new Scanner(System.in );
		int[] numeros = new int [10];
		
		for (int i =0 ; i < numeros.length; i++) {
			System.out.println("Introduce el numero de la posicion " + i+ " :");
			numeros[i]= entrada.nextInt() ;
		}
		
		System.out.println("\nÍndice - Valor");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

	}

}
