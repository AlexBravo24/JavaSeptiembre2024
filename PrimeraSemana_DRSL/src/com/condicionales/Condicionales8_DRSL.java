package com.condicionales;

import java.util.Scanner;

public class Condicionales8_DRSL {

	public static void main(String[] args) {
//		8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
//		correspondiente. Si introducimos otro número nos da un error.
		System.out.println("===== EJERCICIO #8 =====");
		Scanner input = new Scanner(System.in);
		
		int day;
		System.out.println("Introduce un numero del dia de la semana!");
		day = input.nextInt();

		switch(day)
		{
			case 1:
				System.out.println("LUNES");
				break;
			case 2:
				System.out.println("MARTES");
				break;
			case 3:
				System.out.println("MIERCOLES");
				break;
			case 4:
				System.out.println("JUEVES");
				break;
			case 5:
				System.out.println("VIERNES");
				break;
			case 6:
				System.out.println("SABADO");
				break;
			case 7:
				System.out.println("DOMINGO");
				break;
			default:
				System.out.println("DIA DE LA SEMANA NO EXISTE");
			break;
		}
		input.close();
	}

}
