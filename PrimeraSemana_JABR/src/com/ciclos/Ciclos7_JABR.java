package com.ciclos;

public class Ciclos7_JABR {

	public static void main(String[] args) {
		// 7. Una persona desea invertir $700.00 en un banco,
		// el cual le otorga un 2% de inter�s mensual. En cuantos meses tendr�
		// mas de $1500, si reinvierte cada mes todo su dinero?

		double c = 700;
		int m = 1;
		while (c <= 1500) {
			c = c * 1.02;
			m++;
		}
		System.out.println("Si se invierten $700 con un inter�s mensual del %2,\n" + "pasar�n " + m
				+ " meses para obtener mas de $1500 ($" + String.format("%.2f", c) + ")");
	}

}
