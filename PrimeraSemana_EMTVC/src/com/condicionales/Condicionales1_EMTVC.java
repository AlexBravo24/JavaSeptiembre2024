package com.condicionales;

import java.util.Scanner;

public class Condicionales1_EMTVC {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		
		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 1 ============");
		System.out.println("====================================");
		
		int num1; 
		int num2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		num1 = entrada.nextInt();
		System.out.print("Ingrese otro numero a comparar: ");
		num2 = entrada.nextInt(); 
		if (num1>num2) {
			System.out.println("El primer numero ingresado es mayor");
		}else if(num2>num1) {
			System.out.println("El segundo numero ingresado es mayor");
		}else if(num1 == num2) {
			System.out.println("Ambos numeros son iguales");
		}
		entrada.close();
	}

}
