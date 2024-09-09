package com.arrays;

import java.util.Scanner;

public class Arrays3_JNCA {

	public static void main(String[] args) {
//		3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//		caracteres
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = entrada.nextLine();
		char[] caracteres = frase.toCharArray();
		System.out.println("Array de caracteres: ");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("El caracter en la posicion " + i + ":" + caracteres[i]);
		}
	}

}
