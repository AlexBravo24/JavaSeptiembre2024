package com.condicionales;

import java.util.Scanner;

public class Condicionales7_JNCA {

	public static void main(String[] args) {
		/* 7. Realiza un programa que pida por teclado el resultado (dato entero) 
        obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
        letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
        caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
        Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
        mostrar� el mensaje: �ERROR: n�mero incorrecto�.
        */
 
		int dato;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca resultado de dado");
		dato = entrada.nextInt();
	    entrada.close();
		if (dato == 1) {
			System.out.println("SEIS");
		}else if (dato == 2) {
        System.out.println("CINCO");	
		}else if (dato == 3) {
			System.out.println("CUATRO");
		}else if (dato == 4) {
			System.out.println("TRES");
		}else if (dato == 5) {
			System.out.println("DOS");
		}else if (dato == 6) {
			System.out.println("UNO");
		}else {
			System.out.println("ERROR: numero incorrecto");
		}
	}

}
