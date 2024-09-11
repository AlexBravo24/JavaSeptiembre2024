package com.ciclos;

import java.util.Scanner;

public class Ciclos2_GARV {

	public static void main(String[] args) {
		
		//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 
		//hasta el 95. 23 x 95 = ???

		System.out.println("==Ciclo 2==");
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el numero al que desea generar la tabla");
		int num = scan.nextInt();
		
		Scanner num2 = new Scanner (System.in);
		System.out.println("Ingrese el numero hasta el que se desea conocer la tabla");
		int mult= num2.nextInt();
		
		
		for (int i = 1; i <= mult; i++) {
			System.out.println(num+ "*"+i+"="+(num*i));
			
		}
		
	}	
		
}