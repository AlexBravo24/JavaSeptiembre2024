package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//Lectura de archivos con las clases File, FileReader y BufferedReader
		
		//Declaramos un String donde guardar la info de las l�neas o l�nea que
		//vamos a leer de nuestro archivo

		String linea;
		
		//Vamos a utilizar la estructura try and catch por si existe alguna excepci�n
		//Esta estructura es �til cuando tenemos comunicaci�n con programas o archivos "externos"
		//o conversi�n de informaci�n o tipos de dato
		
		try { //intenta ejecutar lo siguiente
		//La clase File necesita como argumento en string la ruta de donde se encuentra el archivo
			
			File archivo = new File ("C:\\Users\\Adrian Ruiz\\Desktop\\fichero.txt");
			//Necesitamos abrir el archivo en modo lectura con la clase FileReader
			FileReader fr = new FileReader(archivo);
			//Necesitamos ahora a la clase BufferedReader para poder leer el archivo
			BufferedReader buffer = new BufferedReader (fr);
			
			//Primero necesitamos "cargar el archivo" con la clase "File", posteriormente se "abre"
			//con la clase "FileReader" para poder leerlo con la clase "BufferedReader"
			
			//Ya podemos leer el contenido con el m�todo .readLine() a trav�s del objeto buffer
			//y podemos guardar esa info en la variable o String l�nea
			
			//Podemos incluir la lectura de la l�neas en un ciclo para que mientras existan l�neas
			//que no sean vacias, se pueda seguir asignando e imprimiendo en consola
			
			while ((linea = buffer.readLine()) !=null){
				System.out.println(linea);
			}
			
			//De esta forma ya puedo presentar la info. en la consola
			
			
		} catch (Exception e) {  //si hay una excepci�n atr�pala aqu� y ejecuta lo siguiente
			//En este bloque puedo mandar a ejecutar algo en caso de que el "try" falle
			//Si quiero ver el mensaje de una posible excepci�n que queda atrapada en el objeto "e"
			//lo hago con la siguiente l�nea
			
			e.printStackTrace();
			System.out.println("No se encontr� el archivo");
		}
		
		
		
		
		
	}

}
