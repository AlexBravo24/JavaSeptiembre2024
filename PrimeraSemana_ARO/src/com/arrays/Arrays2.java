package com.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sumaTotal = 0;
		int [] numeros = new int [100];
		for (i = 0; i < 100; i++)
		{
			numeros [i] = i+1;
			sumaTotal = sumaTotal + (i+1);
		}
		System.out.println("la suma de todos los valores es: " + sumaTotal + " y su promedio es: " + (sumaTotal/100));
	}

}
