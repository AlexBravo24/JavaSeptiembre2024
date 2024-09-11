package com;

public class Arrays {

	public static void main(String[] args) {
		
		// Los Arrays son una estructura de datos que almacena un tipo de datos en com�n
		//Ej. S�lo n�meros enteros, s�lo decimales, s�lo cadenas de texto, etc.
		//Necesitan tener un tama�o declarado o longitud, y estos no pueden crecer en tiempo de ejecuci�n.
		
		//Ejemplo, declarar un array de caracteres que almacene 6 caracteres.
		
		char [] nombre = new char [7]; //Ya est� declarado el tama�o del array
		
		//Asignando datos o valores a cada posici�n de array
		
		
		nombre [0] = 'A'; //dentro de los corchetes indicamos la posici�n a la que asignaremos el valor a guardar
		nombre [1] = 'l';
		nombre [2] = 'e';
		nombre [3] = 'x';
		nombre [4] = 'i';
		nombre [5] = 's';
		//Nada impide seguir declarando o agregando valores al array, pero este no se redimensiona
		nombre [6] = ' ';
	
		//En el caso de los array de caracteres se puede mandar a imprimir en consola en una sola intenci�n
		//y muestra los valores
		
		System.out.println(nombre);

		//declarando un array de n�meros enteros
		
		int [] numeros = new int [5];

		numeros [0] = 10;
		numeros [1] = 11;
		numeros [2] = 12;
		numeros [3] = 13;
		numeros [4] = 14;
		
		System.out.println(numeros);
		
		//podemos mandar a imprimir posici�n por posici�n si es que requerimos un elemento espec�fico
		
		System.out.println(numeros [4]);
		
		System.out.println(numeros[4] + numeros[0]);
		
		//Ejemplo de un array con elementos almacenados desde un inicio
		
		int [] numeros2 = {10, 11, 12, 13, 14};
		
		System.out.println(numeros2 [2]);
		
		//Si necesitamos imprimir en consola todos los valores de un array lo recorremos con
		//un ciclo for
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		//Ciclo for each - recorre todos los elementos de un array
		System.out.println("Ejemplo de ciclo for each");
		//Para cada elemento de este tipo de dato: contenido en este array
		for (int i:numeros2) {
			System.out.println(i);
		}
		
		//�Existe alguna forma de almacenar o tener un array que me permita guardar elementos de todo tipo?
		//Ej. En un array quiero almacenar String, double, int, chat, etc... �Se puede?
		
		Object objeto = "String o WORD";
		Object entero = 100;
		Object decimal = 3.1416;
		Object caracter = 'a';
		Object validaci�n = true;
		
		//Podr�amos tener un array de objetos y almacenar con ello "distintos tipos de datos".
				
		Object [] objetos = {"Palabras", 100, 2.54, true, 'a'};
		
		
		
	}

}
