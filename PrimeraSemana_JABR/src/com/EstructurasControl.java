package com;

public class EstructurasControl {

	public static void main(String[] args) {

		// Estructuras de decisión if - valores booleanos

		/*
		 * si (esto se cumple) { se ejecuta este bloque de codigo }si no se cumple { se
		 * ejecuta esto }
		 * 
		 */

		int x = 10;

		if (x >= 10) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// CONDICIONES COMPUESTAS CON OPERADORES LÓGICOS
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD
		String cadena = "Hoy es 3 de Septiembre de 2024";

		// AND - && - Nos devuelve el valor true (primer bloque) cuando se cumplan
		// TODAS las condiciones
		System.out.println("Operador AND &&");
		if (cadena.length() < 35 && cadena.length() > 20 && cadena.equals("hoy es 2 de Sep")) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// OR - || - Nos devuelve el valor true (primer bloque) cuando se cumpla
		// al menos UNA CONDICIÓN
		System.out.println("Operador OR ||");
		if (cadena.length() < 35 || cadena.length() > 20 || cadena.equals("hoy es 2 de Sep")) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// NOT - ! - Niega una condición o cambia el valor de una condición
		// de true a false y viceversa
		System.out.println("Operador NOT !");
		if (!(cadena.length() < 20)) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// IGUALDAD - == - Revisa o compara el valor. Si los valores son iguales
		// manda true, si no manda false
		System.out.println("Operador IGUALDAD ==");
		if (cadena.length() == 30) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

		// DIFERENTE DE - != - Revisa o compara el valor. Si los valores son diferentes
		// manda true, si no manda false
		System.out.println("Operador DIFERENTE DE !=");
		if (cadena.length() != 20) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		//POOL DE STRINGS
		//Esto hacer referencia a cuando dos cadenas de texto apuntan hacia un mismo
		//espacio en memoria con tal de ahorrar memoria u optimizarla
		String nombre = "Alex";
		//String nombre2 = "Alex";
		
		//Otra forma de iniciar un String es iniciarlo como un nuevo objeto
		String nombre3 = new String("Alex");
		
		//Hasta aqui solo se crea un espacio con el nombre "Alex", por lo cual ambas
		//cadenas podemos compararlas con el operador ==
		//Si se crea un nuevo String (new String) es un objeto diferente
		//Pero entonces podemos utilizar .equals si las cadenas coinciden
		System.out.println("Probando el POOL DE STRINGS");
		if (nombre.equals(nombre3)) {
			System.out.println("Cierto");
		}else {
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
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}
		
		
		//Estructura Switch Case - Evalua o da los panoramas o diferentes bloques de ejecución
		//de acuerdo al cambio de una variable
		
		System.out.println("Probando estructura Switch-Case");
		
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
