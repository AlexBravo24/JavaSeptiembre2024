package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays son una estructura de datos
		//que almacenan un tipo de datos en comun
		//Ej. solo numeros enteros, solo decimales, solo
		//cadenas de texto, etc.
		//Necesitan tener un tamaño declarado o longitud
		//y estos no pueden crecer en tiempo de ejecucion
		
		// Ejemplo, declarar un Array de caracteres que almacene 6 caracters
		
		char[] nombre = new char [7]; //Ya esta iniciado el array o declarado
		//su tamaño
		
		nombre[0] = 'A'; // dentro de los corchetes indicamos la posicion
		// a la que asignaremos un valor a guardar
		nombre[1] = 'l';
		nombre[2] = 'e';
		nombre[3] = 'x';
		nombre[4] = 'i';
		nombre[5] = 's';
		// Nada impide seguir declarando o agregando valores al array, pero este
		//no se redimensiona
		nombre[6] = ' ';
		
		
		// En el caso de los Arrays de caracteres, puedo mandarlo a "imprimir en consola"
		// en una sola intencion y si me muestra los valores
		System.out.println(nombre);
		
		// declaracion un array de numeros enteros
		
		int[] numeros = new int [5];
		
		numeros[0]=10;
		numeros[1]=11;
		numeros[2]=12;
		numeros[3]=13;
		numeros[4]=14;
		
		System.out.println(numeros);
		
		//podemos mandar a imprimir posicion por posicion si es que requerimos un elemento
		// especifico
		System.out.println(numeros[4]);
		
		System.out.println(numeros[4]+ numeros[0]);
		
		// Ejemplo de un array ya con elementos almacenados desde un inicio
		
		int[] numeros2= {10,11,12,13,14};
		
		System.out.println(numeros2[2]);
		
		// Si necesitaramos imprimir en consola todos los valores de una array
		// lo recorremos con un ciclo for
		
		for (int i =0 ; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		// ciclo for each - recorre todos los elementos de un array
		System.out.println("Ejemplo de ciclo for each");
		//Para cada elemento de esto tipo de dato:contenido en este array
		for (int i:numeros2) {
			System.out.println(numeros2[i]);
		}
		
		//¿Existe alguna forma de almacenar otener un array que me permita
		// guardar elementos de todo tipo? Ej. En un array quiero almacenar
		// string, double, int, char, etc... se puede?
		
		Object objeto = "string o word";
		Object entero = "100";
		Object decimal = "3.1416";
		Object caracter = 'a';
		Object validacion = true;
		
		//podriamos tener un array de objetos y almacenar con ello
		// distintos tipos de  dato
		
		Object [] objetos = {"palabras", 1000, 2.54, true,'a'};
	}

}
