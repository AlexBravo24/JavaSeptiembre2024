package com.ciclos;

public class Ciclos7_EMSR {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
		//mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su 
		//dinero? 

		System.out.println("============================");
		System.out.println("Ejercicio 7=================");
		System.out.println("============================");
	
		double dinero = 700;
		int mes=1;
		
		for (;;) {
			dinero = dinero * 1.02;
		
			if (dinero >= 1500)break;
			mes++;
		}
		
		System.out.println(mes + " meses");
		System.out.println("$" + dinero);
	
	
	
	
	}

}
