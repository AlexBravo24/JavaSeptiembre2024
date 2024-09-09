package com.ciclos;

import java.util.Scanner;

public class Ciclos8_MAGB {
	public static void main(String[] args) {
		//8. Programa Java que lea dos números y muestre los números desde el menor hasta el mayor 
		Scanner numero = new Scanner(System.in);
		int a=0;
		int b=0;
		int menor=0;
		int mayor=0;
		
			System.out.println("ingrese dos numeros numeros:");
			a=numero.nextInt();
			b=numero.nextInt();
		
		 if (a > b) {
	            mayor = a;
	            menor = b;
	        } else {
	            mayor = b;
	            menor = a;
	        }
		
		for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
		numero.close();
	}
}
