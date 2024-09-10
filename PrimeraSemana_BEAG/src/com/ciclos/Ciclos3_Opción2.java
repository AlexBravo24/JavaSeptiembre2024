package com.ciclos;

import java.util.Scanner;

public class Ciclos3_Opción2 {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.

		// Necesito un scanner para introducir la palabra por teclado, de ser el caso
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa una palabra");
		String original = entrada.nextLine(); // declaro una variable para guardar el String original
		String reversa = "";// declaro e inicio una variable para armar una reversa de la palabra
							// y poder compararla

		// iterando al reves para armar la reversa
		// mi variable de control es la longitud del String menos 1, porque necesito
		// saber la posición del caracter a extraer
		// mientras esa longitud sea mayor o igual a 0, entonces indico
		// un decremento porque itero del final hacia atrás
		// y voy guardando cada caracter en el string reversa uno a uno

		for (int i = original.length() - 1; i >= 0; i--) {
			reversa = reversa + original.charAt(i);
		}

		System.out.println(original);
		System.out.println(reversa);

		// Solicito en pantalla la impresion de la reversa
		// y utilizo la funcion replace para remplazar los espacios vacíos
		// para que los caracteres queden juntos
		System.out.println("reversa: " + reversa.replace(" ", ""));

		// Procedo a evaluar y comparar si la cadena original sin espacios es igual a la
		// cadena armada en reversa sin espacios
		// Si son iguales, la palabra es palindromo
		// Si no es así, entonces no es palindromo
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");

		} else
			System.out.println("No es palindromo");

	}

}
