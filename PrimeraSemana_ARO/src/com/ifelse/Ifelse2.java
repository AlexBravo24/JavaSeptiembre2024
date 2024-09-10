package com.ifelse;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1;                                                                       
		Scanner entrada = new Scanner(System.in);        
		System.out.println("escribe el primer valor");   
		valor1 = entrada.nextInt();                      
		int parImpar = valor1 % 2;
		if (parImpar == 0)
		{
			System.out.println("el numero es par");
		}
		else
		{ 
			System.out.println("el numero es impar");
		}
	}

}