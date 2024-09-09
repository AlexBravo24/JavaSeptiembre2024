package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EMTVC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar.


		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 2 ============");
		System.out.println("====================================");

		int num;
		int res;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		num = entrada.nextInt();
		res= num % 2;
		if (res == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		entrada.close();
	}

}
