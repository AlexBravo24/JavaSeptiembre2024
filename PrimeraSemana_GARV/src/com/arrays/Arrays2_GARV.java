package com.arrays;

public class Arrays2_GARV {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		System.out.println("==Arrays 2==");
		
		double total = 0;
		int [] cien = new int [100];
		
		for (int i = 0; i < cien.length; i++) {
			cien[i]=i;
			
		}
		for (int i = 0; i < cien.length; i++) {
			total += cien[i];
		}
	
		System.out.println("El total es: "+(total));
		System.out.println("La media es: "+(total/100));
		
		
	}
	
					

		


		
		
	}
