package com.condicionales;

import java.util.Scanner;

public class Condicionales6_BEAG {

	public static void main(String[] args) {
		
		/* 6. El director de una escuela est� organizando un 
		 * viaje de estudios y requiere determinar cu�nto debe cobrar
		 * a cada alumno y cu�nto debe pagar a la compa��a de viajes por 
		 * el servicio. La forma de cobrar es la siguiente: * Si son 100 alumnos 
		 * o m�s, el costo por cada alumno es de 65 euros. De 50 a 99 alumnos, 
		 * el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95 euros.
		 * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, 
		 * sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
		 * determinar el pago a la compa��a de autobuses y lo que debe pagar cada
		 * alumno por el viaje
		 */
		
		System.out.println("------ EJERCICIO 5 ------");

		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingrese el n�mero de alumnos: ");
		
		int alumnos;
		double precio;
		
		alumnos = entrada.nextInt();
		
		// Conocer el costo por alumno 
        if (alumnos>=100) {
            System.out.println("El costo por alumno es de 65 euros");
        } else if ((alumnos >= 50) && (alumnos<=99)) {
        	System.out.println("El costo por alumno es de 70 euros");
        } else if ((alumnos >= 30)  && (alumnos<=49)) {
        	System.out.println("El costo por alumno es de 95 euros");
        } else {
        	precio = 4000/alumnos; 
        	System.out.println("El costo es de "+precio+" euros por alumno");
        }
       
	}
}

		
		

