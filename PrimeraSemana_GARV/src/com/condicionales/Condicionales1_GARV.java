package com.condicionales;

import java.util.Scanner;

public class Condicionales1_GARV {

	public static void main(String[] args) {
		
		/* Realiza un programa que reciba dos números por teclado e indique cuál es
		 * mayor o si son iguales.
		 */

		System.out.println("====EJERCICIO 1====");
		System.out.println("Introduce dos números a comparar");
		
		int num1;
		Scanner numero1 = new Scanner (System.in);
		System.out.println("Ingresa el primer número ");
		num1 = numero1.nextInt();
		
		int num2;
		Scanner numero2 = new Scanner (System.in);
		System.out.println("Ingresa el segundo número ");
		num2 = numero2.nextInt();
		
		if  ( num1 ==num2 ) {
			System.out.println("Los números son iguales");
		}else if  (num1 >num2) {
				System.out.println("El primer número es mayor al segundo");
		} else if (num1 < num2) {
			System.out.println("El segundo número es mayor al primero");
			
			}	
		
		
		}

}
