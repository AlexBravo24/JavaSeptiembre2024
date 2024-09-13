package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son conocidas como funciones an�nimas que implementan
		//un m�todo de una interface funcional
		
		//Su operador es ->
		//y la sintaxis es la siguiente:
		// (par�metros) -> { cuerpo de lambda };
		
		/*
		 * (par�metros del m�todo) -> {qu� queremos hacer con dichos par�metros};
		 */

		//Es como si "defini�ramos" un m�todo al momento de su uso, pero no lo es
		//Un m�todo definido ya est� declarado en una clase
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y));
		
		//IMetodo es una interface
		//suma es un objeto
		//No se pueden crear objetos de interfaces
		//Los objetos se crean a partir de las clases, pero al no existir una clase para crear este objeto
		//y que nos permita implementar la interface se crea de una clase "AN�NIMA"
		
		//Probando el m�todo a trav�s del objeto suma
		suma.operacion(19, 2);
		
		//Incluso podemos crear otro objeto para implementar la interface m�todos y llamrlo para sobreescribirlo
		IMetodo resta = (item1, item2) -> System.out.println("La resta es: " + (item1-item2));
		
		resta.operacion(10, 7);
		
		
	}

}
