package com;

public class Principal {

	public static void main(String[] args) {
		// TExpresiones Lambda
		//Son conocidas como funciones anonimas
		//que implementan un metodo de una interface funcional
		
		// su operador es->
		// y la sintaxis es la sig:
		// (parametros) -> {cuerpo de Lambda}
		
		/*
		 * (parametros del metodo)  -> ( que queremos hacer
		 *                             con dichos parametros)
		 * 
		 */
		
		//Es como si "definieramos un metodo" al momento de su uso
		// Pero  no lo es, un metodo ya definido ya esta declarado en una clase
		IMetodo suma = (x,y) -> System.out.println("La suma es: "+ (x+y));
	
		// Probando el metodo a trave del objeto suma
		
		suma.operacion(19, 2);
		
		//Incluso podemos crear otro objato para implementar la interface
		// metodo y llamarlo para sobrescribirlo
		
		IMetodo resta = (item1,item2)-> System.out.println("La resta es: "+ (item1 - item2));
		
		resta.operacion(10, 7);
		
	
	}

}
