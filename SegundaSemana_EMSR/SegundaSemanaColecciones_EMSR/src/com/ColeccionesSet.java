package com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class ColeccionesSet {

	public static void main(String[] args) {
		// HashSet: No garantiza ningún orden.
		
		
		// Crear un HashSet
        Set<String> mySet = new HashSet<>();

        // Agregar elementos al Set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // Intentar agregar un duplicado
        mySet.add("Apple"); // No se agregará ya que "Apple" ya está en el Set

        // Imprimir el Set
        System.out.println(mySet);
        
        //LinkedHashSet: Mantiene el orden de inserción.
		
     // Crear un LinkedHashSet (mantiene el orden de inserción)
        Set<Integer> numbers = new LinkedHashSet<>();

        // Agregar elementos al Set
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        // Imprimir el Set
        System.out.println(numbers); // Salida: [10, 5, 20]

        
        //TreeSet: Mantiene los elementos ordenados de manera natural o mediante un comparador.
        // Crear un TreeSet (mantiene los elementos ordenados)
        Set<String> myTreeSet = new TreeSet<>();

        // Agregar elementos al Set
        myTreeSet.add("Banana");
        myTreeSet.add("Apple");
        myTreeSet.add("Orange");

        // Imprimir el Set (automáticamente ordenado)
        System.out.println(myTreeSet); // Salida: [Apple, Banana, Orange]
        
//        La interfaz Set define una colección que no puede contener elementos duplicados. Esta interfaz contiene, únicamente, los métodos heredados de Collection añadiendo la restricción de que los elementos duplicados están prohibidos. Es importante destacar que, para comprobar si los elementos son elementos duplicados o no lo son, es necesario que dichos elementos tengan implementada, de forma correcta, los métodos equals y hashCode. Para comprobar si dos Set son iguales, se comprobarán si todos los elementos que los componen son iguales sin importar en el orden que ocupen dichos elementos.
//
//        Dentro de la interfaz Set existen varios tipos de implementaciones realizadas dentro de la plataforma Java. Vamos a analizar cada una de ellas:
//
//        HashSet: este implementación almacena los elementos en una tabla hash. Es la implementación con mejor rendimiento de todas pero no garantiza ningún orden a la hora de realizar iteraciones. Es la implementación más empleada debido a su rendimiento y a que, generalmente, no nos importa el orden que ocupen los elementos. Esta implementación proporciona tiempos constantes en las operaciones básicas siempre y cuando la función hash disperse de forma correcta los elementos dentro de la tabla hash. Es importante definir el tamaño inicial de la tabla ya que este tamaño marcará el rendimiento de esta implementación.
//        TreeSet: esta implementación almacena los elementos ordenándolos en función de sus valores. Es bastante más lento que HashSet. Los elementos almacenados deben implementar la interfaz Comparable. Esta implementación garantiza, siempre, un rendimiento de log(N) en las operaciones básicas, debido a la estructura de árbol empleada para almacenar los elementos.
//        LinkedHashSet: esta implementación almacena los elementos en función del orden de inserción. Es, simplemente, un poco más costosa que HashSet.
        
	}

}
