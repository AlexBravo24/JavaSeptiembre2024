package com.condicionales;

import java.util.Scanner;

public class Condicionales2_GARV {

	public static void main(String[] args) {
		// 
		/* Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		 */
		
		System.out.println("====EJERCICIO 2====");
		System.out.println("Permite conocer si un n�mero es par o impar");
		
		
		
		Scanner numero = new Scanner (System.in);
		System.out.println("Introduce el n�mero");
		int numero1 = numero.nextInt();
				
		if (numero1%2==0){
		System.out.println("El n�mero es par");
		}else {
			System.out.println("El n�mero es impar");
		}

	}

}
