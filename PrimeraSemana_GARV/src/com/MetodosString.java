package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos de la clase String
		//String es un tipo de dato objeto, por lo cual cuenta con metodos o propiedades para manipular o consultar su informacion
		
		String cadena = "Hoy es 3 de Septiembre de 2024";
		
		//.length() - Nos devuelve el tamaño o longitud de la cadena en un valor numérico entero
		System.out.println("Probando el método .length()");
		//Si necesitara guardar el valor de la longitud de la cadena se puede hacer así:
		int longitud = cadena.length();
		//System.out.println(cadeba.length());
		System.out.println(longitud);
		
		//.charAt() - Nos devuelve el caracter que se encuentra en el índice especificados
		
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(cadena.length()-1)); //29
		
		//.substring() - Nos devuelve una subcadena  a partir del índice especificado
		System.out.println("Probando el método .subtring()");
		System.out.println(cadena.substring(20));
		System.out.println(cadena.substring(20, 29));
		
		//.toLowerCase - Convierte la cadena de texto a minúsculas
		//.toUpperCase - Convierte la cadena de texto a mayúsculas
		
		System.out.println("Probando el método .toLowerCase");
		System.out.println(cadena.toLowerCase());
	
		System.out.println("Probando el método .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara un objeto contra otro para decirnos si son iguales y nos devuelve un valor booleano
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("Hoy es 4 de Septiembre"));
		
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("Hoy es 3 de Septiembre de 2024")); //Es sensible a mayúsculas y minúsculas
		
		//.equalsIgnoreCase() - Compara dos cadenas de texto pero omite el uso de mayúsculas y minúsculas, si el contenido
		//es el mismo devuelve un valor true
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy Es 3 De SepTieMbre de 2024"));
		
		//Operador Módulo - %
		//Cuando se utiliza en una operación de división nos devuelve el valor del residuo de la operación
		
		System.out.println("Operador Módulo %");
		int división = 10%3;
		System.out.println(división);
		
	}

}
