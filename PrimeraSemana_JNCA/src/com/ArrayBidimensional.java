package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
		/*ArrayBidimensional es una estructura que pasa
		 * a ser un concepto de "tabla", porque vamos a tener
		 * otra dimension que nos permitira tener
		 * filas y columnas para almacenar la informacion
		 * 
		 * De esta manera los datos quedan almacenados
		 * como en "coordenadas"
		 */

		//Ej. declarar un array bidimensonal de numeros enteros
		int [] [] matriz = new int [3] [3]; //[filas] [columnas] 
		
		//Ej. de llenado de un array de dos dimensiones
		
		matriz [0] [0] = 1;
		matriz [0] [1] = 2;
		matriz [0] [2] = 3;  //[1] [2] [3]
		
		matriz [1] [0] = 4;
		matriz [1] [1] = 5;
		matriz [1] [2] = 6;  //[4] [5] [6]
		
		matriz [2] [0] = 7;
		matriz [2] [1] = 8;
		matriz [2] [2] = 9;  //[7] [8] [9]
		
		//Otra forma de tener un array de dos dimensiones pero con los valores
		//desde un inicio
		int [] [] matriz2 = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
		
		//si queremos imprimir u obtener un valor de una ddeterminada posicion
		
		System.out.println(matriz2 [2][0]);
		
		//Para recorre un array de dos dimensiones utilizamos ciclos anidados
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
		}
		
	}

}
