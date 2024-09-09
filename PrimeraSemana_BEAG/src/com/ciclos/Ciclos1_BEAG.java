package com.ciclos;

import java.util.Scanner;

public class Ciclos1_BEAG {

	public static void main(String[] args) {

		/*1.- Programa un algoritmo que realice la tabla 
		 * de multiplicar del 12
		 */
		
		System.out.println("------ EJERCICIO 1 ------");
		
		int num=12, multip=1;
		
		for (int i = 0; i <= 10; i++) {
			multip=num*i;
			System.out.println(num + "*" + i + " = " + multip);
		}
		
		
	}

}
