package com.arrays;

public class Arrays5_GARV {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar 'n' productos y otro para mostrar sus  respectivos precios. 
		//Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.

		System.out.println("==Array 5==");
		
		String prod [] = {"Producto 1", "Producto 2","Producto 3", "Producto 4", "Producto 5"};
		double precio []= {10.60, 20, 30.50, 40, 50};
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println(prod [i]+(" = ")+ ("$")+precio[i]);
		}
		
		
		
		
		
		
	}

}
