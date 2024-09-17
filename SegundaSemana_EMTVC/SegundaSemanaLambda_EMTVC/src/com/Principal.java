package com;

public class Principal {

	public static void main(String[] args) {

		//Expreciones lambda
		//Son conocidas como funciones anonimas
		//que implementan un metodo de una interface funcional
		
		//Su operador es->
		//y la sintaxis es la sig:
		//(parametros) -> {cuerpo de lambda}
		
		/*
		 * (Parametros del metodo) -> { que queremos hacer
		 * con dichos parametros}
		 */

		//Es como si "definieramos un metodo" al momento de su uso
		//Pero no lo es, un metodo definido ya esta declarado en una clase
		IMetodo suma = (x,y) -> System.out.println("La suma es: "+ (x+y));
		
		//Probando el metodo a traves del objeto suma
		suma.operacion(19, 2);
		
		//Incluso podemos crear otro objeto para implementar la interface
		//metodos y llamarlo para sobreescribirlo
		IMetodo resta = (item1, item2) -> System.out.println("La resta es: " + (item1- item2));
		
		resta.operacion(10, 7);
	
	}

}
