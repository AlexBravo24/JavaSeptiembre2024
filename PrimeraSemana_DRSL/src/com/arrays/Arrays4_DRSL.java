package com.arrays;

public class Arrays4_DRSL {

	public static void main(String[] args) {
//		4. Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.
		System.out.println("===== EJERCICIO 4 =====");
		
		int[] numberArray = {1,2,3,4,5};
		int[] invertedNumberArray = new int[numberArray.length];
		int invertedIndex = 0;
		
		for(int i = numberArray.length; i > 0; i--)
		{
			invertedNumberArray[invertedIndex] = numberArray[i-1];			
			invertedIndex++;
		}
		
		System.out.println("Arreglo original");
		for(int x:numberArray)
		{			
			System.out.println(x);
		}
		System.out.println("Arreglo invertido");
		for(int x:invertedNumberArray)
		{			
			System.out.println(x);
		}
	}

}
