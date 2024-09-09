package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases File y FileWriter
		
		String frase = "\nHola Generación 166";

		try {
			File archivo = new File("C:\\Users\\Casti\\OneDrive\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			//La clase FileWriter va a requerir como argumento
			//la ruta del fichero (archivo) y un valor booleano true para
			//poder conservar la info en el archivo original
			
			//Utilizamos a traves del objeto linea el metodo .write
			linea.write(frase);
			
			linea.close(); //con esta linea se guardan los cambios en el archivo
			
			System.out.println("Archivo guardado correctamente. Se actualizo:");
			System.out.println(frase);
			
		} catch (Exception e) {
			System.out.println("No encontre el archivo");
		}
	}

}
