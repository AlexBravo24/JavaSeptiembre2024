package com.ciclos;

public class Ciclos7_JNCA {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		// mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		// dinero?

		double inversion = 700;
		double tasaInteres = 0.02;
		int mesesTotal = 0;
		
		while (inversion <= 1500) {
	    inversion = inversion * (1 + tasaInteres);
	    mesesTotal++;
		}
		
	System.out.println("Al cabo de " + mesesTotal + " meses la inversion es igual o mayor que 1500");
	
	}

}
