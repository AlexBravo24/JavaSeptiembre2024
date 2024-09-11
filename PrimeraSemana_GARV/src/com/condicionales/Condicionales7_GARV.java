package com.condicionales;

import java.util.Scanner;

public class Condicionales7_GARV {

	public static void main(String[] args) {
		/* Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar 
		 * un dado de seis caras y muestre por pantalla el n�mero en letras (dato cadena) de la 
		 * cara opuesta al resultado obtenido. Nota 1: En las caras opuestas de un dado de seis 
		 * caras est�n los n�meros: 1-6, 2-5 y 3-4. Nota 2: Si el n�mero del dado introducido es 
		 * menor que 1 o mayor que 6, se mostrar� el mensaje: �ERROR: n�mero incorrecto�
		 */
		

		System.out.println("====EJERCICIO 7====");
		System.out.println("Cara opuesta del dado");
		
		int dado;
		
		Scanner numero = new Scanner (System.in);
		System.out.println("Ingresa el n�mero la cara del dado");
		dado = numero.nextInt();
		
		if (dado<1 || dado>6) {
			System.out.println("ERROR. N�mero inv�lido");	
		}
		switch (dado)
		{
		case 1:
			System.out.println("La cara opuesta es SEIS");
			break;
		case 2:
			System.out.println("La cara opuesta es CINCO");
			break;
		case 3:
			System.out.println("La cara opuesta es CUATRO");
			break;
		case 4:
			System.out.println("La cara opuesta es TRES");
			break;
		case 5:
			System.out.println("La cara opuesta es DOS");
			break;
		case 6:
			System.out.println("La cara opuesta es UNO");
			break;
		}
	}
}
				
			
		

	

