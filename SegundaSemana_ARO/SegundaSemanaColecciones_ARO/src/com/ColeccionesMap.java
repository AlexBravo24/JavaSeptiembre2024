package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		//la interface map asocia o almacena los datos
		//en pares (clave - valor a almacenar)
		//las claves no pueden duplicarse
		
		//es decir, la clave actua como un identificador unico
		//para cada elemnto
		
		//declaracion de un map y la clase hash map
		//para almacenar claves
		//tring
		Map<Integer,String> usuarios = new HashMap<Integer,String>();
//agregamos elementos a nuestro hashmap
		usuarios.put(1, "Angel");
		usuarios.put(3, "karla");
		usuarios.put(2, "pedro");
		System.out.println(usuarios);
		
		//imprimir un solo valor almacenado en una clave
		System.out.println(usuarios.get(2));
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//nos da el valor en tipo entero del numero de llaves que tenemos
		System.out.println(usuarios.keySet());
		
		//imprimir en consola los valores contenidos en mi hashmap
		System.out.println(usuarios.values());
		
		//mandar a imprimir cada una de las llaves
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);}
			
		for (String i : usuarios.values()) {
			System.out.println(i);}
			
			//imprimir llaves y valores
			for(Integer i: usuarios.keySet()) {
				System.out.println("llave: " + i + " valor " + usuarios.get(i));
			}
		}
	}


