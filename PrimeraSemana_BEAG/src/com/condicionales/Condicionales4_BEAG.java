package com.condicionales;

import java.util.Scanner;

public class Condicionales4_BEAG {

	public static void main(String[] args) {
		
		/* 4. Realiza un programa que lea una cadena por teclado
		 * y compruebe si contiene letras may�sculas.
		 */
		
		System.out.println("------ EJERCICIO 4 ------");
		
		Scanner entrada = new Scanner (System.in);
		
		//TEMA: M�TODO STRING
		
		//Solicitar a la persona que ingrese una cadena
		System.out.println("Ingresa una cadena de texto: ");
		String cadena = entrada.nextLine();
		
		//Verificar que la cadena contenga letras may�sculas
		if (contieneMayusculas(cadena)) {
			System.out.println("La cadena de texto contine letras may�sculas");
		} else {
			System.out.println("La cadena de texto no contiene letras may�sculas");
		}
	
		entrada.close();
    
    }
    
    // M�todo que verifica si una cadena contiene letras may�sculas
    private static boolean contieneMayusculas(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
	
	}
	
}
