package com.ciclos;

import java.util.Scanner;

public class Ciclos11_BEAG {

	public static void main(String[] args) {

		/*
		 * 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
		 * teclado el ancho y el alto. Ejemplo: 8 x 8
		 */

		System.out.println("------ EJERCICIO 11 ------");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el ancho de la figura: ");
		int ancho = entrada.nextInt();

		System.out.println("Introduce el alto de la figura: ");
		int alto = entrada.nextInt();

		// Corroborar que las dimensiones sean valores válidos
		if (ancho <= 0 || alto <= 0) {
			System.out.println("Los valores deben ser números enteros positivos");
			return;
		}

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
