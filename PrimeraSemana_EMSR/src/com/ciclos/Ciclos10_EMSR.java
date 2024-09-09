package com.ciclos;

import java.util.Scanner;

public class Ciclos10_EMSR {

	public static void main(String[] args) {
		// 10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
		//impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 

		System.out.println("============================");
		System.out.println("Ejercicio 10=================");
		System.out.println("============================");
	
		int totaln = 1;
		int numero =0;
		int suma1=0;
		int suma2=0;
		
		while (totaln<=20) {
			
			Scanner entrada = new Scanner(System.in ); 
			System.out.println("Ingresa la edad");
			numero = entrada.nextInt();
			
            int division = numero % 2;
			
			if (division==0) {
				if(numero>0) {
				System.out.println(numero + "es par y positivo");
				}else {
					System.out.println(numero + "es par y negativo");	
				}
			}else {
		
					suma2 =suma2 + numero;
				if(numero>0) {
					System.out.println(numero + "es impar y positivo");
					}else {
						System.out.println(numero + "es impar y negativo");	
					}
				
			}
			
			if(numero>0) {
				suma1 =suma1 + numero;
			}
			
			
			
			totaln++;
			
		}
		
		System.out.println("La sumatoria de numeros positivos es "+ suma1);
		System.out.println( "La sumatoria de numeros impares es "+ suma2);
		
	}

}
