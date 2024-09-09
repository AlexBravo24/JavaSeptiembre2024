package com.condicionales;
import java.util.Scanner;
public class condionales3_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		
		int num1;
		int num2;
		Scanner numero = new Scanner(System.in);
	
		System.out.println("Por favor, ingrese un numero:");
		num1=numero.nextInt();
		System.out.println("Por favor, ingrese otro numero:");
		num2=numero.nextInt();
		if(num2 == 0) {
			System.out.println("Error: el numero es 0, ingrese otro numero");
		}else {
			System.out.println("El resultado de la divicion es:" +" "+(num1/num2));
		}
		numero.close();
	}

}
