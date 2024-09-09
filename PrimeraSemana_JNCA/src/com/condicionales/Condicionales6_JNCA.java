package com.condicionales;

import java.util.Scanner;

public class Condicionales6_JNCA {
	
public static void main(String[] args) {
			
		/* 6. El director de una escuela est� organizando un viaje de estudios y requiere 
              determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
              compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
              100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
              alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
              euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
              euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
              determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
              alumno por el viaje.
         */

		System.out.println("==================================");
		System.out.println("=========EJERCICIO 6 JNCA=========");
        System.out.println("==================================");
        
        int cantidadAlumnos;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir cuantos alumnos accederan al viaje");
        cantidadAlumnos = entrada.nextInt();
        entrada.close();
        if (cantidadAlumnos >= 100) {
        	System.out.println("El costo por cada alumno es de 65 Euros");
        }else if ((cantidadAlumnos >= 50) && (cantidadAlumnos <= 99) ) {
        	System.out.println("El costo por cada alumno es de 70 Euros");
        }else if ((cantidadAlumnos >= 30) && (cantidadAlumnos <= 49)) {
        	System.out.println("El costo por cada alumno es de 95 Euros");
        }else if (cantidadAlumnos <= 29) {
        	System.out.println("El costo por cada alumno es de " + (4000 / cantidadAlumnos) + " Euros");
        }
	}

}
