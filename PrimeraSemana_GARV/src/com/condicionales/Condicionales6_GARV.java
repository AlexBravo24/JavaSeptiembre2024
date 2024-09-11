package com.condicionales;

import java.util.Scanner;

public class Condicionales6_GARV {

	public static void main(String[] args) {
	/*El director de una escuela está organizando un viaje de estudios y requiere determinar 
	 * cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el 
	 * servicio. La forma de cobrar es la siguiente: Si son 100 alumnos o más, el costo por 
	 * cada alumno es de 65 euros. De 50 a 99 alumnos, el costo es de 70 euros. De 30 a 49 alumnos,
	 *  el costo es de 95 euros. Menos de 30 alumnos, el costo de la renta del autobús es de 4000
	 *  euros, sin importar el número de alumnos. Realiza un algoritmo que permita determinar 
	 *  el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
	 */
		
		System.out.println("====EJERCICIO 6====");
		System.out.println("Costo del viaje");
		
		double mult = 0;
		Scanner alumnos1 = new Scanner (System.in);
		System.out.println("Introduzca el número de alumnos:");
		double num = alumnos1.nextInt();
		
		if (num>99) {
			mult=65;
			System.out.println("El precio por alumno es de €65");
			System.out.println("El total a pagar es: €" + num*mult);
		}else if (num>49 & num<100) {
			mult = 70;
			System.out.println("El precio por alumno es de €70");
			System.out.println("El total a pagar es: €" + num*mult);
		}else if (num<50 & num>29) {
			mult = 95;
			System.out.println("El precio por alumno es de €95");
			System.out.println("El total a pagar es: €" + num*mult);
		}else if (num<30) {
				System.out.println("El precio por alumno es de €" + 4000/num);
				System.out.println("El total a pagar es: €4000");
			}	
	}
	
}