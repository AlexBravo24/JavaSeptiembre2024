package com.ciclos;

public class Ciclos6_EMSR {

	public static void main(String[] args) {
		/*
		 * 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
todo el dinero lo reinvierte? 
		 */

		System.out.println("============================");
		System.out.println("Ejercicio 6=================");
		System.out.println("============================");
	
	double dinero=1000;
	int mes=1;
	
	while (mes<=12) {
		dinero= dinero* 1.02;
		mes++;
		
	}
	
	System.out.println("Al final de un año tendra: $ " + dinero);
	
	
	
	}

}
