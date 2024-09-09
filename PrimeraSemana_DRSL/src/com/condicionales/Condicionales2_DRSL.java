package com.condicionales;
import java.util.Scanner;
public class Condicionales2_DRSL {

	public static void main(String[] args) {
//		2.Realiza un programa que pida un número por teclado y nos indique si es par
//		o impar.
		
		System.out.println("===== EJERCICIO #2 =====");
		
		int number;
		int result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("--Ingresa un numero--");
		number =  input.nextInt();
		result = number % 2;
		
		if(result == 0)
		{
			System.out.println("El numero " + number + " es par!");
		}
		else
		{
			System.out.println("El numero " + number + " es impar!");
		}
		input.close();
	}

}
