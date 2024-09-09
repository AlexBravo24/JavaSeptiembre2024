package com.arrays;

import java.util.Scanner;

public class IntentoMenu {

	public static void main(String[] args) {
		/*
		 * Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 1 ============");
		System.out.println("====================================");

		int num, eleccion, posicion;
		Scanner entrada = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dato "+ i +" --> "+numeros[i]);
		}
		
		System.out.println("Quiere ingresar(1), editar(2) o eliminar(3) un elemento de la base de datos");
		eleccion = entrada.nextInt();
		
		
		switch(eleccion) {
		case 1:
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Dato "+ i +" --> "+numeros[i]);
			}
			System.out.print("Que posicion quiere ingresar");
			posicion = entrada.nextInt();
			System.out.print("Que posicion quiere ingresar");
			posicion = entrada.nextInt();
			break;
		case 2:
			System.out.println("Viernes");
			break;
		case 3:
			System.out.println("Viernes");
			break;
		default:
			System.out.println("La operacion ingresada no es correcta");
			break;
		}

	}

}
