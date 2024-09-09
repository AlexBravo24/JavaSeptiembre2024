package com.ciclos;

import java.util.Scanner;

public class Ciclos11_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8
		
		int ancho;
		int alto;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("ingrese el ancho:");
		ancho=scn.nextInt();
		System.out.println("ingrese el alto:");
		alto=scn.nextInt();
		
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scn.close();
	}

}
