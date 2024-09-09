package com.ciclos;

public class Ciclos6_JABR {

	public static void main(String[] args) {
		// 6. Una persona desea invertir $1000.00 en un banco,
		// el cual le otorga un 2% de inter�s mensual.
		// �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o
		// si todo el dinero lo reinvierte?

		double c = 1000;
		for (int i = 1; i <= 12; i++) {
			c = c * 1.02;
			System.out.println("Mes " + i + ": $" + String.format("%.2f", c));
		}
	}

}
