package com.condicionales;

import java.util.Scanner;

public class Condicionales8_GARV {

	public static void main(String[] args) {
		// Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
		//correspondiente. Si introducimos otro n�mero nos da un error.

		System.out.println("==Condicionales 8==");
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce un n�mero del 1 al 7 para conocer qu� d�a es:");
		int num = ent.nextInt();
		
		if (num<1||num>7)
			System.out.println("ERROR");
		
		switch (num) {
		case 1:
			System.out.println("El d�a es Domingo");
			break;
		case 2:
			System.out.println("El d�a es Lunes");
			break;
		case 3:
			System.out.println("El d�a es Martes");
			break;
		case 4:
			System.out.println("El d�a es Mi�rcoles");
		case 5:
			System.out.println("El d�a es Jueves");
			break;
		case 6:
			System.out.println("El d�a es Viernes");
			break;	
		case 7:
			System.out.println("El d�a es S�bado");	
		default:
			break;
		}
	}

}
