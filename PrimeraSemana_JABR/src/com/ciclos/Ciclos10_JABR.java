package com.ciclos;

import java.util.Scanner;

public class Ciclos10_JABR {

public static void main(String[] args) {
		
		/*10. Programa que lea 20 números e indique si son positivos
		 *o negativos y pares o impares y ademas muestre la sumatoria
		 * de los positivos y sumatoria de los impares.
		 * 
		 */
	
		int contador = 0 ;
		int num = 0 ;
		int sumP = 0 ;
		int sumImp = 0 ;
		
		Scanner entrada = new Scanner (System.in);
		
		while (contador<20) {
		
		System.out.println("Ingresa un número");
		num = entrada.nextInt();
		
		
		if (num < 0) { 
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
			sumP = sumP + num;
		}
		
		if (num%2 == 0) {
			System.out.println("es par");
		} else {
			System.out.println("impar");
			sumImp= sumImp + num;
		}
		
		contador++;
		
		}
		System.out.println(" ");
		System.out.println("la suma de los positivo es:  " + sumP);
		System.out.println("la suma de los impares es:  " + sumImp);	
		
	}

}
