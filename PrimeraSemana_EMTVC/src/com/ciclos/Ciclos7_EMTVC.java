package com.ciclos;

public class Ciclos7_EMTVC {

	public static void main(String[] args) {
		/*
		 * - Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de
		 * interés mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada
		 * mes todo su dinero?
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 7 ============");
		System.out.println("====================================");
		int j = 2, k = 12, i=0;
		double valor = 700;

		System.out.println("Se invirtieron $" + valor + " con un interes mensual del " + j + " % por " + k + " meses");
		double j2;

		while (valor<1500) {
			j2=valor*(j*0.01);
			valor=valor+j2;
			System.out.println(i+" ---- " +valor);
			i++;
		}
		System.out.println("Al cabo de " + i + " Meses tendra: $" + valor);

	}
}
