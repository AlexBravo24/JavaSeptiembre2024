package com.condicionales;

import java.util.Scanner;

public class Condicionales3_GARV {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y muestre el resultado
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.

		System.out.println("====EJERCICIO 3====");
		System.out.println("Permite conocer el resultado de una divisi�n");
		
		
		Scanner num1 = new Scanner (System.in);
		System.out.println("Introduce el primer n�mero");
		double x = num1.nextInt();
		
		Scanner num2 = new Scanner (System.in);
		System.out.println("Introduce el n�mero entre el que se desea dividir");
		double y = num2.nextInt();
		
		if (y==0){
			System.out.println("Error. No se puede dividir entre 0");
		}else {
			double div = x/y;
			System.out.println ("El resultado es: " + div);
	}
}
}
