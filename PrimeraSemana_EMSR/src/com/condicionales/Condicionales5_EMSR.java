package com.condicionales;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales5_EMSR {

	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
los siguientes parámetros: edad, nota y sexo.  
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
* Otros casos -> NO ACEPTADA
		 */

		System.out.println("============================");
		System.out.println("Ejercicio 5=================");
		System.out.println("============================");
		
		int nota;
		int edad;
		
       Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa nota");
		nota = entrada.nextInt();
		
		System.out.println("Ingresa la edad");
		edad = entrada.nextInt();
		
		System.out.println("Ingresa sexo (F si es femenino / M si es masculino) ");
		entrada.nextLine();
		String sexo = entrada.nextLine();
		
		if (nota>=5 && edad>=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Solicitud posible");
		} else if (nota>=5 && edad>=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Solicitud aceptada");
		}else {
			System.out.println("Soicitud no aceptada");
		}
	}

}
