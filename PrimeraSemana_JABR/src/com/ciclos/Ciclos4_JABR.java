package com.ciclos;

import java.util.Scanner;

public class Ciclos4_JABR {

	public static void main(String[] args) {

		// 4. Programa que reciba una frase y una letra por teclado.
		// Deberá retornar como resultado cuántas veces existe esa letra dentro de la
		// frase.
		// Si no existe, imprimir un mensaje “Carácter no encontrado”.

		String palabra;
		String letra;
		int contador = 0;

		System.out.println("Escriba una palabra: ");
		Scanner entrada = new Scanner(System.in);
		palabra = entrada.nextLine();
		System.out.println("Escriba una letra: ");
		letra = entrada.next();
		entrada.close();

		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == letra.charAt(0)) {
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("Caracter no encontrado");
		} else {
			System.out.println("El caracter se encontró: " + contador + " veces.");
		}

	}

}
