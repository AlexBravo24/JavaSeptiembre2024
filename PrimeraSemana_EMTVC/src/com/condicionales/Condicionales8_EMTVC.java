package com.condicionales;

import java.util.Scanner;

public class Condicionales8_EMTVC {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el
		 * día correspondiente. Si introducimos otro número nos da un error.
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 8 ============");
		System.out.println("====================================");

		int dia;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el dia de la semana (Del 1 al 7): ");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("ERROR: Entrada no valida");
			break;
		}
		entrada.close();
	}
}
