package com.ciclos;

class Ciclos7_BEAG {

	public static void main(String[] args) {

		/*
		 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de
		 * interés mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada
		 * mes todo su dinero?
		 */

		System.out.println("------ EJERCICIO 7 ------");

		double interesMensual = 0.02;
		double inversion = 700;
		double inversionFinal = 1500;
		int meses = 0;

		while (inversion <= inversionFinal) {
			inversion = inversion * (1 + (interesMensual));
			meses++;
		}

		System.out.println("En " + meses + " meses, la persona tendra más de $1500.");

	}

}
