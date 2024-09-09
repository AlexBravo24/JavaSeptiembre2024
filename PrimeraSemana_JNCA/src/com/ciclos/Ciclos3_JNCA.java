package com.ciclos;

import java.util.Scanner;

public class Ciclos3_JNCA {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo

		
		String palabra = "";
		String resultado = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra para saber si es palindromo");
		palabra = entrada.nextLine();
		entrada.close();
		for (int i = palabra.length()-1; i >= 0; i--) {
			resultado += palabra.charAt(i);
		}
		System.out.println(resultado);
		if (palabra.equalsIgnoreCase(resultado)) {
			System.out.println("La palabra es palindromo");
		} else {
			System.out.println("La palabra no es palindromo");
		}
	}

}
