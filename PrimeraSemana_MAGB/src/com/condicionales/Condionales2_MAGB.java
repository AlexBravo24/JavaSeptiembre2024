package com.condicionales;
import java.util.Scanner;

public class Condionales2_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.Realiza un programa que pida un número por teclado y nos indique si es par  o impar.
		
		int num1;
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese un numero:");
		num1=numero.nextInt();
		
		if (num1%2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		numero.close();
	}

}
