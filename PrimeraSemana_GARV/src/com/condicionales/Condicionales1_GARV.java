package com.condicionales;

import java.util.Scanner;

public class Condicionales1_GARV {

	public static void main(String[] args) {
		
		/* Realiza un programa que reciba dos n�meros por teclado e indique cu�l es
		 * mayor o si son iguales.
		 */

		System.out.println("====EJERCICIO 1====");
		System.out.println("Introduce dos n�meros a comparar");
		
		int num1;
		Scanner numero1 = new Scanner (System.in);
		System.out.println("Ingresa el primer n�mero ");
		num1 = numero1.nextInt();
		
		int num2;
		Scanner numero2 = new Scanner (System.in);
		System.out.println("Ingresa el segundo n�mero ");
		num2 = numero2.nextInt();
		
		if  ( num1 ==num2 ) {
			System.out.println("Los n�meros son iguales");
		}else if  (num1 >num2) {
				System.out.println("El primer n�mero es mayor al segundo");
		} else if (num1 < num2) {
			System.out.println("El segundo n�mero es mayor al primero");
			
			}	
		
		
		}

}
