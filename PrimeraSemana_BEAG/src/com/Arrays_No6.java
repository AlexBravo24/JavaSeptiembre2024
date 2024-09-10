package com;

public class Arrays_No6 {

	public static void main(String[] args) {

		// También conocidos como "Vesctor" "Arreglo"
		// Los arrays son una estructura de datos que almacenan un tipo de datos en
		// común
		// Ejemplos: sólo números enteros, sólo decimales, sólo cadenas de texto, etc.
		// Necesitan tener un tamaño declarado o longitud
		// y estos no pueden crecer en tiempo de ejecución

		// Ejemplo:
		// a) Declarar un ARRAY DE CARACTERES, que almacene 6 caracteres
		char[] nombre = new char[7]; // ya está iniciado el array o declarado su tamaño
		// Sin embargo, está vacío

		// Para asignar datos o valores a cada posición del array

		nombre[0] = 'A'; // dentro de los corchetes indocamos la posición a la que asignaremos un valor a guardar
		nombre[1] = 'l';
		nombre[2] = 'e';
		nombre[3] = 'x';
		nombre[4] = 'i';
		nombre[5] = 's';
		//Nada impide seguir declarando o agregando valores al array, pero este no se redimensiona
		nombre [6] = ' '; //este caracter no aparecería en la impresión, pero si tenemos que considerar en "char[] nombre = new char[7]" poner hasta el 7

		//En el caso de los Arrays de caracteres, puedo mandarlo a "imprimir en consola" en una sola intención y sí me muestra los valores
		System.out.println(nombre); //Únicamente esto funciona para el ARRAY DE CARACTERES
		
		
		
		// b) Declara un ARRAY DE NÚMEROS ENTEROS
		int [] numeros = new int [5];
		
		numeros [0] = 10;
		numeros [1] = 11;
		numeros [2] = 12;
		numeros [3] = 13;
		numeros [4] = 14;
		
		//Podemos mandar a imprimir posición por posición si es que requerimos un elemento específico
		System.out.println(numeros[4]); //Tenemos que especificar qué posición queremos imprimir
		
		//Podemos mandar a imprimir en consola el valor de la suma de ciertas posiciones
		System.out.println(numeros[4] + numeros[0]);
		
		//Ejemplo de un array ya con elementos almacenados desde un inicio
		int [] numeros2 = {10, 11, 12, 13, 14}; //5 elementos, donde el 10 comienza en la posición cero
		
		System.out.println(numeros2[2]);
		
		//Si necesitaramos imprimir en consola todos los valores de una array
		//lo recorremos con un ciclo for
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//-----------------------------------------------------------
		
		// CICLO FOR EACH - recorre todo los elementos de un array
		System.out.println("Ejemplo de Ciclo for each");
		
		//Para cada elemento de este tipo de dato: contenido en este array
		for (int i:numeros2) {
			System.out.println(i);
		}
		
		//------------------------------------------------------------
		
		//¿Existe alguna forma de almacenar o tener un array que me permita guardar elementos de todo tipo?
		//Ej. En un array quiero almacenar: string, double, int, chat, etc... ¿Se puede?
		//Sí podemos tener distintos tipos de dato almacenados en un Array
		//Pero éstos se guardan como tipo de dato OBJETO
		
		Object objeto = "String o WORD";
		Object entero = 100;
		Object decimal = 3.1416;
		Object caracter = 'a';
		Object validacion = true;
		
		//Podríamos tener un array de Objetos y almacenar con ello distintos tipos de dato
		Object [] objetos = {"Palabras", 1000, 2.54, true, 'a'};
		
		
		
		
	}

}
