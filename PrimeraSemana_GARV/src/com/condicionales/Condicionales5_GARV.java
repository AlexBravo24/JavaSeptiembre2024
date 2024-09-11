package com.condicionales;

import java.util.Scanner;

public class Condicionales5_GARV {

	public static void main(String[] args) {
		/* Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo.
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		* Otros casos -> NO ACEPTADA*/
		
		System.out.println("====EJERCICIO 5====");
		
		Scanner nota = new Scanner (System.in);
		System.out.println("Introduce la nota");
		int nota1 = nota.nextInt();
		
		Scanner edad = new Scanner (System.in);
		System.out.println("Introduce la edad");
		int edad1 = edad.nextInt();
		
		int sex=0;
		Scanner sexo = new Scanner (System.in);
		System.out.println("Introduce el sexo (M/F)");
		String sexo1 = sexo.nextLine();
		if (sexo1.equalsIgnoreCase ("M")) {
			sex=1;
		}else sexo1.equalsIgnoreCase("F");
			sex=2;			
	
		if ( nota1==5 & edad1==18 & sex==1 ) {
			System.out.println("POSIBLE");
		}else if ( nota1>=5 & edad1>=18 & sex==2 ) {
			System.out.println("ACEPTADA");
		} else {
			System.out.println("NO ACEPTADA");
			
			
		}
		
	}
		
}


