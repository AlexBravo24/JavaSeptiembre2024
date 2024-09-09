package com.ciclos;

import java.util.Scanner;

public class Ciclos3_EMTVC {
	public static void main(String[] args) {
		/*
		 * Realiza un programa para determinar si un String es palíndromo
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 3 ============");
		System.out.println("====================================");

		int valor, i=1, j=0;
		String fraseinv= "";
		Character charac;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la oracion a determinar: ");
		String fras = entrada.nextLine();
		String frase= fras.toLowerCase();
		valor= frase.length();
		
		while (i<=valor) {
			charac= frase.charAt(valor-i);
			if (!(charac.equals(' '))) {
				//System.out.println(charac);
				fraseinv=(fraseinv +charac);
			}
			i++;
		}
		
		String frases="";
		while (j<=(valor-1)) {
			charac= frase.charAt(j);
			if (!(charac.equals(' '))) {
				//System.out.println(charac);
				frases=(frases +charac);
			}
			j++;
		}
		
		//System.out.println(frases);
		if (fraseinv.equals(frases)) {
			System.out.println("La frase es un palindromo");
		}else {
			System.out.println("La frase no es un palindromo");
		}
		
        
		entrada.close();
	}
}
