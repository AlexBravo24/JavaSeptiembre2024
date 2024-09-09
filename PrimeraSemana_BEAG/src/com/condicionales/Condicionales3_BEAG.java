package com.condicionales;

import java.util.Scanner;

public class Condicionales3_BEAG {

	public static void main(String[] args) {
		
		/* 3.Crea un programa que pida al usuario dos números 
		 * y muestre el resultado de su división. Si el segundo 
		 * número es 0, debe mostrar un mensaje de error
		 */

		System.out.println("------ EJERCICIO 3 ------");
		
		double numerador, denominador;
		double division;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Para realizar una división, ingresa el numerador: ");
		numerador = entrada.nextInt();
		
		System.out.println("Ahora ingresa el denominador: ");
		denominador = entrada.nextInt();
		
		if (denominador == 0 ) {
			System.out.println("Error. El denominador debe ser diferente a 0");
		} else {
			division = numerador / denominador;
			System.out.println("La división es "+division);
		}
		

	}

}
