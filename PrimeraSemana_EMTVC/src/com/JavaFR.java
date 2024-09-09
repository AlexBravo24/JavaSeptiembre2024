package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Lectura de archivos con las clases File, FileReader y BufferedReader
		
		//Declaramos un String donde guardar la info de las lineas o linea
		//que vamos a leer de nuestro archivo
		String linea;
		
		//vamos a utilizar la estructura try and catch por si existe alguna excepcion
		//Esta esctructura es util cuando tenemos comunicacion con programas o archivos
		//"Externos" o conversion  de informacion o tipos de datos
		
		try {//Intenta ejecutar lo siguiente
			//La clase File necesita como argumento en String la ruta de donde se encuentra
			//el archivo
			File archivo = new File("C:\\Users\\Marco\\OneDrive\\Escritorio\\Fichero.tx");
			//Necesitamos abrir el archivo en modo lectura con la clase FileReader
			FileReader fr= new FileReader(archivo);
			//Necesitamos ahora a la clase BufferedReader para poder leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Ya podemos leer el contenido con el metodo .readLine() a traves del objeto buffer
			//y podemos guardar esa informacion en la variable o String Linea
			
			//Podemos incluir la lectura de las lineas en un ciclo para que mientras
			//existan lienas que no sean vacias, se puedan seguir asignando e imprimiendo en consola
			
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
				buffer.close(); //Revisar
			}
			
			//De esata forma puedo presentar la info en consola
			//System.out.println(linea);
		}catch(Exception e) {//si hay una excepcion atrapala aqui y ejecuta lo sig
			//Aqui en este bloque puedo mandar a ejecutar algo en caso de que el try falle
			//Objeto "e" lo hago con la siguiente linea:
			e.printStackTrace();
			System.out.println("No funciono we");
		}
		
	}

}
