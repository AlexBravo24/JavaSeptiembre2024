package com.arrays;

public class Array5_EMTVC {
	public static void main(String[] args) {
		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 */

		System.out.println("====================================");
		System.out.println("=========== EJERCICIO 4 ============");
		System.out.println("====================================");

		double[] precios = {22, 18, 16, 32, 17.5, 20.5};
		String[] productos = {"Pan", "Queso", "Jamon(250gr)", "Mayonesa", "Jugo", "Tomate(kg)"};
		System.out.println("Producto    ------>    Precios");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i]+ " --------> $" + precios[i]);
		}
	}
}
