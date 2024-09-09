package com;

public class MetodosString_No4 {

	public static void main(String[] args) {
		
		// Métodos de la clase String
		//String es un tipo de dato objeto, por lo cual cuenta con métodos o propiedades para manipular o consultar su información
		
		String cadena = "Hoy es 3 de Septiembre de 2024";
		
		
		//Método: .length() - Nos devuelve el tamaño o longitud de la cadena en un valor numérico entero
		System.out.println("Probando el método .length()");
		//Si necesitara guardar el valor de la longitud de la cadena, lo puedo hacer así:
		int longitud = cadena.length();
		//Mandamos a imprimir lo que hay contenido en la variable .length
		System.out.println(cadena.length()); //hace el conteno de todo los caracteres, incluyendo los espacios 

		
		//Método: .charAt() - Nos devuelve el caracter que se encuentra en el indice especificado
		/* El índice en donde se encuentra cada letra, es decir la posición de la letra, comenzando desde cero la primera letra */
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(29)); //esto tambien es igual a poner: (cadena.charAt(cadena.length()-1));
		
		
		//Método: .substring() - Nos devuelve una subcadena a partir del índice especificado
		System.out.println("Probando el método .substring()");
		System.out.println(cadena.substring(20)); //primera forma del método
		System.out.println(cadena.substring(20, 29)); //segunda forma del método
		
		
		//Método: .toLowerCase - Convietrte la cadena de texto a minúsculas
		//Método: .toUpperCase - Convietrte la cadena de texto a mayúsculas
		System.out.println("Probando el método .toLowerCase");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el método .toUpperCase");
		System.out.println(cadena.toUpperCase());
		
		
		//Método .equals() - Compara un objeto contra otro para decirnos si son iguales y nos devuelve un valor booleano
		//toma en cuenta las diferencias en letras mayúsculas y minúsculas
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("hoy es 3 de Septiembre de 2024"));
		
		
		//Método .equalsIgnoreCase() - Compara dos cadenas de texto pero omite el uso de mayúsculas y minúsculas
		//Si el contenido es el mismo, nos devuelve un valor true
		System.out.println("Probando el método .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy Es 3 De SeptiembrE dE 2024"));
		
		
		
		//Existe un operador llamado Operador Modulo que es el signo de %
		//Cuando se utiliza en una operación de división nos devuelve el valor del residuo de la operación
		System.out.println("Operador Modulo %");
		
		// int division = 10 / 2;
		//System.out.println(division);
		
		//Si uno en lugar de la diagonal, ponemos %, nos daría el valor del residuo de la operación de la división
		int division = 10 % 2;
		System.out.println(division);
	}

}
