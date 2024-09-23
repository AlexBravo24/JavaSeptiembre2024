package com;

public class Principal {
public static void main(String[]args) {
	//expresiones lamnda
	//son conocidas como funciones anonimas
	//que implementan un metodo interface funcional
	
	//su operador es ->
	//y la sintaxis es la sig
	//(parametros) -> {cuerpo lamda}
	/*
	 * 
	 * (parametros del metod) -> {que queremos hacer con esos parametros}
	 */
	//es como si definieramos un metodo al momento de uso
	//pero no lo es, un metodo defini ya esta declarado en la clase
	IMetodo suma = (x,y) -> System.out.println("la suma es: " + (x + y));
	//interface --- objeto, los objetos se crean de clases pero al no existir una clase para crear este objeto y que nos permiota la interface es una anonima
	//proabdmo el metodo atraves del objeto suma
	suma.operacion(19, 2);
	
	//incluso podemos crear otro objeto para implementar la interface
	//metodos y llamarlo para sobre esceribirlo
	IMetodo resta = (item1, item2) -> System.out.println("la resta es: " + (item1-item2));
	
	resta.operacion(10, 7);

}
}
