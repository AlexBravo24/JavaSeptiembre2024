package com.condicionales;

import java.util.Locale;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Condicionales4_EMSR {

	public static void main(String[] args) {
		/* 4. Realiza un programa que lea una cadena por teclado y compruebe si 
           contiene letras mayúsculas.
		 * 
		 */
		System.out.println("============================");
		System.out.println("Ejercicio 4=================");
		System.out.println("============================");
		
		Scanner entrada = new Scanner(System.in );
		
		System.out.println("Ingresa una oracion: ");
		entrada.nextLine();
		String cadena = entrada.nextLine();
		String cadena2 = cadena.toLowerCase();
		
		 if (cadena2.contentEquals(cadena)){
		      System.out.println("La cadena solo tiene letras minusculas");
		    }else {
		        System.out.println("La cadena contiene letras mayúsculas.");
		    }
		
	}

}
