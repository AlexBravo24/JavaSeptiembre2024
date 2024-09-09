package com.condicionales;

import java.util.Scanner;

public class Condicionales5_EMTVC {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que calcule la aceptación de una solicitud en base a los
		 * siguientes parámetros: edad, nota y sexo. Mínimo: Nota (5), edad (18), sexo M
		 * -> POSIBLE Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA Otros casos -> NO
		 * ACEPTADA
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 5 ============");
		System.out.println("====================================");

		int nota=0, edad=0, sex=0;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese tu nota: ");
		nota = entrada.nextInt();
		System.out.print("Ingrese tu edad: ");
		edad = entrada.nextInt();
		System.out.println("Ingrese su sexo");
		String sexo = entrada.next();
		if (sexo.equalsIgnoreCase("Hombre") || sexo.equalsIgnoreCase("Masculino")) {
			sex = 1;
		} else if (sexo.equalsIgnoreCase("Mujer") || sexo.equalsIgnoreCase("Femenino")) {
			sex = 2;	
		} else{
			System.out.println("El dato ingresado esta mal");
		}
		
		if (nota>=5 && edad>=18 && sex ==1 ) {
			System.out.println("La aceptacion de su solicitud es posible");
		}else if (nota>=5 && edad>=18 && sex == 2) {
			System.out.println("Se ha aceptado su solicitud");
		}else {
			System.out.println("Su solicitud no fue aceptada");
		}
		entrada.close();

	}

}
