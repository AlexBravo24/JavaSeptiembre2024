package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Listas - Son una coleccion de datos o elementos definida como
		//una sucesion de los mismos
		//Esta coleccion se imlementa a traves de la interface List
		//y por medio dde un array redimensionable de la clase
		//ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//Pero si datos de tpo Objeto (String, Wrapper, etc)
		
		//Declarar una lista de elementos de tipo String 
		List<String> lista = new  ArrayList<String>();
		
		//Agregar elementos a nuestra lista
		lista.add("Jesus");
		lista.add("Narciso");
		lista.add("Maria");
		lista.add("Aguilar");
		lista.add("Janet");
		lista.add("Maria");
		
		//Imprimir una lista en consol
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(3));
		
		//Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Janet"));
		
		//Devuelve la posicion donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Maria"));
		
		//Devuelve la ultima posicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Maria"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la lista,indicando una determinada posicion
		lista.add(2, "Catalina"); //Se agrega el elemento y desplaza
		//las posiciones. No remplaza el elemento del indice indicado
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	
		//Puedo alamcenar varios elementos si parametrizo mi lista
		//con elementos object o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Nombre");
		coleccion.add(25);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
	}

	}


