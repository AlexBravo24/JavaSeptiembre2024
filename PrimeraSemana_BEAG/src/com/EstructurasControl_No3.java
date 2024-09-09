package com;

public class EstructurasControl_No3 {

	public static void main(String[] args) {

		// Estructuras de decisión if - que evalúan valores booleanos

		/*
		 * si (esto se cumple) { se ejecuta este bloque de código } si no se cumple { se
		 * ejecuta esto }
		 */

		int x = 10;

		if (x >= 10) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// CONDICIONES COMPUESTAS CON OPERADORES LÓGICOS
		// AND, OR, NOT, diferente de, IGUALDAD
		String cadena = "Hoy es 3 de Septiembre de 2024";

		// Operador: AND - funciona con un doble && y nos devuelve el valor true (primer
		// bloque) cuando se cumplan todas las condiciones
		// Con el operador AND se deben de cumplir todas las condiciones, con que una no
		// se cumpla será suficiente para que nos dé Falso
		System.out.println("Operador AND &&");
		if (cadena.length() < 35 && cadena.length() > 20 && cadena.equals("hoy es 2 de sep")) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Operador: OR - funciona con dos barras paralelas || nos devuelve el valor
		// true (primer bloque) cuando se cumpla al menos UNA CONDICIÓN
		System.out.println("Operador OR ||");
		if (cadena.length() < 35 || cadena.length() > 20 || cadena.equals("hoy es 2 de sep")) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Operador: NOT - funciona con ! - Niega una condición O cambia el valor de una
		// condición de true a false y viceversa
		System.out.println("Operador NOT !");
		if (!(cadena.length() < 20)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Operador: IGUALDAD - funciona con un doble ==, revisa o compara el valor. Si
		// los valores son IGUALES manda true, si no manda false
		System.out.println("Operador IGUALDAD =="); // un solo = es una igualdad, un doble == es una comparación
		if (cadena.length() == 20) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// Operador: DIFERENTE DE - funciona con !=, revisa o compara el valor. Si
		// los valores son DIFERENTES manda true, si no manda false
		System.out.println("Operador DIFERENTE DE !="); // un solo = es una igualdad, un doble == es una comparación
		if (cadena.length() != 20) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		
		
		
		//Concepto POOL DE STRINGS
		//Esto hace referencia a cuando dos cadenas de texto apuntan hacia un mismo espacio en memoria con tal de ahorrar memoria u optimizarla
		String nombre = "Alex";
		String nombre2 = "Alex";
		
		//Otra forma de iniciar un String es iniciarlo como un nuevo objeto
		String nombre3 = new String("Alex");
		
		//Hasta aquí solo se crea un espacio con el nombre "Alex", por lo cual ambas cadenas podemos compararlas con el operador ==
		//Si se crea un nuevo String (newString) es un objeto diferente, pero entonces podemos utilizar .equals si las cadenas coinciden
		System.out.println("Probando el POOL DE STRINGS");
		if (nombre.equals(nombre3)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		
		
		//Estructuras if-else anidado
		System.out.println("Estructura if else anidado");
		int dia = 2;
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miércoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}
		
		
		//Estructura Switch Case - Evalúa o da los panoramas o diferentes bloques de ejecución de acuerdo al cambio de una variable
		
		System.out.println("Probando estructura Switch-Case");
		//Escribir switch + Ctrl Espacio
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Miércoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;	
		case 5: 
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Desconocido");
			break;
		}
		
		
		
	}

}
