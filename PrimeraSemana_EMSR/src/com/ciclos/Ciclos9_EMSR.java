package com.ciclos;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Ciclos9_EMSR {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos  
		
		System.out.println("============================");
		System.out.println("Ejercicio 9=================");
		System.out.println("============================");
	
		int numero1;
		int numero2;
		int x = 1;
		
Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el primer numero");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el segundo numero");
		numero2 = entrada.nextInt();
		
		while(numero1<=numero2){
			
			int division = numero1 % 2;
			
			if (division==0) {
				System.out.println(numero1);
			}
			
			numero1++;
		}
		
		while(numero2<=numero1){
			
			int division = numero2 % 2;
			
			if (division==0) {
				System.out.println(numero2);
			}
			numero2++;
		}

	}

}
