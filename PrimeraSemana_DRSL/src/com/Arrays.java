package com;

public class Arrays {

	public static void main(String[] args) {
		
		char[] array = new char[5];

		int [] numeros = {1,2,3,4,5,6}; 
		
		Object [] arrayDeObjetos = { 1, 1.0f ,"Hola"};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		
			System.out.println(array);
			// foreach 
			for(int x :numeros)
			{
				System.out.println(x);
			}
		}
	
	//foreach


	}
	}

