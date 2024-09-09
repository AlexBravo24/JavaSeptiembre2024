package com.ciclos;

public class Ciclos5_EMSR {

	public static void main(String[] args) {
		/*
		 * 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		 */
		
		System.out.println("============================");
		System.out.println("Ejercicio 5=================");
		System.out.println("============================");
		
		
		
		    for (int h=0; h <= 23; h++) {
			for (int m=0; m <= 59; m++) {
			for (int s=0; s <= 59; s++) {
			System.out.println(h +" : "+ m +" : "+ s );
			}
			}
		    }
			}	

	}


