package com.ciclos;

import java.util.Scanner;

public class Ciclos11_JABR {

	public static void main(String[] args) {

		/*11.Dibuja un cuadrado, como en la imagen que acompaña,
		 * Introducir desde teclado el ancho y el alto. 
		 * Ejemplo: 8 x 8
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el ancho del cuadrado");
		int ancho = input.nextInt();
		System.out.println("Introduce el alto del cuadrado");
		int alto = input.nextInt();
		
		//Declaramos un ciclo for, con una variable de control y
		//dentro de el declaramos otro ciclo for que se encargara
		//de imprimir el simbolo
		for (int j = 0; j < alto; j++) {
			for (int i = 0; i < ancho; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
