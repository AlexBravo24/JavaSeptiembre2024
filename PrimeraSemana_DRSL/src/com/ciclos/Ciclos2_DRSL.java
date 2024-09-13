package com.ciclos;
import java.util.Scanner;
public class Ciclos2_DRSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== EJERCICIO #2 =====");
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
//		desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
//		23 x 95 = ???
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		
		System.out.println("Que tabla deseas?");
		number1= input.nextInt();
		System.out.println("Hasta que numero quieres que llegue?");
		number2 = input.nextInt();
		
		for(int i =1; i<=number2 ;i++)
		{
			System.out.println("Resultado de "+ i +" X " + number1 +" = "+ (i * number1));
		}		
		input.close();
	}

}
