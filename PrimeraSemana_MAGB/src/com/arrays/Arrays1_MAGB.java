package com.arrays;

import java.util.Scanner;

public class Arrays1_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		int numero;
		Scanner escaner = new Scanner(System.in);
		int [] numeros = new int[10];
		
		System.out.println("ingresa 10 numeros:");
		for (int i = 0; i < 10; i++) {
			numero=escaner.nextInt();
			numeros[i]=numero;
		}
		System.out.println("indice");
		
		for (int a = 0; a < numeros.length; a++) {
			System.out.println(a+".-"+numeros[a]);
		}
		escaner.close();
	}

}
