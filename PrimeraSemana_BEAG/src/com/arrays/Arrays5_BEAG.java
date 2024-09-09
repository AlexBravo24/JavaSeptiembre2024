package com.arrays;

public class Arrays5_BEAG {

	public static void main(String[] args) {

		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 */

		System.out.println("------ EJERCICIO 5 ------");
		
		// Array de productos
        String[] productos = {"Manzana", "Pan", "Leche", "Huevos", "Queso"};

        // Array de precios correspondientes
        double[] precios = {0.50, 1.20, 1.00, 2.50, 3.00};

       
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
        
	}

}
