package com.ciclos;

public class Ciclos7_MAGB {
	public static void main(String[] args) {
		//7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
		//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
		//dinero?

		double dinero = 700;
		double interes=0;
		int i=0;
		
		while (dinero <= 1500) {
			interes = dinero * .02;
			dinero = dinero+interes;
			i=i+1;
			System.out.println("tardaras "+i+" "+"meses en obtener el dinero");
			System.out.println("tu dinero es de: " + dinero);
			
		}
	}
}
