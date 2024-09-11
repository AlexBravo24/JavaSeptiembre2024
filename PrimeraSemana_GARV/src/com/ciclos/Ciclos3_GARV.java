package com.ciclos;

import java.util.Scanner;

public class Ciclos3_GARV {

	public static void main(String[] args) {

		
		// Realiza un programa para determinar si un String es palíndromo.
		
		System.out.println("==Ciclo 3==");
		
		Scanner s = new Scanner (System.in);
		String palabra;
		char[]palindromo;
		int izq, der;
		
		System.out.println("Ingresa la palabra");
		palabra = s.nextLine();
		palabra = palabra.toLowerCase();
		palindromo = palabra.toCharArray();

		
		izq = 0;
		der = palindromo.length - 1;
		
		while (izq<der) {
			if (palindromo [izq] == palindromo [der]) {
				der--;
				izq++;
			}else {
				System.out.println("La palabra no es un palíndromo");
				break;
			}
		}
		
		if (izq == der) {
			System.out.println("La palabra es un palíndromo");
		}
	

}
}