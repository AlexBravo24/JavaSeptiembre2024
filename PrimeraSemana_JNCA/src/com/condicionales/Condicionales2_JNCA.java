package com.condicionales;

import java.util.Scanner;

public class Condicionales2_JNCA {

	public static void main(String[] args) {
		
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.

		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("=========EJERCICIO 2 JNCA=========");
        System.out.println("==================================");

        System.out.println("Introduce numero");
        numero = entrada.nextInt();
        
        entrada.close();
        
        if (numero % 2 == 0) {
        	System.out.println("El numero es Par");
        } else if (numero % 2 != 0) {
        	System.out.println("El numero es Impar");
        }
	}

}
