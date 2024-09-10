package com.ciclos;

import java.util.Scanner;

public class Ciclos2_BEAG {

	public static void main(String[] args) {

		/* 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		 * introducido desde teclado, hasta la iteración deseada por el usuario.
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */

		System.out.println("------ EJERCICIO 2 ------");
		int numero1, numero2, multip; 
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingresa un número que desea multiplicar: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa hasta qué número quiere multiplicar: ");
		numero2 = entrada.nextInt();
		
		for (int i = 1; i <= numero2; i++) {
			multip = numero1 * i;
			System.out.println(numero1 + "*" + i + " = " + multip);
		}
		
		
		

	}

}
