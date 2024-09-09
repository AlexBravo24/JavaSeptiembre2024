package com.arrays;

public class Arrays5_EMSR {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.

		
		System.out.println("============================");
		System.out.println("Ejercicio 5=================");
		System.out.println("============================");

		String[] productos = {"Cloro", "Limpieador", "Leche", "Mantequilla", "Azúcar"};
        
        
        double[] precios = {1.20, 2.50, 0.99, 4.00, 1.35};

        
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
	
	
	}

}
