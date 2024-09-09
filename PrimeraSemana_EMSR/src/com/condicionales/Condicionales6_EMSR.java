package com.condicionales;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales6_EMSR {

	public static void main(String[] args) {
		/* 
		 * 6. El director de una escuela está organizando un viaje de estudios y requiere 
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
determinar el pago a la compañía de autobuses y lo que debe pagar cada 
alumno por el viaje. 
		 */
		
		int alumnos;
		
		System.out.println("============================");
		System.out.println("Ejercicio 6=================");
		System.out.println("============================");
		
        Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el numero de alumnos");
		alumnos = entrada.nextInt();
		
		if (alumnos>=100 ) {
			System.out.println("La cantidad a pagar por alumno es de 65 euros");
			int total = alumnos*65;
			System.out.println("La cantidad total a pagar a la compañia de viajes sera de: "+ total + " euros");
			
					
		}else if (alumnos>=50 && alumnos<=99 ) {
			System.out.println("La cantidad a pagar por alumno es de 70 euros");
			int total = alumnos*70;
			System.out.println("La cantidad total a pagar a la compañia de viajes sera de: "+ total + " euros");
		}else if (alumnos>=30 && alumnos<=100 ) {
			System.out.println("La cantidad a pagar por alumno es de 95 euros");
			int total = alumnos*95;
			System.out.println("La cantidad total a pagar a la compañia de viajes sera de: "+ total + " euros");
		}else if (alumnos<30 ) {
			
			double total =4000 /alumnos;
			System.out.println("La cantidad a pagar por alumno es de "+ total + " euros");
			System.out.println("La cantidad total a pagar a la compañia de viajes sera de: 4000 euros");
		
		}
	 

	}

}
