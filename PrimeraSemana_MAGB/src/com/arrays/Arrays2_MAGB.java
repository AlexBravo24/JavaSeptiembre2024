package com.arrays;

public class Arrays2_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
		int [] numeros = new int [101];
		int suma=0;
		int media=0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
			suma= numeros[i]+suma;
			
		}
		media=suma/100;
		System.out.println("La suma es:" + suma);
		System.out.println("La media es:" + media);
	}

}
