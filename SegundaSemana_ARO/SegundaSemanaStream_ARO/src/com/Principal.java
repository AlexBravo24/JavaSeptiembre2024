 package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//API stream es una funcionabvilidad
		//que permite gestionar de una forma mas
		//rapida e imperatica la informacion que tengamos
		// en nuestra coleccion de datos
		//las colecciones se vuelven un flujo de datos
		// a partir del cual podemos solicitar la informacion
		// que necesitemos
		
		Stream<String> nombres = Stream.of("carlos", "frida", "alex", "Alberto").filter(item -> item.contains("o"));
		//una vez filtrada la informacion la llevo a una lista
		List<String> names = nombres.collect(Collectors.toList());
		//mostrar los resultados en persona
		//System.out.println(names);
		
		//declaramos una lista para guardar a nuestros objetos persona
		List<Persona> original = new ArrayList<Persona>();
		
		//creamos una lista para recoelctar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//añadir elementos a mi lista
		original.add(new Persona("Jorge","MASCULINO",37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Luciana", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 17));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 22));
		
		//imprimir la lista orignal en consola
		System.out.println(original);
		//recorrer nuestra lista cada elenmento con un for
		//for (int i = 0; i < original.size(); i++) {
			
			//System.out.println(original.get(i));
		//}
		//recupera todos los elemntos con el ciclo foreach
		//for (Persona i:original) {
			//System.out.println(i);
		//}
		//for each pero ahopra a traves de nuestra lista
		//original.forEach(a -> System.out.println(a));
		
		//si filtraramos a los elemntos del genero masculino
		//con un ciclo convencional
		//for (Persona i: original) {
			//if(i.getGenero().equals("MASCULINO")) {
			//filtrada.add(i);
		//System.out.println(i);
		//	
		//}
		//filtrar con el api stream a las personas del genero femenino
		//filtrada = original.stream()
		//.filter(item -> item.getGenero().equals("FEMENINO"))
		//	.collect(Collectors.toList());
		//	
		//filtrada.forEach(a-> System.out.println(a));
//ordenar a las personas por edad ascendente
		//filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
			//	.collect(Collectors.toList());
		//filtrada.forEach(System.out::println);
		
		//contar el numero de elemtos en lista
//System.out.println(original.stream().count());
		//segundo metodo
	long conteo = original.parallelStream().count();
	System.out.println(conteo);
	
	//solicitar una cariable boolean si algun elemnto o todos
	//los elemntos cumplen alguabn condicion
	//boolean alguno =original.parallelStream().anyMatch(a-> a.getEdad()<30);
	//System.out.println(alguno);
	
	//retornar un valor a una clase Optional
	//optional es una clase no nos permite manejar valores nulos
	//en caso de que no se encuentren 
	
	Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
	System.out.println(menorEdad);
	
	}

}
