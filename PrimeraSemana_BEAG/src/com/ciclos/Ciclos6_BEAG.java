package com.ciclos;

public class Ciclos6_BEAG {

	public static void main(String[] args) {
		
		/* 6.- Una persona desea invertir $1000.00 en un banco, 
		 * el cual le otorga un 2% de interés mensual. 
		 * ¿Cuál será la cantidad de dinero que esta persona tendrá 
		 * al cabo de un año si todo el dinero lo reinvierte?
		*/

		System.out.println("------ EJERCICIO 6 ------");
		
		double interesMensual = 0.02;
		double inversion = 1000;
		
		for (int i = 0; i < 12; i++) {
			inversion = inversion* (1 + (interesMensual));
		}
		
		System.out.println("Al cabo de un año, la persona tendrá "+inversion);
		

	}

}
