package com.ciclos;

import java.util.Scanner;

public class ciclos3 {
	public static void main(String[] args) {
		String palabra = "";
		String resultado = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la palabra que deseas saber si es palindromo");
		palabra = entrada.next();
		for (int i = palabra.length()-1; i >= 0; i--) {
			resultado += palabra.charAt(i);
		}
		System.out.println(resultado);
		if (palabra.equalsIgnoreCase(resultado))
		{
			System.out.println("La palabra es palindromo");
		}
		else
		{
			System.out.println("la palabra no es palindromo");
		}
				
	}
}
