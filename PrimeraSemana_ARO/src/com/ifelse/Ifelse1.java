package com.ifelse;

import java.util.Scanner;

public class Ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1;
		int valor2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("escribe el primer valor");
		valor1 = entrada.nextInt();
		System.out.println("escribe el segundo valor");
		valor2 = entrada.nextInt();
		if (valor1 > valor2)
		{
			System.out.println("el valor " + valor1 + " es mayor");
		}
		else if (valor2 >valor1)
		{
			System.out.println("el valor " + valor2 + " es mayor");
		}
		else 
		{
			System.out.println("Ambos valores son iguales");
		}
			}

		}