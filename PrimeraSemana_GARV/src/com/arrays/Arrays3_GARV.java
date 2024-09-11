package com.arrays;

import java.util.Scanner;

public class Arrays3_GARV {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.

		System.out.println("==Array 3==");
		
		Scanner texto = new Scanner (System.in);
		System.out.println("Ingresa el texto");
		String texto1 = texto.nextLine();
		char arreglo[] = texto1.toCharArray();
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Posición " + (i+1)+ (" : ") + arreglo[i]);
		}
		
		
		
	}

}
