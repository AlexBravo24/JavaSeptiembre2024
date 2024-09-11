package com.ciclos;

public class Ciclos6_GARV {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
		//todo el dinero lo reinvierte?
		
		System.out.println("==Ciclo 6==");
		
		double dinero = 1000;
		double interes = 0.02;
		double meses = 12;
			
		for (int i = 0; i <=meses; i++) {
			double din1 = ((dinero*interes)+dinero);
			dinero = din1;
	
			System.out.println(("El total del dinero será: $") + (dinero));
	

	}
}
}


