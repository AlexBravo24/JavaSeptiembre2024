package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son conocidas como funciones anónimas que implementan
		//un método de una interface funcional
		
		//Su operador es ->
		//y la sintaxis es la siguiente:
		// (parámetros) -> { cuerpo de lambda };
		
		/*
		 * (parámetros del método) -> {qué queremos hacer con dichos parámetros};
		 */

		//Es como si "definiéramos" un método al momento de su uso, pero no lo es
		//Un método definido ya está declarado en una clase
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y));
		
		//IMetodo es una interface
		//suma es un objeto
		//No se pueden crear objetos de interfaces
		//Los objetos se crean a partir de las clases, pero al no existir una clase para crear este objeto
		//y que nos permita implementar la interface se crea de una clase "ANÓNIMA"
		
		//Probando el método a través del objeto suma
		suma.operacion(19, 2);
		
		//Incluso podemos crear otro objeto para implementar la interface métodos y llamrlo para sobreescribirlo
		IMetodo resta = (item1, item2) -> System.out.println("La resta es: " + (item1-item2));
		
		resta.operacion(10, 7);
		
		
	}

}
