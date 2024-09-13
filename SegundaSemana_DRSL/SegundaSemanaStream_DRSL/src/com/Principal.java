package com;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class Principal {

	public static void main(String[] args)
	{
		Stream<String> nombre = Stream.of("Calors","Frida","Alex","Alberto")
				.filter(item -> item.contains("i"));
		List<String> names = nombre.collect(Collectors.toList());
		
		//System.out.println(names);
		
		// Ejemplo con objetos 
		
		List<Persona> original = new ArrayList<Persona>();
		
		List<Persona> filtrada = new ArrayList<Persona>();
		
		original.add(new Persona("Juan", "M" , 15));
		original.add(new Persona("Pedro", "M" , 16));
		original.add(new Persona("Lalo", "M" , 17));
		original.add(new Persona("Alicia", "F" , 18));
		original.add(new Persona("Juana", "F" , 15));
		original.add(new Persona("Jesus", "M" , 16));
		original.add(new Persona("Marco", "M" , 17));
		original.add(new Persona("Peter", "M" , 18));
		original.add(new Persona("Gabriela", "F" , 15));
		// FOR NORMAL
//		for (int i = 0; i < original.size(); i++) 
//		{
//			System.out.println(original.get(i));
//		}
		//FOREACH A LO VIKING0
//		for(Persona i: original)
//		{
//			if(i.getGenero().equals("M"))
//			{			
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		//FOREACH CON STREAMS ELEGANTES
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("F"))
//				.collect(Collectors.toList());
//		filtrada.forEach(a-> System.out.println(a));
//		//ORDENAMIENTO DE MENOR A MAYOR
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		filtrada.forEach(System.out::println);
		//original.forEach(a -> System.out.println(a));
		original.stream().count();	
		boolean alguno = original.stream().anyMatch(a-> a.getEdad()>30);
		System.out.println(alguno);
		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}
	
}
