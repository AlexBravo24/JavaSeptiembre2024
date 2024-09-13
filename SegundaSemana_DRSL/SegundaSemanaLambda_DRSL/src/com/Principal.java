package com;

public class Principal {

	public static void main(String[] args) 
	{
		//(parametros) -> {cuerpo lambda}
		IMetodo suma = (x,y) -> System.out.println("La suma es:" + (x+y));		
		suma.operacion(19, 2.0);
	}

}
