package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array de dos dimensiones o Matriz
		//Es una estructura que pasa a ser un concepto de "tabla", porque vamos a tener otra dimensión
		//que nos permitirá tener filas y columnas para almacenar información.
		//De esta manera los datos quedan almacenados como "coordenadas".
		
		//Ej. Declarar un array bidimensional de números enteros
		
		int [][] matriz = new int [3][3]; //[filas] [columnas]
		
		//Ej. de llenado de un array de dos dimensiones
		
		matriz [0] [0] = 1;
		matriz [0] [1] = 2;
		matriz [0] [2] = 3; //[1][2][3]
		
		matriz [1] [0] = 4;
		matriz [1] [1] = 5;
		matriz [1] [2] = 6; //[4][5][6]
		
		matriz [2] [0] = 7;
		matriz [2] [1] = 8;
		matriz [2] [2] = 9; //[7][8][9]
		
		//Otra forma de tener un array de dos dimensiones pero con los valores desde un inicio
		
		int [][] matriz2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{10, 11, 12}};
		
		//Si queremos imprimir u obtener un valor de una determinada posición:
				
		System.out.println(matriz2[1][1]);
		
		//Para recorrer un array de dos dimensiones utilizamos ciclos anidados
		
		for (int i = 0; i < matriz2.length; i++) { //matriz2.length únicamente reconoce las filas
			System.out.println();
			for (int j = 0; j < matriz2[i].length; j++) { //agregando [i] puede leer la matriz completa, sin importar
				//la cantidad de filas
				System.out.print(matriz2[i][j] + " ");
				
			}
		}
		
		

	}

}
