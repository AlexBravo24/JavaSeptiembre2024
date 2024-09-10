package com.ifelse;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor1;                                         
		float valor2;                                         
		Scanner entrada = new Scanner(System.in);           
		System.out.println("escribe el primer valor");      
		valor1 = entrada.nextFloat();                         
		System.out.println("escribe el segundo valor");     
		valor2 = entrada.nextFloat();      
		if (valor2 == 0)
		{
			System.out.println("el segundo valor es cero no se puede realizar");
		}
		else 
		{
			System.out.println(valor1 / valor2);
		}
	}

}

