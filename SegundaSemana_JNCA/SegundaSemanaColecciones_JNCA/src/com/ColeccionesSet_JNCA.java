package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionesSet_JNCA {

	public static void main(String[] args) {
		
		//Los Set Son parte fundamental de la coleccion de datos y 
		//bastante utiles para trabajar con conjuntos de elementos unicos
		
		//Un set es una coleccion que no permite elementos duplicados
		//Es decir que no permite añadir un elemento que ya este 
		//presente en el conjunto
		
		//IMPLEMENTACIONES DE SET
		//HashSet: es la implementacion mas comun y utiliza una tabla hash
		//para almacenar los elementos y no garantiza el orden de este
		//ofrece operaciones de tiempo constante para la mayoria de las 
		//operaciones basicas (como añadir, eliminar y comprobar la presencia
		//de un elemento
		
		Set<String> hashSet = new HashSet<>();
        hashSet.add("manzana1");
        hashSet.add("durazno2");
        hashSet.add("guayaba3");
        hashSet.add("manzana1"); // Duplicado, no se añadirá
        System.out.println("HashSet: " + hashSet);
		
		//LinkedHashSet: mantiene en orden la insercion de los elementos
        //Es util si necesitas preservar el orden en el que se añadieron
        //los elementos
		
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("manzana1");
        linkedHashSet.add("durazno2");
        linkedHashSet.add("guayaba3");
        linkedHashSet.add("manzana1"); // Duplicado, no se añadirá
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
		//TreeSet: Implementa la interfaz "NavigableSet" y almacena los elementos
		//en un arbol rojo-negro. Los elementos en un "TreeSet" estan ordenados
		//segun su orden natural o segun un "comparator" proporcionado en el 
		//momento de la creacion

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("manzana1");
        treeSet.add("durazno2");
        treeSet.add("guayaba3");
        treeSet.add("manzana1"); // Duplicado, no se añadirá
        System.out.println("TreeSet: " + treeSet);
        
	}

}
