package com.arrays;

public class Array5_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.
		
		String [] productos = {"jabon","champu","desodorante","toalla","aromatizante"};
		double [] precios = {20.00,55.00,35.00,75.00,45.00};
		
		System.out.println("Lista de profuctos");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(productos[i]+"....."+precios[i]+"$");
		}
		
	}

}
