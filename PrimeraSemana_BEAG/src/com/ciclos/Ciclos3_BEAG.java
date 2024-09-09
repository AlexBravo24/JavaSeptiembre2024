package com.ciclos;

import java.util.Scanner;

public class Ciclos3_BEAG {

	public static void main(String[] args) {

		/* 3. Realiza un programa para determinar si un String es palíndromo.
		 */

		System.out.println("------ EJERCICIO 3 ------");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa una palabra para determinar si es palíndromo: ");
		String cadena = entrada.nextLine();

		// Convertir la cadena a minúsculas para hacer la comparación
		cadena = cadena.toLowerCase();

		// Verificar si la cadena es palíndromo
		boolean esPalindromo = true;

		int longitud = cadena.length();
		for (int i = 0; i < longitud / 2; i++) {
			if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
				esPalindromo = false;
				break;
			}
		}

		if (esPalindromo) {
			System.out.println("La palabra es palíndromo.");
		} else {
			System.out.println("La palabra no es palíndromo.");
		}

	}

}
