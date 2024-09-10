package com.ciclos;

import java.util.Scanner;

public class Ciclos2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el numero que del cual necesitas la tabla de multiplicar");
		int valor1 = entrada.nextInt();
		System.out.println("hasta que tabla de multiplicar deaseas realizar");
		int valor2 = entrada.nextInt();
		System.out.println("Desde que numero quieres iniciar tu tabla");
		int multi = entrada.nextInt();
		
		while (multi <= valor2)
		{
			System.out.println(valor1 * multi);
			multi++;
		}
	}
}
