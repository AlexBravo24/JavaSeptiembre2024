package com.condicionales;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales1_EMSR {

	public static void main(String[] args) {
		/*1.Realiza un programa que reciba dos números por teclado e indique cuál es 
          mayor o si son iguales. 
		 * 
		 */
		
		int numero1;
		int numero2;
		
		System.out.println("============================");
		System.out.println("Ejercicio 1=================");
		System.out.println("============================");
		
		
		Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el primer numero");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		numero2 = entrada.nextInt();
		
		if (numero1==numero2) {
			System.out.println("El Primer numero: " + numero1 + " es igual al Segundo numero: " + numero2);
		} else if (numero1>numero2) {
			System.out.println("El Primer numero: " + numero1 + " es mayor que el Segundo numero: " + numero2);
		}else {
			System.out.println("El Segundo numero: " + numero2 + " es mayor que el Primer numero: " + numero1);
		}

	}

}
