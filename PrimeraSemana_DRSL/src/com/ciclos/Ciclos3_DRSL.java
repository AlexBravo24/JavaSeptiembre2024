package com.ciclos;
import java.util.Scanner;
public class Ciclos3_DRSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. Realiza un programa para determinar si un String es palíndromo. 
		System.out.println("===== EJERCICIO #3 =====");
		Scanner input = new Scanner(System.in);
		String word;
		String inverseWord =""; 
		int wordLength=0;
		System.out.println("Ingresa la palabra!");
		word = input.nextLine();
		wordLength = word.length();
		
		for(int i = 0; i < wordLength; i++)
		{
			if(!inverseWord.equals(" "))
			inverseWord = word.charAt(i) + inverseWord; 
			else
			wordLength++;
		}
		System.out.println("Palabra Invertida = " + inverseWord);
				
		if(word.equalsIgnoreCase(inverseWord))
		{
			System.out.println("Es palindromo");
		}
		else
		{
			System.out.println("NO Es palindromo");
		}
		input.close();
	}

}
