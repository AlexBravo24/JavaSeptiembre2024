package com.arrays;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = new int [10];
		int i;
int datosArray;
		Scanner entrada = new Scanner(System.in);
		for (i = 0; i < 10; i++) {
			System.out.println("Escribe el valor " + (i+1));
			datosArray = entrada.nextInt();
			numeros [i] = datosArray;
			
		}
		for (i = 0; i < 10 ; i++) {
			System.out.println("El indice " + i + " contiene el valor " + numeros [i]);
		}

	}

}
