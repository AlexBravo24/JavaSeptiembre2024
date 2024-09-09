package com;

public class EstructurasControl {

	public static void main(String[] args) {

		// Estructura de decision if - Valores booleanos

		/*
		 * si (esto se cumple){ se ejecuta este bloque de codigo } si no se cumple{
		 * 
		 * se ejecuta esto }
		 * 
		 * 
		 */

		int x = 10;

		if (x >= 10) {
			System.out.println("cierto");

		} else {
			System.out.println("falso");
		}

		// Condiciones compuestas con opeadores logicos
		// AND, OR, NOT, DIFERENTE DE , IGUALDAD

		String cadena = "Hoy es 3 de Septiembre de 2024";

		// AND- &&- Nos devuelve el valor true(primer bloque) cuando
		// se cumplan todas lascondiciones
		System.out.println("operador AND &&");

		if (cadena.length() < 35 && cadena.length() > 20 && cadena.equals("hoy es 2 de sep")) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// OR- || - Nos devuelve el valor true(primer bloque) cuando
		// se cumpla al menos una condicione
		System.out.println("operador OR ||");

		if (cadena.length() < 35 || cadena.length() > 20 || cadena.equals("hoy es 2 de sep")) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// NOT- !- Niega ina condicion o cambia el valor de una condicion
		// de true a false y viceversa
		System.out.println("operador NOT !");

		if (!(cadena.length() < 20)) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}

		// IGUALDAD- ==- Revisa o compara el valor. si lovalores son iguales
		// Mande true si no manda false
		System.out.println("operador IGUALDAD ==");

		if (cadena.length() == 30) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		// Diferente de- !=- Revisa o compara el valor. si lovalores son diferentes
		// Mande true si no manda false
		System.out.println("operador Diferente de !=");

		if (cadena.length() != 20) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		}
		
		// Pool de Strings
		// Esto hace referencia a cuando dos cadenas de texto apuntan hacia un mismo
		// espacio en memoria contal de ahorrar memoria u optimizarla
		
		String nombre= "Alex";
		String nombre2= "Alex";
		
		// otra forma de iniciar un string es iniciarla como un nuevo objeto
		
		String nombre3 = new String("Alex");
		
		// hasta aqui solo se crea un espacio con el nombre "Alex", por lo cual ambas
		// cadenas podemos compararlas con el operador ==
		// si se crea un nuevo string (new string) es un objeto diferente
		// Pero entonces podemos utilizar . equals si las cadenas coinciden
		System.out.println("Probando el Pool de strings");
		if (nombre.equals(nombre3)) {
			System.out.println("cierto");
		} else {
			System.out.println("falso");
		
		}
			
			
		// Estructuras if-else anidado
		System.out.println("Estructura if else anidado");
		int dia = 2;
		
		if (dia==1) {
			System.out.println("Lunes");
		} else if (dia==2) {
			System.out.println("Martes");
		}else if (dia==3) {
			System.out.println("Miercoles");
		}else if (dia==4) {
			System.out.println("Jueves");
		}else if (dia==5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Desconocido");
		}
			
		// Estructura  switch case- Evalua o da los panoramas o diferentes bloque de ejecucion
		// de acuerdo al cambio de una variable
		
		System.out.println("Estructura switch-case");
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
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
