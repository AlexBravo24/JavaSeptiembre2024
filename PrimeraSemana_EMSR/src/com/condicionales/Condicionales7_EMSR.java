package com.condicionales;

import java.util.Scanner;

public class Condicionales7_EMSR {

	public static void main(String[] args) {
		/*
		 * 7. Realiza un programa que pida por teclado el resultado (dato entero) 
obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		 */
		
		int numero1;

		System.out.println("============================");
		System.out.println("Ejercicio 7=================");
		System.out.println("============================");
		
        Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el numero del dado de 6 caras");
		numero1 = entrada.nextInt();
		
		if (numero1==1) {
			System.out.println("La cara opuesta es : SEIS");
		} else if (numero1==2) {
			System.out.println("La cara opuesta es : CINCO");
		}else if (numero1==3) {
			System.out.println("La cara opuesta es : CUATRO");
		}else if (numero1==4) {
			System.out.println("La cara opuesta es : TRES");
		}else if (numero1==5) {
			System.out.println("La cara opuesta es : DOS");
		}else if (numero1==6) {
			System.out.println("La cara opuesta es : UNO");
		}else {
			System.out.println("Error numero incorrecto");
		}
	}

}
