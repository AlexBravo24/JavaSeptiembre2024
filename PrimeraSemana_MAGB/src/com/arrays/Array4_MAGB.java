package com.arrays;

public class Array4_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		//los valores invertidos, es decir, que el segundo array deberá tener los valores
		//{5,4,3,2,1}.
		
		int [] numero = new int [5];
		int [] reverso = new int [5];
		int posicion = numero.length-1;
		numero[0]=1;
		numero[1]=2;
		numero[2]=3;
		numero[3]=4;
		numero[4]=5;
		
		System.out.println("Primer Arreglo");
		for (int c = 0; c < numero.length; c++) {
			System.out.println(numero[c]);
		}
		
		for (int i = 0; i < numero.length; i++) {
			reverso[i] = numero[posicion];;
			posicion--;
		}

		System.out.println("Segundo arreglo");
		for (int d = 0; d < reverso.length; d++) {
			System.out.println(reverso[d]);
		}
	}

}
