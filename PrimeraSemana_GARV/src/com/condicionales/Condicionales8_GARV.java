package com.condicionales;

import java.util.Scanner;

public class Condicionales8_GARV {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		//correspondiente. Si introducimos otro número nos da un error.

		System.out.println("==Condicionales 8==");
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 7 para conocer qué día es:");
		int num = ent.nextInt();
		
		if (num<1||num>7)
			System.out.println("ERROR");
		
		switch (num) {
		case 1:
			System.out.println("El día es Domingo");
			break;
		case 2:
			System.out.println("El día es Lunes");
			break;
		case 3:
			System.out.println("El día es Martes");
			break;
		case 4:
			System.out.println("El día es Miércoles");
		case 5:
			System.out.println("El día es Jueves");
			break;
		case 6:
			System.out.println("El día es Viernes");
			break;	
		case 7:
			System.out.println("El día es Sábado");	
		default:
			break;
		}
	}

}
