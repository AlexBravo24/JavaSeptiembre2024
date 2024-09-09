package com.condicionales;
import java.util.Scanner;
public class Condionales1_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales. 
		
		int num1;
		int num2;
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese un numero:");
		num1 = numero.nextInt();
		System.out.println("Por favor, ingrese otro numero:");
		num2 = numero.nextInt();
		if(num1 > num2) {
			System.out.println("El numero mayor es:"+" "+num1);
		}else {
			System.out.println("El numero mayor es:" +" "+ num2);
		}
		numero.close();
	}

}
