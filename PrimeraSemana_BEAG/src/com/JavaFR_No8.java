package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR_No8 {

	public static void main(String[] args) {

		// Lectura de archivos con las clases:
		// File, FileReader y BufferedReader

		// Declaramos un String donde guardar la info de las l�neas o l�nea que vamos a
		// leer de nuestro archivo
		String linea;

		// Vamos a utilizar la estructura Try and Catch por si existe alguna excepci�n
		// Esta estructura es �til cuando tenemos comunicaci�n con programas o archivos
		// "externos" o conversi�n de informaci�n o tipos de datos

		try { // intenta ejecutar lo siguiente
				// La clase File necesita como argumento en String la ruta de donde se encuentra
				// el archivo
			File archivo = new File("C:\\Users\\fardu\\Desktop\\fichero.txt");
			// necesitamos abrir el archivo en modo lectura con la clase FileReader
			FileReader fr = new FileReader(archivo);
			// Ahora necesitamos a la clase BufferedReader para poder leer el contenido del
			// archivo
			BufferedReader buffer = new BufferedReader(fr);

			// Ya podemos leer el contenido con el m�todo .readLine() a trav�s del objeto
			// buffer
			// y podemos guardar esa info en la variable o String linea
//			linea = buffer.readLine(); //Solo lee una sola l�nea

			// Podemos incluir la lectura de las l�neas en un ciclo para que mientras
			// existan l�neas
			// que no sean vac�as, se puedan seguir asignando e imprimiendo en consola
			while ((linea = buffer.readLine()) != null) { // operador !=null se refiere a "diferente de" 
				System.out.println(linea);	// De esta forma ya puedo presentar la info en consola
			}
		

		} catch (Exception e) { // si hay una excepci�n atr�pala aqu� (e) y ejecuta lo siguiente
			// Aqu� en este bloque puedo mandar a ejecutar algo en cado de el try falle
			//Si quiero ver el mensaje de una posible excepci�n que queda atrapada en el obtejo "e"
			//lo hago con la siguiente l�na
			e.printStackTrace();
			System.out.println("No se encontr� el archivo");
		}

	}

}
