package com;

public class Arrays_No6 {

	public static void main(String[] args) {

		// Tambi�n conocidos como "Vesctor" "Arreglo"
		// Los arrays son una estructura de datos que almacenan un tipo de datos en
		// com�n
		// Ejemplos: s�lo n�meros enteros, s�lo decimales, s�lo cadenas de texto, etc.
		// Necesitan tener un tama�o declarado o longitud
		// y estos no pueden crecer en tiempo de ejecuci�n

		// Ejemplo:
		// a) Declarar un ARRAY DE CARACTERES, que almacene 6 caracteres
		char[] nombre = new char[7]; // ya est� iniciado el array o declarado su tama�o
		// Sin embargo, est� vac�o

		// Para asignar datos o valores a cada posici�n del array

		nombre[0] = 'A'; // dentro de los corchetes indocamos la posici�n a la que asignaremos un valor a guardar
		nombre[1] = 'l';
		nombre[2] = 'e';
		nombre[3] = 'x';
		nombre[4] = 'i';
		nombre[5] = 's';
		//Nada impide seguir declarando o agregando valores al array, pero este no se redimensiona
		nombre [6] = ' '; //este caracter no aparecer�a en la impresi�n, pero si tenemos que considerar en "char[] nombre = new char[7]" poner hasta el 7

		//En el caso de los Arrays de caracteres, puedo mandarlo a "imprimir en consola" en una sola intenci�n y s� me muestra los valores
		System.out.println(nombre); //�nicamente esto funciona para el ARRAY DE CARACTERES
		
		
		
		// b) Declara un ARRAY DE N�MEROS ENTEROS
		int [] numeros = new int [5];
		
		numeros [0] = 10;
		numeros [1] = 11;
		numeros [2] = 12;
		numeros [3] = 13;
		numeros [4] = 14;
		
		//Podemos mandar a imprimir posici�n por posici�n si es que requerimos un elemento espec�fico
		System.out.println(numeros[4]); //Tenemos que especificar qu� posici�n queremos imprimir
		
		//Podemos mandar a imprimir en consola el valor de la suma de ciertas posiciones
		System.out.println(numeros[4] + numeros[0]);
		
		//Ejemplo de un array ya con elementos almacenados desde un inicio
		int [] numeros2 = {10, 11, 12, 13, 14}; //5 elementos, donde el 10 comienza en la posici�n cero
		
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
		
		//�Existe alguna forma de almacenar o tener un array que me permita guardar elementos de todo tipo?
		//Ej. En un array quiero almacenar: string, double, int, chat, etc... �Se puede?
		//S� podemos tener distintos tipos de dato almacenados en un Array
		//Pero �stos se guardan como tipo de dato OBJETO
		
		Object objeto = "String o WORD";
		Object entero = 100;
		Object decimal = 3.1416;
		Object caracter = 'a';
		Object validacion = true;
		
		//Podr�amos tener un array de Objetos y almacenar con ello distintos tipos de dato
		Object [] objetos = {"Palabras", 1000, 2.54, true, 'a'};
		
		
		
		
	}

}
