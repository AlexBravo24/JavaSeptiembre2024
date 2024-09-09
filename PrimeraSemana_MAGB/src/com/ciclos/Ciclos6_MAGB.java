package com.ciclos;

public class Ciclos6_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
		//todo el dinero lo reinvierte?
		
		double dinero = 1000;
		double interes=0;
		for (int i = 0; i < 13; i++) {
			interes = dinero * .02;
			dinero = dinero+interes;
			System.out.println("Mes:"+i);
			System.out.println("tu dinero es de: " + dinero);
		}
	}

}
