package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ColeccionesSet {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=QvHBHuuddYk
		
		//COLECCIONES SET: HashSet

		Set<String> names = new HashSet<>();

		names.add("Walter");
		names.add("Jesse");
		names.add("Sussan");
		names.add("Michael");
		names.add("Sara");
		names.add("Walter"); // Set doesn't allow duplicates, so "Walter" will only appear once

		System.out.println(names);

//		names.add(0); // No se podría ejecutar porque los elementos de HashSet no están particularmente en orden.
		// Por eso, ponemos el elemento tal y como se llama:
		names.remove("Walter");

//		System.out.println(names);

//		System.out.println(names.contains("Sara"));

		for (String name : names) {
			System.out.println(name);
		}

		// Lambda: expresión lambda para iterar sobre cada elemento del Set
		// y ejecutar el método println de System.out en cada uno de ellos
		// Expresión lambda es una forma más moderna y compacta de iterar sobre los
		// elementos de un Set,
		// utilizando una referencia de método
//		names.forEach(System.out::println);

		// Uso de iterador: es una forma más tradicional que te da un control más
		// explícito sobre la iteración, permitiendo también la eliminación de elementos
		// durante la iteración
		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		
		
		
		//¿Para qué o en qué momento ocupamos las Colecciones Set?
		//Cuando uno tenga una colección de elementos que no queramos duplicaciones en él
		//y no nos importe el orden
	
		//Podemos ocupar Set para analizar todos los elementos de una lista y eliminar los
		//repetidos
		
		//We can use Set for removing duplicate items in a list, for example:
		
		List<Integer> numberList = new ArrayList<>();
		
		//Por ejemplo, tenemos una lista con elementos duplicados:
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(2);
		numberList.add(1);
		System.out.println(numberList);
		
		
		Set<Integer> numberSet = new HashSet<>(numberList);
		System.out.println(numberSet);
		
		

	}

}
