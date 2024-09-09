package com;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * Los arrays son una estructura de datos que almacenan un tipo de datos en
		 * comun Ej. Solo numeros enteros, solo decimales, solo cadenas de texto, etc.
		 * Necesitan tener un tamaño declarado o longitud y estos no pueden crecer en
		 * tiempo de ejecucion
		 */

		// Ejemplo, declarar un Array de caracteres q almacene 6 caracteres

		char[] nombre = new char[7]; // Ya esta iniciado el array o declarado
		// su tamaño

		// Asignando datos o valores a cada posicion del array

		nombre[0] = 'A'; // Dentro de los corchetes indicamos la posicion
		// a la que asignaremos un valor a guardar
		nombre[1] = 'l';
		nombre[2] = 'e';
		nombre[3] = 'x';
		nombre[4] = 'i';
		nombre[5] = 's';
		// Nada impide seguir declarando o agregando valores al array, pero este
		// no se redimenciona
		nombre[6] = ' ';

		// En el caso de los Arrays de caracteres, puedo mandarlo a "imprimir en
		// consola"
		// en una sola interacion y si me muesta los valores
		System.out.println(nombre);

		// Declaramos un array de numeros enteros
		int[] numeros = new int[5];

		numeros[0] = 10;
		numeros[1] = 11;
		numeros[2] = 12;
		numeros[3] = 13;
		numeros[4] = 14;

		System.out.println(numeros);

		// Podemos mandar a imprimir posicion por posicion si es que requerimos un
		// elemento
		// especifico

		System.out.println(numeros[4]);

		// Ejemplo de un array ya con elementos almacenados desde un inicio

		int[] numeros2 = { 10, 11, 12, 13, 14, 15 };

		System.out.println(numeros2[2]);

		// Si necesitamos imprimir en consola todos los valores de una array
		// lo recorremos con un ciclo for

		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		// Ciclo for each - recorre todos los elementos de un array
		System.out.println("Ejemplo de ciclo for each");
		// Para cada elemento de este tipo de dato: contenido en este array
		for (int i : numeros2) {
			System.out.println(i);
		}

		/*
		 * Existe alguna forma de tener un array que me permita guardar elementos de
		 * todo tipo? Ej. En un array quiero almacenar String, double, int, chat, etc...
		 * Se puede?
		 */
		
		Object objeto ="String o WORD";
		Object entero = 100;
		Object decimar= 3.1416;
		Object caracter = 'a';
		Object validacion= true;
		
		//Podriamos tener un array de Objetos y almacenar con ello
		//distintos tipos de dato
		
		Object[] objetos = {"Palabras", 1000, 2.54, true, 'a'};
	}

}
