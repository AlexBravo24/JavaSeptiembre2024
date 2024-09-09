package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// los arrays son estructura de datos
		//el numero inicia en 0
		//pueden ingresar cadenas de cualquier dato
		
		char [] nombre = new char [6];
		int [] numero = new int [6];
		
		//para ingresar daros, puedo ingresarlo dependiendo del espacio en el que se va a guardar
		//otra manera de llenar un arreglo, numeroco o de ltras
		String [] productos = {"jabon","champu","desodorante","toalla","aromatizante"};
		nombre [0] = 'a';
		nombre [1] = 'b';
		nombre [2] = 'c';
		nombre [3] = 'd';
		nombre [4] = 'e';
		nombre [5] = 'f';
		
		System.out.println(nombre);
		
		//Array con numeros, se pueden mandar a imprimir por posicion si se busca algo en especifico
		
		numero [0] = 1;
		numero [1] = 2;
		numero [2] = 3;
		numero [3] = 4;
		numero [4] = 5;
		numero [5] = 7;
		
		//un array puede almacenar distintos tipos de datos
		Object objeto = "palabra";
		Object entero = 20;
		
		Object [] objetos = {"jabon", 20, true};
		       
	}

}
