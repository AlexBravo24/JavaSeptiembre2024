package com.condicionales;
import java.util.Scanner;
public class Condicionales4_DRSL {

	public static void main(String[] args) 
	{
//		4. Realiza un programa que lea una cadena por teclado y compruebe si
//		contiene letras mayúsculas.
	System.out.println("===== EJERCICIO #4 =====");
	
	Scanner input = new Scanner(System.in);	
	String word;
	char character;
	
	System.out.println("Ingresa una palabra");
	word = input.next();
	
	for(int x = 0 ; x <= word.length()-1 ; x++)
	{
		character = word.charAt(x);
		
		if(Character.isUpperCase(character))
		{
			System.out.println("La palabra tiene mayusculas!");
			input.close();
			return;
		}		
	}
	System.out.println("La palabra NO tiene mayusculas!");
	input.close();
	}
	
}
