package com.condicionales;
import java.util.Scanner;
public class Condicionales3_DRSL {

	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos números y muestre el resultado
//		de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		System.out.println("===== EJERCICIO #3 =====");
		
		Scanner input = new Scanner(System.in);
		float number1;
		float number2;
		float result;
		
		System.out.println("Ingresa el Primer Numero");
		number1 = input.nextFloat();
		System.out.println("Ingresa el Segundo Numero");
		number2 = input.nextFloat();
		
		if(number2 != 0)
		{
			result = number1 / number2;
			System.out.println("El resultado de la division es = " + result);
		}
		else
		{
			System.out.println("ERROR! -No se puede dividir entre '0'-");
		}
		input.close();
	}

}
