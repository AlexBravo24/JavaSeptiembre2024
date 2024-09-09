package com.arrays;

public class Arrays2_DRSL {

	public static void main(String[] args) 
	{
//		2. Crea un array de números de 100 posiciones, que contendrá los números del
//		1 al 100. Obtén la suma de todos ellos y la media.
		System.out.println("===== EJERCICIO 2 =====");
		int[] numberArray = new int[100];
		int addedNumbers = 0;
		
		for(int i =0 ; i < numberArray.length;i++)
		{
			numberArray[i] = i+1;
			System.out.println(numberArray[i]);
			addedNumbers += (i+1); 
		}
		System.out.println("Sumatoria = "+ addedNumbers +"|| " + "Media = "+ addedNumbers/numberArray.length);
	}

}
