package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {

		// La interfaz Map asocia o almacena los datos en pare (clave - valor a
		// almacenar)
		// Las claves NO PUEDEN DUPICLARSE, pero los valores SI PUEDEN

		// Es decir, la clave actúa como un identificador único para cada elemento a
		// almacenar (ID)

		// Declaración de un Map y la clase HashMap para almacenar claves de tipo
		// Integer y elementos de tipo String
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Map es la Interfase
		//HashMap es la clase
		
		//Agregamos elementos a nuestro HashMap
		//La ventaja del HashMap es que no tienes que poner en orden las claves
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Impresión de HashMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//Mandar a imprimir cada una de las llaves con un ciclo for each
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//Mandar a imprimir cada una de los valores con un ciclo for each
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave: " + i + " " + "Valor: " + usuarios.get(i));
		}
		

	}

}
