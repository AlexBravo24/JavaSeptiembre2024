package com.ciclos;

import java.util.Scanner;

public class Ciclos3_BEAG {

	public static void main(String[] args) {

		/* 3. Realiza un programa para determinar si un String es pal�ndromo.
		 */

		System.out.println("------ EJERCICIO 3 ------");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa una palabra para determinar si es pal�ndromo: ");
		String cadena = entrada.nextLine();

		// Convertir la cadena a min�sculas para hacer la comparaci�n
		cadena = cadena.toLowerCase();

		// Verificar si la cadena es pal�ndromo
		boolean esPalindromo = true;

		int longitud = cadena.length();
		for (int i = 0; i < longitud / 2; i++) {
			if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
				esPalindromo = false;
				break;
			}
		}

		if (esPalindromo) {
			System.out.println("La palabra es pal�ndromo.");
		} else {
			System.out.println("La palabra no es pal�ndromo.");
		}

	}

}
