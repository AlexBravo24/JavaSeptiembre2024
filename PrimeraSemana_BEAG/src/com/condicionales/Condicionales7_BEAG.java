package com.condicionales;

import java.util.Scanner;

class Condicionales7_BEAG {

	public static void main(String[] args) {

		// ES COMO EL D�A DE LA SEMANA
		/*
		 * 7. Realiza un programa que pida por teclado el resultado (dato entero)
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en
		 * letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		 * caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se
		 * mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		 */

		System.out.println("------ EJERCICIO 7 ------");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el n�mero obtenido al lanzar el dado: ");

		int cara;
		cara = entrada.nextInt();

		switch (cara) {
		case 1:
			System.out.println("La cara opuesta es: seis");
			break;
		case 2:
			System.out.println("La cara opuesta es: cinco");
			break;
		case 3:
			System.out.println("La cara opuesta es: cuatro");
			break;
		case 4:
			System.out.println("La cara opuesta es: tres");
			break;
		case 5:
			System.out.println("La cara opuesta es: dos");
			break;
		case 6:
			System.out.println("La cara opuesta es: uno");
			break;
		default:
			System.out.println("ERROR: N�mero incorrecto");
		}

		entrada.close();
	}

}
