package com.arrays;
import java.util.Scanner;
public class Arrays1_DRSL {

	public static void main(String[] args) {
//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
//		Muestra por consola el índice y el valor al que corresponde.
		System.out.println("===== EJERCICIO 1 =====");
		
		int[] numberArray = new int[10];
		Scanner input =  new Scanner(System.in);
		
		for (int i = 0; i < numberArray.length; i++) 
		{
			System.out.println("Ingresa el dato " + " #" + (i+1));
			numberArray[i] = input.nextInt();
		}
		for (int i = 0; i < numberArray.length; i++) 
		{
			System.out.println("Indice= "+ i + " ||  Valor = " + numberArray[i] );	
		}
		input.close();
	}

}
