package com.arrays;

import java.util.Scanner;

public class Array3_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.

		String palabra;
		Scanner escaner = new Scanner(System.in);
		System.out.println("Ingresa una palabra:");
		palabra=escaner.next();
		char [] oracion = new char[palabra.length()];
		
		for (int j = 0; j < palabra.length(); j++) {
			oracion[j] = palabra.charAt(j);
		}
		
		for (int i = 0; i < oracion.length; i++) {
			System.out.println(oracion[i]);
		}
		
		escaner.close();
	}

}
