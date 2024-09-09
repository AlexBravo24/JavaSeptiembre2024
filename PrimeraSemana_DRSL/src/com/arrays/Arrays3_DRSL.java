package com.arrays;
import java.util.Scanner;
public class Arrays3_DRSL {

	public static void main(String[] args)
	{
		
//		3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
//		caracteres
		System.out.println("===== EJERCICIO 3 =====");
		Scanner input =  new Scanner(System.in);
		
		String word ="";
		System.out.println("Ingresa una palabra");
		word = input.nextLine();
		
		char[] charArray = new char[word.length()];
		
		for(int i = 0 ; i< word.length(); i++)
		{
			charArray[i] = word.charAt(i);
			System.out.println(charArray[i]);	
		}
		
			System.out.println(charArray);	
			input.close();
	}

}
