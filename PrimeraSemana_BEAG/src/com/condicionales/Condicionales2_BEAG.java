package com.condicionales;

import java.util.Scanner;

public class Condicionales2_BEAG {

	public static void main(String[] args) {

		/* 2.Realiza un programa que pida un n�mero por teclado y nos indique si es paro
		 * impar.
		 */

		// TEMA: ENTRADA DE DATOS
		System.out.println("------ EJERCICIO 2 ------");

		int numero;

		Scanner entrada = new Scanner(System.in); // System.in va a permitir introducir valores desde el teclado

		System.out.println("Ingresa un n�mero: ");
		numero = entrada.nextInt();

		//TEMA: ESTRUCTURAS CONTROL y M�TODO STRING: Operador M�dulo
		if (numero%2==0) {
			System.out.println("El n�mero " + numero +" es par");
		} else { // Si no es, entonces
			System.out.println("El n�mero " + numero +" es impar");
		}
		
	}
	
}


