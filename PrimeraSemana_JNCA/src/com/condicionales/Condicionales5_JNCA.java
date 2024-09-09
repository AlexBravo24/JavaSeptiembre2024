package com.condicionales;

import java.util.Scanner;

public class Condicionales5_JNCA {

	public static void main(String[] args) {
		/* 5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a 
           los siguientes par�metros: edad, nota y sexo. 
           * M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
           * M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
           * Otros casos -> NO ACEPTADA
        */

		int nota, edad; 
		char sexo;
		
		System.out.println("==================================");
		System.out.println("=========EJERCICIO 5 JNCA=========");
        System.out.println("==================================");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce Nota");
		nota = entrada.nextInt();
		System.out.println("Introduce edad");
	    edad = entrada.nextInt();
	    entrada.nextLine();
	    System.out.println("Introduce sexo (M para masculino y F para femenino");    
	    sexo = entrada.nextLine().charAt(0);
	    entrada.close();
    if (sexo == 'M' && nota >= 5 && edad >= 18) {
	    	System.out.println("POSIBLE");
	    }else if (sexo == 'F' && nota >= 5 && edad >= 18) {
	    	System.out.println("ACEPTADA");
	    }else {
	    	System.out.println("No aceptad@");
	    }
	
	}

}
