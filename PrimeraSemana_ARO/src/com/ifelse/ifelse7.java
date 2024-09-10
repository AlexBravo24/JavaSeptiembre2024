package com.ifelse;

import java.util.Scanner;

public class ifelse7 {
	
	public static void main(String[] args) {
		int cara;
		Scanner entrada = new Scanner(System.in);
		System.out.println("escriba un numero de 1 al 6");
		cara = entrada.nextInt();
		switch (cara) {
		case 1:
		System.out.println("la cara opuesta es 6");
		break;
		case 2:
		System.out.println("la cara opuesta es 5");
		break;

		case 3:
		System.out.println("la cara opuesta es 4");
		break;
		
		case 4:
		System.out.println("la cara opuesta es 3");
		break;
		case 5:
		System.out.println("la cara opuesta es 2");
		break;
		case 6:
		System.out.println("la cara opuesta es 1");
		break;
		default:
			System.out.println("El numero es incorrecto");
		}
	}
}
