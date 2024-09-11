package com.ciclos;

public class Ciclos7_GARV {

	public static void main(String[] args) {
		// Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		//dinero?

		System.out.println("==Ciclo 7==");
		
		double dinero = 700;
		double mes =1;
		
		for (;;) {
			dinero = dinero * 1.02;
			if (dinero >= 1500) break;
			mes++;
			}
			System.out.println(mes);
			System.out.println(dinero);
		
	}

}
