package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// Uso de las clases File y FileWritter
		
		String frase = "\nHola Generación 166";
		
		try {
			File archivo = new File("C:\\Users\\Marco\\OneDrive\\Escritorio\\Fichero.txt");
			//FileWriter linea = new FileWriter(archivo,true);
			FileWriter linea = new FileWriter(archivo);
			//La clase FileWriter va a requerir como argumento
			//la ruta del fichero(Archivo) y un valor booleano true para
			//poder conservar la info en el archivo original
			
			//Utilizamos a traves del objeto linea el metodo .write
			linea.write(frase);
			
			linea.close(); //con esta linea se guardan los cambios en el archivo
			
			System.out.println("Archivo guardado correctamente. Se actualizo con: ");
			System.out.println(frase);
			
		} catch (Exception e) {
			System.out.println("No encontré el archivo");
		}

	}

}
