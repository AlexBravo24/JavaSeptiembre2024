package com.condicionales;

import java.util.Scanner;

class Condicionales5_BEAG {

	public static void main(String[] args) {
	
		/* 5. Realiza un programa que calcule la aceptaci�n de una solicitud 
		 * con base a los siguientes par�metros: edad, nota y sexo:
		 * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTA 
		 */
		
		System.out.println("------ EJERCICIO 5 ------");
		
		Scanner entrada = new Scanner (System.in);
		
		int nota, edad;
		char sexo;

		System.out.println("Ingrese su nota");
		nota = entrada.nextInt();
		
		System.out.println("Ingrese su edad");
		edad = entrada.nextInt();
		
		entrada.nextLine();
		
		if (nota>=5 && edad>=18) {
			System.out.println("Ingrese su sexo, M o F: ");
			sexo = entrada.nextLine().charAt(0);
			
			switch (sexo) {
			case 'm' :
			case 'M' :
				System.out.println("POSIBLE");
			
			case 'f' :
			case 'F' :
				System.out.println("ACEPTADA");
			break;
			default:
				System.out.println("Sexo inv�lido");
			}
			
		} else {
			System.out.println("NO ACEPTADA");
		}
		
		

	}

}
