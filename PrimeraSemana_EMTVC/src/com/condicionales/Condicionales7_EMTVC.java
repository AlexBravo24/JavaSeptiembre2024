package com.condicionales;

import java.util.Scanner;

public class Condicionales7_EMTVC {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido
		 * al lanzar un dado de seis caras y muestre por pantalla el número en letras
		 * (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las caras
		 * opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. Nota 2:
		 * Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará
		 * el mensaje: “ERROR: número incorrecto”.
		 */
		
		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 7 ============");
		System.out.println("====================================");

		int cara;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la cara obtenida: ");
		cara = entrada.nextInt();
		
		switch (cara) {
		case 1:
			System.out.println("La cara opuesta es: 6");
			break;
		case 2:
			System.out.println("La cara opuesta es: 5");
			break;
		case 3:
			System.out.println("La cara opuesta es: 4");
			break;
		case 4:
			System.out.println("La cara opuesta es: 3");
			break;
		case 5:
			System.out.println("La cara opuesta es: 2");
			break;
		case 6:
			System.out.println("La cara opuesta es: 1");
			break;
		default:
			System.out.println("ERROR: Numero Incorrecto");
			break;
		}
		
		
		entrada.close();
	}

}
