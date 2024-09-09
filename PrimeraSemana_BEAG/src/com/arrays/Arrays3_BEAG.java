package com.arrays;

import java.util.Scanner;

public class Arrays3_BEAG {

	public static void main(String[] args) {

		/*
		 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres.
		 */

		System.out.println("------ EJERCICIO 3 ------");

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una frase:");
		
		//Para leer la frase ingresada
		String frase = entrada.nextLine(); 
		
		//Pasar la frase en un array de caracteres:
		char [] caract = frase.toCharArray();
		
		for (int i = 0; i < caract.length; i++) {
			System.out.println("El caracter " + (i+1) + " es: " + caract[i]);
			
		}

	}

}
