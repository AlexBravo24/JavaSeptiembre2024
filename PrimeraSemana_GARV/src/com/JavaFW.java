package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases File y FileWriter
		
		String frase = "\nHola Generación 166"; // el comando \n es para agregar una línea
		
		try {
			File archivo = new File ("C:\\Users\\Adrian Ruiz\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			//FileWriter linea = new FileWriter(archivo);
			//La clase FileWriter va a requerir como argumento la ruta del fichero (archivo)
			//y un valor booleano (true) para poder conservar la info en el archivo original
			
			//Utilizamos a través del objeto línea el método .write
			linea.write(frase);
			
			linea.close();  //Con esta línea se guardan los cambios en el archivo
			
			System.out.println("Archivo guardado correctamente. Se actualizó con: ");
			System.out.println(frase);
						
		} catch (Exception e) {
			System.out.println("No encontré el archivo");
		}
		

	}

}
