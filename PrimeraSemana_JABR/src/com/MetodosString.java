package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//M�todos de la clase String
		//String es un tipo de dato objeto, por lo cual cuenta
		//con m�todos o propiedades para manipular o consultar
		//su informaci�n
		
		String cadena = "Hoy es 3 de Septiembre de 2024";
		
		//.length() - Nos devuelve el tama�o o longitud de la cadena
		//en un valor num�rico entero
		System.out.println("Probando el m�todo .length()");
		//Si necesitara guardar el valor de la longitud de la cadena
		//lo puedo hacer as�
		int longitud = cadena.length();
		//System.out.println(cadena.length());
		System.out.println(longitud);
		
		//.charAt() - Nos devuelve el caracter que se encuentra en
		//el �ndice especificado
		System.out.println("Probando el m�todo .charAt()");
		System.out.println(cadena.charAt(cadena.length()-1)); //<- 29
		
		//.substring() - Nos devuelve una subcadena a partir del
		//indice especificado
		System.out.println("Probando el m�todo .substring()");
		System.out.println(cadena.substring(20));
		System.out.println(cadena.substring(20, 29));
		
		//.toLowerCase - Convierte la cadena de texto a minusculas
		//.toUpperCase - Convierte la cadena de texto a may�sculas
		System.out.println("Probando el m�todo .toLowerCase");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el m�todo .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara un objeto contra otro para decirnos
		//si son iguales y nos devuelve un valor booleano
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.equals("hoy es 3 de Septiembre de 2024"));
		
		//.equalsIgnoreCase() - Compara dos cadenas de texto pero
		//omite el uso de may�sculas y min�sculas, si el contenido es el mismo
		//devuelve un valor true
		System.out.println("Probando el m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy Es 3 De SeptieMbre dE 2024"));
		
		
		//Operador Modulo - %
		//Cuando se utiliza en una operaci�n de divisi�n nos devuelve el valor
		//del residuo de la operaci�n
		System.out.println("Operador Modulo %");
		
		int division = 10 % 3;
		
		System.out.println(division);

	}

}
