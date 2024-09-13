package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son conocidas como funciones an�nimas
		//que implementan un m�todo de una interface funcional
		
		//Su operador es ->
		//y la sintaxis es la sig:
		// (parametros) -> { cuerpo de lambda };
		
		/*
		 * (parametros del m�todo) -> {qu� queremos hacer
		 * 					con dichos parametros}
		 */
		
		//Es c�mo si "definieramos un m�todo" al momento de su uso
		//Pero no lo es, un m�todo definido ya esta declarado en una clase
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y));
		
		//Probando el m�todo a trav�s del objeto suma
		suma.operacion(19, 2);
		
		//Incluso podemos crear otro objeto para implementar la interface
		//m�todos y llamarlo para sobreescribirlo
		IMetodo resta = (item1, item2) -> System.out.println("La resta es: " + (item1-item2));
		
		resta.operacion(10, 7);

	}

}
