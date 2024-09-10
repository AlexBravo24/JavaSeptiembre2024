package com;

public class MetodosString_No4 {

	public static void main(String[] args) {
		
		// M�todos de la clase String
		//String es un tipo de dato objeto, por lo cual cuenta con m�todos o propiedades para manipular o consultar su informaci�n
		
		String cadena = "Hoy es 3 de Septiembre de 2024";
		
		
		//M�todo: .length() - Nos devuelve el tama�o o longitud de la cadena en un valor num�rico entero
		System.out.println("Probando el m�todo .length()");
		//Si necesitara guardar el valor de la longitud de la cadena, lo puedo hacer as�:
		int longitud = cadena.length();
		//Mandamos a imprimir lo que hay contenido en la variable .length
		System.out.println(cadena.length()); //hace el conteno de todo los caracteres, incluyendo los espacios 

		
		//M�todo: .charAt() - Nos devuelve el caracter que se encuentra en el indice especificado
		/* El �ndice en donde se encuentra cada letra, es decir la posici�n de la letra, comenzando desde cero la primera letra */
		System.out.println("Probando el m�todo .charAt()");
		System.out.println(cadena.charAt(29)); //esto tambien es igual a poner: (cadena.charAt(cadena.length()-1));
		
		
		//M�todo: .substring() - Nos devuelve una subcadena a partir del �ndice especificado
		System.out.println("Probando el m�todo .substring()");
		System.out.println(cadena.substring(20)); //primera forma del m�todo
		System.out.println(cadena.substring(20, 29)); //segunda forma del m�todo
		
		
		//M�todo: .toLowerCase - Convietrte la cadena de texto a min�sculas
		//M�todo: .toUpperCase - Convietrte la cadena de texto a may�sculas
		System.out.println("Probando el m�todo .toLowerCase");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el m�todo .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		
		//M�todo .equals() - Compara un objeto contra otro para decirnos si son iguales y nos devuelve un valor booleano
		//toma en cuenta las diferencias en letras may�sculas y min�sculas
		System.out.println("Probando el m�todo .equals()");
		System.out.println(cadena.equals("hoy es 3 de Septiembre de 2024"));
		
		
		//M�todo .equalsIgnoreCase() - Compara dos cadenas de texto pero omite el uso de may�sculas y min�sculas
		//Si el contenido es el mismo, nos devuelve un valor true
		System.out.println("Probando el m�todo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy Es 3 De SeptiembrE dE 2024"));
		
		
		
		//Existe un operador llamado Operador Modulo que es el signo de %
		//Cuando se utiliza en una operaci�n de divisi�n nos devuelve el valor del residuo de la operaci�n
		System.out.println("Operador Modulo %");
		
		// int division = 10 / 2;
		//System.out.println(division);
		
		//Si uno en lugar de la diagonal, ponemos %, nos dar�a el valor del residuo de la operaci�n de la divisi�n
		int division = 10 % 2;
		System.out.println(division);
	}

}
