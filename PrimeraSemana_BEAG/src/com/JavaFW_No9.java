package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW_No9 {

	public static void main(String[] args) {

		// Uso de las clases File y FileWriter

		String frase = "\nHola Generación 166"; // la diagonal invertida + n "\n", es para hacer un salto de línea

		try {
			File archivo = new File("C:\\Users\\fardu\\Desktop\\fichero.txt");
			FileWriter linea = new FileWriter(archivo, true);
			// La clase FileWriter va a requerir como argumento la ruta del fichero (archivo
			// y un valor booleano true para poder conservar la info en el archivo original

			// En caso de que no pongamos la propiedad true, en el bloc de notas se elimina
			// todo el contenido que se tenía y sólo guarda la línea que se le solicita que
			// escriba
			// FileWriter linea = new FileWriter(archivo);
			

			// Utilizamos a través del objeto línea el método .write
			linea.write(frase);

			// Para guardar los cambios en el bloc de notas/archivo:
			linea.close();

			// Para saber si se escribió la línea solicitada en el blos de notas:
			System.out.println("Archivo guardado correctamente. Se actualizón con: ");
			System.out.println(frase);

		} catch (Exception e) {
			System.out.println("No encontré el archivo");
		}

	}

}
