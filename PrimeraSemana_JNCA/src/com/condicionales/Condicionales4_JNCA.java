package com.condicionales;

import java.util.Scanner;

public class Condicionales4_JNCA {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.

		System.out.println("==================================");
		System.out.println("=========EJERCICIO 4 JNCA=========");
        System.out.println("==================================");
        
        
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce cadema de texto");
		String cadena1 = entrada.nextLine(); 
		String cadena2 = cadena1.toLowerCase();
		entrada.close();
		
		if (cadena2.equals(cadena1)) {
			System.out.println("La oracion contiene letras minusculas");
		}else {
			System.out.println("La oracion contiene letras mayusculas");
		}
		
	
	
	}

}
