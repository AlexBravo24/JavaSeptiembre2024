package com.condicionales;
import java.util.Scanner;

public class Condionales8_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
		
		Scanner num = new Scanner(System.in);
		System.out.println("Ingresa un numero que coincida con un dia de la semana:");
		int numero = num.nextInt();
		
		switch(numero) {
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
				System.out.println("Juevez");
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
				System.out.println("Numero no valido");
		
		}
		num.close();
	}

}
