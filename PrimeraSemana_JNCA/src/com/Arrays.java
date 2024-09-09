package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los arrays son una estructura de datos
		//que almacenan un tipo de datos en comun
		//Ej. Solo numeros enteros, solo decimales, solo
		//cadenas de texto, etc.
		//Necesitan tener un tamaño declarado o longitud
		//y estos no pueden crecer en tiempo de ejecucion

		//Ejemplo, declarar un Array de caracteres que almacene 6 caracteres
		
		char [] nombre = new char [7]; //ya esta inciado el array o declarado
		//su tamaño
		
		//Asignado datos o valores a cada posicion del array
		
		nombre [0] = 'A'; //Dentro de los corchetes indicamos la posicion
		//a la que asignaremos un valor a guardar
		nombre [1] = 'B';
		nombre [2] = 'C';
		nombre [3] = 'D';
		nombre [4] = 'E';
		nombre [5] = 'F';
        //Nada impide seguir declarando o agregando valores al array, pero este
		//no se redimensiona
		nombre [6] = ' '; 
		
	    //En el caso de los arrays de caracteres, puedo mandarlo a "imprimir en consola"
		//en una sola intencio y si me muestra los valores
		System.out.println(nombre);
		
		//declarando un array de numeros enteros
		
		int [] numeros = new int [5];
		
		numeros[0] = 10;
		numeros[1] = 11;
		numeros[2] = 12;
		numeros[3] = 13;
		numeros[4] = 14;
		
		System.out.println(numeros);
		
		//Podemos mandar a imprimir posicion por posicion si es que requerimos un elemnto
		//especifico
		System.out.println(numeros[4]);
		
		System.out.println(numeros[4] + numeros[0]);
		
		//Ejemplo de un array ya con elementos almacenados desde un inicio
		
		int [] numeros2 = {10, 11, 12, 13, 14}; 
		
		System.out.println(numeros2[2]);
		
		//Si necesitaramos imprimir en consola todod los valores de un array
		//lo recorremos con un ciclo for
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
	
		//ciclo for each - recorre todos los elementos de un array
		System.out.println("Ejemplo de ciclo for each");
		//Para cada elemento de este tipo de dato: contenido en este array
		for (int i:numeros2) {
			System.out.println(i);
		}
		
		//Un array es una estrutura que nos va a permitir almacenar un 
		//conjunto de datos de un mismo tipo de dato
		
		
		//¿Existe alguna forma de almacenar o tener un array que me permita 
		//guardar elementos de todo tipo? Ej. En un array quiero almacenar
		//String, double, int, chat, etc.... Se puede?
		
		Object objeto = "String o WORD";
		Object entero = 100;
		Object decimal = 3.1416;
		Object caracter = 'a';
		Object validacion = true;
		
		//Podriamos tener un array de Objetos y almacenar con ello 
		//"distintos tipos de dato"
		
		Object [] objetos = {"palabras", 1000, 2.54, true, 'a'};
	}
	
}
