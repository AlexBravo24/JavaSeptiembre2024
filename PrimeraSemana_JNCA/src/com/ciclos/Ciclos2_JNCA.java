package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JNCA {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		// desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		// 23 x 95 = ???

		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce numero 1");
		numero1 = entrada.nextInt();
		System.out.println("Introduce el numero 2 (Hasta iteracion deseada)");
		numero2 = entrada.nextInt();
		entrada.close();
		
		for (int i = 1; i <= numero2; i++) {
			int resultado = numero1 * numero2;
			System.out.println(numero1 + "x" + i + "=" + resultado);
		}
		
	}

}
