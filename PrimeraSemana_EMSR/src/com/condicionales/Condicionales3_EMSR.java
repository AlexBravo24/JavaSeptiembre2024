package com.condicionales;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales3_EMSR {

	public static void main(String[] args) {
		/*
		 * 3.Crea un programa que pida al usuario dos números y muestre el resultado 
           de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		 */

		float numero1;
		float numero2;
		
		System.out.println("============================");
		System.out.println("Ejercicio 3=================");
		System.out.println("============================");
		
		
		Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el primer numero");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		numero2 = entrada.nextInt();
		
		
		
		if (numero2==0) {
			System.out.println("xxxxxxErrorxxxxxx");
		} else {
			
			float division = numero1/numero2;
			System.out.println("El resultado de la division del primer numero entre el segundo numero es = " + division);
		}
		
	}

}
