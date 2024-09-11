package com.ciclos;

import java.util.Scanner;

public class Ciclos4_GARV {

	public static void main(String[] args) {
		// Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		//“Carácter no encontrado”. 

		System.out.println("==Ciclo 4==");

		int i = 0; 
		int c = 0;

		Scanner frase = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String fra = frase.nextLine().toLowerCase();
		
		Scanner letra = new Scanner (System.in);
		System.out.println("Introduce la letra a contar");
		char letra1 = (char) fra.indexOf(c);
		while (i<fra.length()) {
		if (fra.charAt(i)==letra1) {
			c++;
			i++;
		System.out.println("La frase tiene " + c + " letras " + letra1);
		}else {
	
}

	}
	}
		
}

