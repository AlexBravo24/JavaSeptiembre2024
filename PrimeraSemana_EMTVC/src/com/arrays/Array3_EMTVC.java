package com.arrays;

import java.util.Scanner;

public class Array3_EMTVC {
	public static void main(String[] args) {
		/*
		 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		 * caracteres.
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 3 ============");
		System.out.println("====================================");

		char [] letra= new char[100];
		char charac;
		int i=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese una frase(Maximo 100 caracteres): ");
		String frase= entrada.nextLine();
		if (!(frase.length()<100 || frase.length()>0 )) {
			System.out.println("La frase ingresada no es valida");
		}
		while (i< frase.length()) {
			charac= frase.charAt(i);
			letra[i]=charac;
			System.out.println("Dato "+ (i+1) +" --> " + letra[i]);
			i++;
		}
		entrada.close();
		
	}
}
