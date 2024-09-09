package com.ciclos;

public class Ciclos6_EMTVC {
	public static void main(String[] args) {
		/*
		 * - Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de
		 * interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al
		 * cabo de un año si todo el dinero lo reinvierte?
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 6 ============");
		System.out.println("====================================");
		int  j=2, k=12;
		double valor=1000;
		
		System.out.println("Se invirtieron $"+valor+" con un interes mensual del "+j+" % por "+k+" meses");
		double j2;

		for (int i = 1; i <= k; i++) {
			j2=valor*(j*0.01);
			valor=valor+j2;
			System.out.println(i+" ---- " +valor);
		}
		System.out.println("Al cabo de "+k+" Meses tendra: $"+valor);
		
	}
}
