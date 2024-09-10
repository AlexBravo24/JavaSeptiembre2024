package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW_No9 {

	public static void main(String[] args) {

		// Uso de las clases File y FileWriter

		String frase = "\nHola Generaci�n 166"; // la diagonal invertida + n "\n", es para hacer un salto de l�nea

		try {
			File archivo = new File("C:\\Users\\fardu\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			// La clase FileWriter va a requerir como argumento la ruta del fichero (archivo
			// y un valor booleano true para poder conservar la info en el archivo original

			// En caso de que no pongamos la propiedad true, en el bloc de notas se elimina
			// todo el contenido que se ten�a y s�lo guarda la l�nea que se le solicita que
			// escriba
			// FileWriter linea = new FileWriter(archivo);
			

			// Utilizamos a trav�s del objeto l�nea el m�todo .write
			linea.write(frase);

			// Para guardar los cambios en el bloc de notas/archivo:
			linea.close();

			// Para saber si se escribi� la l�nea solicitada en el blos de notas:
			System.out.println("Archivo guardado correctamente. Se actualiz�n con: ");
			System.out.println(frase);

		} catch (Exception e) {
			System.out.println("No encontr� el archivo");
		}

	}

}
