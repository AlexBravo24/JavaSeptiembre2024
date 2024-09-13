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

//		names.add(0); // No se podr�a ejecutar porque los elementos de HashSet no est�n particularmente en orden.
		// Por eso, ponemos el elemento tal y como se llama:
		names.remove("Walter");

//		System.out.println(names);

//		System.out.println(names.contains("Sara"));

		for (String name : names) {
			System.out.println(name);
		}

		// Lambda: expresi�n lambda para iterar sobre cada elemento del Set
		// y ejecutar el m�todo println de System.out en cada uno de ellos
		// Expresi�n lambda es una forma m�s moderna y compacta de iterar sobre los
		// elementos de un Set,
		// utilizando una referencia de m�todo
//		names.forEach(System.out::println);

		// Uso de iterador: es una forma m�s tradicional que te da un control m�s
		// expl�cito sobre la iteraci�n, permitiendo tambi�n la eliminaci�n de elementos
		// durante la iteraci�n
		Iterator<String> namesIterator = names.iterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
		
		
		
		//�Para qu� o en qu� momento ocupamos las Colecciones Set?
		//Cuando uno tenga una colecci�n de elementos que no queramos duplicaciones en �l
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
