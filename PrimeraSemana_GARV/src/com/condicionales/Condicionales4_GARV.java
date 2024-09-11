package com.condicionales;

import java.util.Scanner;

public class Condicionales4_GARV {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene 
		//letras mayúsculas.

		System.out.println("====Ejercicio 4====");
				
		Scanner texto = new Scanner (System.in);
		System.out.println("Escribe tu texto");
		String cadena = texto.nextLine();
		String cadena1 = cadena.toLowerCase();
		
		if (cadena1.equals(cadena)) {
			System.out.println("El texto contiene únicamente letras minísculas");
		} else {
			System.out.println("El texto contiene letras mayúsculas");
		}
		
		}
		
	}


