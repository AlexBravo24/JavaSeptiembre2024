package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JABR {

	public static void main(String[] args) {


		/*2.- Programa un algoritmo que realice la tabla de multiplicar 
		 * de un numero introducido desde teclado, 
		 * hasta la iteración deseada por el usuario. 
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 * 
		 */
		
		System.out.println("===============================");
		System.out.println("=====TABLA DE MULTIPLICAR======");
		System.out.println("===============================");
		

		int a;
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		a = input.nextInt();
		System.out.println("Hasta qué número lo quieres multiplicar");
		i = input.nextInt();
		
		for (Integer j = 1 ; j<=i; j++) {
			System.out.println(a + " x " + j + " = " + (a * j));
			
		}
		
	}

}
