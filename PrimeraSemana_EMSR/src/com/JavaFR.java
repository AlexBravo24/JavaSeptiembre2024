package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

	public static void main(String[] args) {
		// Lectura de archivos con las clases file, filereader y bufferedreader
		
		// declaramos un string donde guardar la info de las lineas o linea que vamos
		// a lee de nuestros archivo
		
		String linea;
		 // vamos a utilizar la estructura try and catch por si existe excepcion
		// esta estructura es util cuando tenemos comunicacion con programas o archivos
		// externoso conversion de informacion o tipos de dato
		
		try {//intenta ejecutar lo siguiente
			// La claseFile necesita como argumento en string la ruta de donde se encuentra
			//el archivo
			File archivo = new File ("C:\\Users\\osval\\Desktop\\Fichero.txt");
			//Necesitamos abrir el archivo en modo lectura con la clase FileReader
			FileReader fr = new FileReader(archivo);
			//Necesitamos ahora a la clase BufferedReader para poder leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			// ya podemos leer el contenido con el matodo .readline() a traves del objeto buffer
			//y podemos guardar esa info en la variable o string linea
			
			//podemos incluir la lectura de las lineas en un ciclo para que mientras
			// existan lineas que no sean vacias, se pueden seguir asignando e imprimiendo en consola
			
			while ((linea= buffer.readLine()) !=null) {
			
			// De esta forma ya puedo presentar la info en consola
			System.out.println(linea); }
			
		}catch (Exception e) { // si hay un excepcion atrapala aqui y ejecuta lo sig.
			//Aqui en este bloque puede mandar a ejecutar algo en caso de que el try falle
			// Si quiero ver el mensaje de una posible excepcion que queda atrapada en el
			// objeto "e" lo lo hago con la siguiente linea:
			e.printStackTrace();
			System.out.println("No se encontro el archivo");
			
		}

	}

}
