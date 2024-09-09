package com.arrays;

public class Arrays5_JNCA {

	public static void main(String[] args) {
//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos
		
		int [] productos = new int [5];
		int [] precios = new int [5]; 
		
		productos[0] = 1;
		productos[1] = 2;
		productos[2] = 3;
		productos[3] = 4;
		productos[4] = 5;
		
		precios[0] = 250;
		precios[1] = 300;
		precios[2] = 170;
		precios[3] = 400;
		precios[4] = 270;
		
	    for (int i = 0; i < productos.length; i++) {
	    	System.out.println("el producto numero: " + productos[i] + " tiene un precio de: " + precios[i]);
	    }
	    
		
	}

}
