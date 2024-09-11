package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		
		//Lectura de archivos con las clases File, FileReader y BufferedReader
		
		//Declaramos un String donde guardar la info de las líneas o línea que
		//vamos a leer de nuestro archivo

		String linea;
		
		//Vamos a utilizar la estructura try and catch por si existe alguna excepción
		//Esta estructura es útil cuando tenemos comunicación con programas o archivos "externos"
		//o conversión de información o tipos de dato
		
		try { //intenta ejecutar lo siguiente
		//La clase File necesita como argumento en string la ruta de donde se encuentra el archivo
			
			File archivo = new File ("C:\\Users\\Adrian Ruiz\\Desktop\\fichero.txt");
			//Necesitamos abrir el archivo en modo lectura con la clase FileReader
			FileReader fr = new FileReader(archivo);
			//Necesitamos ahora a la clase BufferedReader para poder leer el archivo
			BufferedReader buffer = new BufferedReader (fr);
			
			//Primero necesitamos "cargar el archivo" con la clase "File", posteriormente se "abre"
			//con la clase "FileReader" para poder leerlo con la clase "BufferedReader"
			
			//Ya podemos leer el contenido con el método .readLine() a través del objeto buffer
			//y podemos guardar esa info en la variable o String línea
			
			//Podemos incluir la lectura de la líneas en un ciclo para que mientras existan líneas
			//que no sean vacias, se pueda seguir asignando e imprimiendo en consola
			
			while ((linea = buffer.readLine()) !=null){
				System.out.println(linea);
			}
			
			//De esta forma ya puedo presentar la info. en la consola
			
			
		} catch (Exception e) {  //si hay una excepción atrápala aquí y ejecuta lo siguiente
			//En este bloque puedo mandar a ejecutar algo en caso de que el "try" falle
			//Si quiero ver el mensaje de una posible excepción que queda atrapada en el objeto "e"
			//lo hago con la siguiente línea
			
			e.printStackTrace();
			System.out.println("No se encontró el archivo");
		}
		
		
		
		
		
	}

}
