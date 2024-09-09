package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EMTVC {
	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 3 ============");
		System.out.println("====================================");

		double num1;
		double num2;
		double res;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero a dividir: ");
		num1 = entrada.nextInt();
		System.out.print("Ingrese el divisor: ");
		num2 = entrada.nextInt();
		if (num2== 0) {
			System.out.println("No se puede dividir entre 0");			
		}else {
			res= num1/num2;
			System.out.println("El resultado es: " + res);
		}
		entrada.close();
		

	}
}
