package com;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class ColeccionesSet {

	public static void main(String[] args) {
		// HashSet: No garantiza ning�n orden.
		
		
		// Crear un HashSet
        Set<String> mySet = new HashSet<>();

        // Agregar elementos al Set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // Intentar agregar un duplicado
        mySet.add("Apple"); // No se agregar� ya que "Apple" ya est� en el Set

        // Imprimir el Set
        System.out.println(mySet);
        
        //LinkedHashSet: Mantiene el orden de inserci�n.
		
     // Crear un LinkedHashSet (mantiene el orden de inserci�n)
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

        // Imprimir el Set (autom�ticamente ordenado)
        System.out.println(myTreeSet); // Salida: [Apple, Banana, Orange]
        
//        La interfaz Set define una colecci�n que no puede contener elementos duplicados. Esta interfaz contiene, �nicamente, los m�todos heredados de Collection a�adiendo la restricci�n de que los elementos duplicados est�n prohibidos. Es importante destacar que, para comprobar si los elementos son elementos duplicados o no lo son, es necesario que dichos elementos tengan implementada, de forma correcta, los m�todos equals y hashCode. Para comprobar si dos Set son iguales, se comprobar�n si todos los elementos que los componen son iguales sin importar en el orden que ocupen dichos elementos.
//
//        Dentro de la interfaz Set existen varios tipos de implementaciones realizadas dentro de la plataforma Java. Vamos a analizar cada una de ellas:
//
//        HashSet: este implementaci�n almacena los elementos en una tabla hash. Es la implementaci�n con mejor rendimiento de todas pero no garantiza ning�n orden a la hora de realizar iteraciones. Es la implementaci�n m�s empleada debido a su rendimiento y a que, generalmente, no nos importa el orden que ocupen los elementos. Esta implementaci�n proporciona tiempos constantes en las operaciones b�sicas siempre y cuando la funci�n hash disperse de forma correcta los elementos dentro de la tabla hash. Es importante definir el tama�o inicial de la tabla ya que este tama�o marcar� el rendimiento de esta implementaci�n.
//        TreeSet: esta implementaci�n almacena los elementos orden�ndolos en funci�n de sus valores. Es bastante m�s lento que HashSet. Los elementos almacenados deben implementar la interfaz Comparable. Esta implementaci�n garantiza, siempre, un rendimiento de log(N) en las operaciones b�sicas, debido a la estructura de �rbol empleada para almacenar los elementos.
//        LinkedHashSet: esta implementaci�n almacena los elementos en funci�n del orden de inserci�n. Es, simplemente, un poco m�s costosa que HashSet.
        
	}

}
