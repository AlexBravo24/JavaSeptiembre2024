package com.arrays;

public class Arrays5_DRSL {

	public static void main(String[] args) {
//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//		respectivos precios. Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.
		System.out.println("===== EJERCICIO 5 =====");
		String[] products = {"Cereal","Carne","Papa","Aceite", "Tortilla"};
		int[] prices = {10,20,30,40,50};
		
		for (int i = 0; i < prices.length; i++) 
		{
		System.out.println(products[i] + " = " +prices[i]);	
		}
	}

}
