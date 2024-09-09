package com.condicionales;
import java.util.Scanner;

public class Condicionales1_DRSL {

	public static void main(String[] args) 
	{
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		Scanner input = new Scanner(System.in); 
		
		int number1;
		int number2;
		
		System.out.println("===== EJERCICIO #1 =====");
		
		System.out.println("--Ingresa el primer número--");
		number1 = input.nextInt();
		System.out.println("--Ingresa el segundo número--");
		number2 = input.nextInt();
		
		if(number1 > number2)
		{
			System.out.println("El numero mayor es  = " + number1);
		}
		else if (number2 > number1)
		{
			System.out.println("El numero mayor es  = " + number2);
		}
		else if (number2 == number1)
		{
			System.out.println("Los numeros son iguales");
		}
		input.close();
	}

}
