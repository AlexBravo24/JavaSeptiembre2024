package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lectura de archivos con las clases file, filereader  y bufferedreader
		//Declaramos una linea para poder leer
		
		String linea;
		
		try {
			File archivo = new File("C:\\Users\\PC\\Desktop\\fichero.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			linea = buffer.readLine();
			System.out.println(linea);
			
			//null significa que sea diferente de haber funcionado, es decir null es "no  funciona" o "no obtuvido"
			while ((linea = buffer.readLine()) != null) {
				System.out.println();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
