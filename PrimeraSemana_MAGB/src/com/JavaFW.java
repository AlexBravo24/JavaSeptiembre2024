package com;

import java.io.File;
import java.io.FileWriter;


public class JavaFW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//frase a editar en el acrchivo
		String frase = "hola, buenos dias";
		try {
			
			//ruta
			File archivo = new File("C:\\Users\\PC\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			//la clase FileWriter va a requerir agumento
			//la rutal del archivo y un valor booleano (tru), sin ese valor, borrara el contenido anteior
			
			//utilizamos a traves del objeto linea el metodo .wirte para escribir y editar el archivo
			linea.write(frase);
			linea.close();
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
