package com.arrays;

public class Arrays4_JNCA {

	public static void main(String[] args) {
//		4. Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deberá tener los valores 
//		{5,4,3,2,1}.
		
		int [] valor = {1, 2, 3, 4, 5};
		int [] valorInvertido = new int [valor.length]; 
		
		for (int i = 0; i < valor.length; i++) {
			valorInvertido[i] = valor[valor.length - 1 - i];		
			}
		for (int i = 0; i < valor.length; i++) {
			System.out.println("Posiciones: " + valor[i] );
			System.out.println("valor: " + valor[i]);
		}
		for (int i = 0; i < valorInvertido.length; i++) {
			System.out.println("Posicion : " + valor[i]);
			System.out.println("valor invertido " + valorInvertido[i]);
		}	
	}
}


