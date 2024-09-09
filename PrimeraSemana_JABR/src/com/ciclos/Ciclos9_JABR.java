package com.ciclos;

import java.util.Scanner;

public class Ciclos9_JABR {

	public static void main(String[] args) {
		
		/*9. Programa Java que lea dos números y muestre los números pares entre ellos
		 * 
		 */
		
		int num1;
		int num2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el numero 1: ");
		num1 = entrada.nextInt();
		System.out.println("Ingresa el numero 2: ");
		num2 = entrada.nextInt();
		entrada.close();
	
		if (num1<num2) {
			for (int i = num1;i<=num2;i++) {
				if (i % 2==0){
					System.out.println(i);	
				}
					
		}
		}
			else {
			for (int i = num2;i<=num1;i++) {
				if (i % 2==0){
					System.out.println(i);	
				}	
		}
	}
	}

}
