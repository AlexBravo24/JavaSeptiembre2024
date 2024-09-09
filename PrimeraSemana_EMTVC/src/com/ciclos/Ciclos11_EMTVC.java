package com.ciclos;

import java.util.Scanner;

public class Ciclos11_EMTVC {
	public static void main(String[] args) {
		/*
		 * 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde
		 * teclado el ancho y el alto. Ejemplo: 8 x 8
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 11 ============");
		System.out.println("====================================");
		int x, y;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el ancho del cuadrado(debe ser mayor a 0): ");
		x = entrada.nextInt();
		System.out.print("Ingrese el alto del cuadrado(debe ser mayor a 0): ");
		y = entrada.nextInt();
		
		String ancho="";
		
		for (int j = 0; j < x; j++) {
			ancho= ancho+ "* ";
		}
		for (int i = 0; i < y; i++) {
			System.out.println(ancho);
		}
		entrada.close();
	}
}
