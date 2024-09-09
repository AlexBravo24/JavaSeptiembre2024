package com;

import java.io.File;
import java.io.FileWriter;

public class JavFW {

	public static void main(String[] args) {
		// Uso de las clases File y FileWriter

		String frase = "\nHola Generacion 166";
		
		try {
			File archivo = new File ("C:\\Users\\osval\\Desktop\\Fichero.txt");
			//FileWriter linea = new FileWriter(archivo,true);
			FileWriter linea = new FileWriter(archivo);
			//La clase Filewriter va a requerir como argumento 
            // la ruta del fichero (archivo) y un valor booleano true para
            //poder conservar la info en el archivo original
            
            //utilizamos a travez del objeto linea el metodo .write
            linea.write(frase);
            
            linea.close(); // Con esta linea se guardan los cambios en el archivo
            System.out.println("Archivo guardado correctamente. Se actualizo con: ");
            System.out.println(frase);
		} catch (Exception e) {
			System.out.println("No se encontro el archivo");
		}
		
		
		
		
	}

}
