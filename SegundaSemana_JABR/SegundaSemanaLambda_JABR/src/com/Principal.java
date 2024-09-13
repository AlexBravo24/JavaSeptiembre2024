package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones Lambda
		//Son conocidas como funciones anónimas
		//que implementan un método de una interface funcional
		
		//Su operador es ->
		//y la sintaxis es la sig:
		// (parametros) -> { cuerpo de lambda };
		
		/*
		 * (parametros del método) -> {qué queremos hacer
		 * 					con dichos parametros}
		 */
		
		//Es cómo si "definieramos un método" al momento de su uso
		//Pero no lo es, un método definido ya esta declarado en una clase
		IMetodo suma = (x,y) -> System.out.println("La suma es: " + (x+y));
		
		//Probando el método a través del objeto suma
		suma.operacion(19, 2);
		
		//Incluso podemos crear otro objeto para implementar la interface
		//métodos y llamarlo para sobreescribirlo
		IMetodo resta = (item1, item2) -> System.out.println("La resta es: " + (item1-item2));
		
		resta.operacion(10, 7);

	}

}
