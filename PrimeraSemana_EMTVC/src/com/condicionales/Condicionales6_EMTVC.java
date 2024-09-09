package com.condicionales;

import java.util.Scanner;

public class Condicionales6_EMTVC {

	public static void main(String[] args) {
		/*
		 * El director de una escuela está organizando un viaje de estudios y requiere
		 * determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
		 * de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 100
		 * alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos,
		 * el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. *
		 * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin
		 * importar el número de alumnos. Realiza un algoritmo que permita determinar el
		 * pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
		 */
		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 6 ============");
		System.out.println("====================================");
		
		int alumnos, pago;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el numero de alumnos: ");
		alumnos = entrada.nextInt();
		
		if(alumnos>=100) {
			pago= 65*alumnos;
			System.out.println("cada alumno debe pagar: €65");
			System.out.println("El pago total a la compañia de autobuses es de: €"+pago);
		}else if(alumnos>=50 && alumnos <=99) {
			pago= 70*alumnos;
			System.out.println("cada alumno debe pagar: €70");
			System.out.println("El pago total a la compañia de autobuses es de: €"+pago);
		}else if(alumnos>=30 && alumnos<=49) {
			pago= 95*alumnos;
			System.out.println("cada alumno debe pagar: €95");
			System.out.println("El pago total a la compañia de autobuses es de: €"+pago);
		}else if(alumnos>0 && alumnos <30) {
			pago= 4000/alumnos;
			System.out.println("cada alumno debe pagar: €"+pago);
			System.out.println("El pago total a la compañia de autobuses es de: €4000");
		}
		entrada.close();
	}

}
