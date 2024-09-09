package com.ciclos;

import java.util.Scanner;

public class Ciclos2_EMTVC {

	public static void main(String[] args) {
		/*
		 * Programa un algoritmo que realice la tabla de multiplicar de un numero
		 * introducido desde teclado, hasta la iteración deseada por el usuario.
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 2 ============");
		System.out.println("====================================");
		int valor, j;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el valor a multiplicar: ");
		valor = entrada.nextInt();
		System.out.print("Hasta que numero quiere multiplicar: ");
		j = entrada.nextInt();
		
		for (int i = 0; i <= j; i++) {
			System.out.println(valor+" X "+i+" = "+ (valor*i));
		}
		entrada.close();
	}

}
