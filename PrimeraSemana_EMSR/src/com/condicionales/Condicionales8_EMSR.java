package com.condicionales;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales8_EMSR {

	public static void main(String[] args) {
		/*
		 * 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
           correspondiente. Si introducimos otro número nos da un error. 
		 * 
		 */
		
		int numero1;

		System.out.println("============================");
		System.out.println("Ejercicio 8=================");
		System.out.println("============================");
		
        Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el numero del dia de la semana");
		numero1 = entrada.nextInt();
		
		if (numero1==1) {
			System.out.println("Lunes");
		} else if (numero1==2) {
			System.out.println("Martes");
		}else if (numero1==3) {
			System.out.println("Miercoles");
		}else if (numero1==4) {
			System.out.println("Jueves");
		}else if (numero1==5) {
			System.out.println("Viernes");
		}else if (numero1==6) {
			System.out.println("Sabado");
		}else if (numero1==7) {
			System.out.println("Domingo");
		}else {
			System.out.println("xxxxxErrorxxxxx");
		}
			

	}

}
