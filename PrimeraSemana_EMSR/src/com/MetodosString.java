package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos de la clase String
		// String es un tipo de dato objeto, por lo cual cuenta
		// con metodos o propiedades para manipular o consultar
		// su informacion
		
		String cadena = "Hoy es 3 de Septiembre de 2024";
		
		//.length() _ Nos devuelve el tamaño o longitud de la cadena
		// en un valor numerico entero
		
		System.out.println("Probando el metodo .length()");
		// si necesitara guardar el valor de la longitud de la cadena
		//lo puedo hacer asi
		int longitud = cadena.length();
		//System.out.println(cadena.length());
		System.out.println(longitud);
		
	
		// .chartAt() - Nos devuelve el caracter que se encuentra en
		// el indice especificado
		
		System.out.println("Probando el metodo .chartAt()");
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.charAt(cadena.length()-1)); // <-29
		
		// . substring() _ Nos devuelve una subcadena a partir 
		// del indice especificado
		System.out.println("Probando el metodo .substring()");
		System.out.println(cadena.substring(20));
		System.out.println(cadena.substring(20,29));
		
		//.toLowercase- Convierte la cadena de texto a minusculas
		//.toUppercase- Convierte la cadena de texto a mayusculas
		System.out.println("Probando el metodo .toLowercase");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		// .equals() - compara un objeto contra otro para decirnos
		// si son iguales y nos devuelve un valor booleano
		
		System.out.println("Probando el metodo .equals()");
		System.out.println(cadena.equals("Hoy es 4 de septiembre"));
		System.out.println(cadena.equals("Hoy es 3 de Septiembre de 2024"));
		
		//.equalsIgnoreCase () - Compara dos cadenas de texto pero
		//omite el uso de mayusculas y minusculas, si el contenido es el mismo
		// decuelve un valor true
		
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 3 de septiembre de 2024"));
		
		
		// operador Modulo - %
		// Cuando se utiliza en una operacion de divisionnos devuelve el valor
		// del residuo de la operacion
		
		System.out.println("Operador Modulo %");
		int division= 10 % 3;
		
		System.out.println(division);
		
		
		
		
	}

}
