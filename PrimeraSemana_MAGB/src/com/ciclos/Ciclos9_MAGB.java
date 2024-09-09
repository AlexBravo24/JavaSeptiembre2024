package com.ciclos;

import java.util.Scanner;

public class Ciclos9_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9. Programa Java que lea dos números y muestre los números pares entre ellos 
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
            if (i%2==0) {
            	System.out.println(i);
			}
        }
		numero.close();
	}

}
