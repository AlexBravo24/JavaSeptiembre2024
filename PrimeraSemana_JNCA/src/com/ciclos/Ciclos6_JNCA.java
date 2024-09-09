package com.ciclos;

public class Ciclos6_JNCA {

	public static void main(String[] args) {
	
		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		// mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		// todo el dinero lo reinvierte?
 
		double inversion = 1000;
		double tasaInteres = 0.02;
		int mesesTotal = 12;
		
		for (int mes = 1; mes <=mesesTotal; mes++) {
	    double resultado = inversion * (1 + tasaInteres);
	    inversion = resultado;
		}
		
	System.out.println("Al cabo de a�o esta persona tendra: " + inversion);
		

	}

}
