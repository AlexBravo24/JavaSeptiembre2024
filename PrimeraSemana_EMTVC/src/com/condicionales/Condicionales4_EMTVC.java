package com.condicionales;

import java.util.Scanner;

public class Condicionales4_EMTVC {
	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 4 ============");
		System.out.println("====================================");


		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese una oracion: ");
		String cadena1 = entrada.nextLine();
		String cadena2 = cadena1.toLowerCase();
		
		if(cadena2.equals(cadena1)) {
			System.out.println("La oracion solo tiene letras minusculas");
		}else {
			System.out.println("La oracion contiene letras mayusculas");
		}
entrada.close();
	}
}
