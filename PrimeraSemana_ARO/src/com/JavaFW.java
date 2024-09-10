package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// uso de las clases file y filewriter
		String palabra = "\n hola generacion 166";
		try {
			File archivo = new File("C:\\Users\\Aerre\\OneDrive\\Desktop\\fichero.txt");
		FileWriter linea = new FileWriter(archivo,true);
		linea.write(palabra);
linea.close();
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("no se encontro");
		}
	}

}
