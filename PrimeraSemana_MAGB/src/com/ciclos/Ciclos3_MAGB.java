package com.ciclos;

import java.util.Scanner;

public class Ciclos3_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Realiza un programa para determinar si un String es palíndromo. 
		
		Scanner palabra = new Scanner(System.in);
		String reverso = "";
		System.out.println("Introduce una palabra:");
		
		String pal = palabra.next().toLowerCase();
		
		//ciclo para revertir la palabra
		for (int j = pal.length()-1; j >= 0; j--) {
			reverso = reverso + pal.charAt(j);
		}
		
		System.out.println("La palabra invertida es:" + reverso);
		
			if (pal.equals(reverso)) {
				System.out.println("Por lo tanto, es palindromo");
			}else {
				System.out.println("Por lo tanto, no es Palndrimo");
			}
		
	
		palabra.close();
	}

}
