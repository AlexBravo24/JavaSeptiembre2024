package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//listas - son una coleccion de datos o elemntos
		//definida como una sucesion de los mismos
		//esta coleccion se implementa a traves de la interface list
		//y por medio de un array redimensionable de la clase
		//array list
		//las listas si admiten valores duplicados es de las colecciones
		//mas utilizadas y con mejor rendimiento 
		//no podemos guardar tipos de dato primitivo
		//pero si valores de tipo objeto (String, wrapper, etc)
		
		//declarar una lista de tipo string
		List<String> lista = new ArrayList<String>();
		
		//agregar elementos a nuestra lista
		lista.add("adriana");
		lista.add("carlos");
		lista.add("sarai");
		lista.add("alberto");
		lista.add("gabriela");
		System.out.println(lista);
		//imprimir o recuperar un solo valor
		System.out.println(lista.get(2));
		
		//devuelve un valor booleano para ver si existe
		
		System.out.println(lista.contains("gabriela"));
		
		//devuelve laposicion donde se encuentra el elemento
		System.out.println(lista.indexOf("alberto"));
//devuelve la ultima posicion donde se encuentra al elemnto
	
		System.out.println(lista.lastIndexOf("sarai"));
	//Eliminar un elemnto de mi lista
		lista.remove(4);
		System.out.println(lista);
		//añadir elemntos a la lista
		lista.add(2, "celso"); //se agrega el elemnto y se desplaza 
		//las posiciones, no reemplaza el elemento del indice indicado
		System.out.println(lista);
		
		//reemplazar el valor de una determinada posicion
		lista.set(3, "sandy");
		System.out.println(lista);
		
		//recuperar o recorrer todos los valores de milista a imprimirlosen una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
			
		}
		//puedo almacenar varios elemntos si parametrizo mi lista
		//con elementos object o si la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add("$");
		System.out.println(coleccion.get(2));
		
	}

}
