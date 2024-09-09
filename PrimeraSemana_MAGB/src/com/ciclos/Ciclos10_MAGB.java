package com.ciclos;

import java.util.Scanner;

public class Ciclos10_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int positivos = 0;
		int sumimpares = 0;
		Scanner num = new Scanner(System.in);
		System.out.println("ingrese 20 numeros");
		
		for (int i = 0; i < 20; i++) {
			numero=num.nextInt();
			if (numero>0) {
				System.out.println("El numero es positivo");
				positivos = positivos + numero;
			}else {
				System.out.println("El numero es negativo");
			}
			
			if (numero/2==0) {
				System.out.println("El numero es par");
				
			}else {
				System.out.println("el numero es impar");
				sumimpares=sumimpares+numero;
			}
		}
		System.out.println("La suma de los positivos es: " + positivos);
		System.out.println("La suma de los impares es: " + sumimpares);
		num.close();
	}

}
