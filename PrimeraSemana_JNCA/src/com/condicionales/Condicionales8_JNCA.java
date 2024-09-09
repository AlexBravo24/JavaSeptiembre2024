package com.condicionales;

import java.util.Scanner;

public class Condicionales8_JNCA {

	public static void main(String[] args) {
		
		// 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número nos da un error.
        
		int dia; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce dia de la semana (del 1 al 7)");
		dia = entrada.nextInt();
		
		entrada.close();
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else if (dia == 6) {
			System.out.println("Sabado");
		}else if (dia == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Error");
		}
	}

}
