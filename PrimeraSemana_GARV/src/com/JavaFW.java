package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases File y FileWriter
		
		String frase = "\nHola Generaci�n 166"; // el comando \n es para agregar una l�nea
		
		try {
			File archivo = new File ("C:\\Users\\Adrian Ruiz\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			//FileWriter linea = new FileWriter(archivo);
			//La clase FileWriter va a requerir como argumento la ruta del fichero (archivo)
			//y un valor booleano (true) para poder conservar la info en el archivo original
			
			//Utilizamos a trav�s del objeto l�nea el m�todo .write
			linea.write(frase);
			
			linea.close();  //Con esta l�nea se guardan los cambios en el archivo
			
			System.out.println("Archivo guardado correctamente. Se actualiz� con: ");
			System.out.println(frase);
						
		} catch (Exception e) {
			System.out.println("No encontr� el archivo");
		}
		

	}

}
