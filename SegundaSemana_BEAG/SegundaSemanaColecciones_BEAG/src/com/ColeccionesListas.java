package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		// LISTAS - son una colección de datos o elementos definida como una 
		// sucesión de los mismos
		// Esta colección de implementa a través de la interface List y por 
		// medio de un array redimensionable de la clase ArrayList
		// Las listas si admiten valores duplicados, es de las colecciones más
		// utilizadas y con mejor rendimiento
		// No podemos guardar tipos de dato primitivo 
		// Pero su datos tipo Objeto (String, Wrapper, etc)
		
		// Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>(); 
		
		//DIFERENCIA ENTRE LIST y ARRAYLIST
		//List es la Interfase
		//ArrayList es una clase, esta lista es redimensionable
		
		//Agregar elementos a nuestra lista 
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Hay que acordarnos que la Colección Listas acepta valores repetidos
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2)); //Como es un array, se empieza desde 0, y el valor 2, sería Sarai
		
		//Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Gabriela")); //devuelve un valor booleano "True" o "False"
		
		//Devuelve la posición donde se encuentra el elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la última posición donde se encuentra el elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista: método polimórfico, ya que puedo eliminar por objeto o por índice
		// lista.remove("Alberto"); //Eliminar por objeto directo
		lista.remove(5); //Eliminar por índice
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posición
		lista.add(2, "Celso"); //Desplaza los valores hacia adelante para incluir el nuevo elemento
		//No reemplaza el elemento del índice indicado
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posición
		lista.set(3, "Sandy");
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos Objecto o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		//También puedo quitar "Object"
		//List coleccion = new ArrayList();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
	}

}
