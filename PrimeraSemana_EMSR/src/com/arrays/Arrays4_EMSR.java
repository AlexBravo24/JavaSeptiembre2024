package com.arrays;

public class Arrays4_EMSR {

	public static void main(String[] args) {
		// 4. Dado un array de n�meros de 5 posiciones con los siguientes valores: 
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deber� tener los valores 
//		{5,4,3,2,1}.

		
		System.out.println("============================");
		System.out.println("Ejercicio 4=================");
		System.out.println("============================");
		
		int[] numeros2= {1,2,3,4,5};
		int[] arrayInvertido = new int[numeros2.length];
		
		for (int i =0 ; i < numeros2.length; i++) {
			arrayInvertido[i] = numeros2[numeros2.length - 1 - i];
		}
		
		System.out.println("Array invertido:");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.println(arrayInvertido[i]);
        }
		
		
	}

}
