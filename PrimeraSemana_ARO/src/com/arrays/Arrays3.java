package com.arrays;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase = entrada.next();
		int [] largocadena = new int [frase.length()];
		for (int i = 0; i < largocadena.length; i++) {
			largocadena [i] = frase.charAt(i);
			System.out.println(largocadena [i]);
		
	}

}
}