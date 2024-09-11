package com.arrays;

public class Arrays4_GARV {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}.
		//Guardar los valores de este array en otro array distinto pero con los valores 
		//invertidos, es decir, que el segundo array deberá tener los valores {5,4,3,2,1}

		System.out.println("==Array 4==");
		
		int [] numeros = {1, 2, 3, 4, 5};
		int [] num1 = new int [numeros.length];
		int posicion = numeros.length-1;
		
		System.out.println("El arreglo original es: ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + (", "));
		}
		
		for (int i = 0; i < numeros.length; i++) {
			num1 [i] = numeros[posicion];
			posicion--;
		}
		System.out.println();
				
		System.out.println("El arreglo invertido es: ");
		
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1 [i] + (", "));
			
	}

}
}
