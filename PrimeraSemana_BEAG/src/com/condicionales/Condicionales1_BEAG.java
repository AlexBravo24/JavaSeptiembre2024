package com.condicionales;

import java.util.Scanner;

public class Condicionales1_BEAG {

	public static void main(String[] args) {
		
	/* 1.Realiza un programa que reciba dos n�meros 
	* por teclado e indique cu�l es mayor o si son iguales.
	*/
		
	//TEMA: ENTRADA DE DATOS y ESTRUCTURAS CONTROL		
	System.out.println("------ EJERCICIO 1 ------");
	
	int numero1, numero2;
	
	//Necesito un objeto o variable de la clase Scanner donde se guarde lo que quiero teclear
	Scanner entrada = new Scanner (System.in); //System.in va a permitir introducir valores desde el teclado
			
	System.out.println("Ingresa un n�mero: ");
	numero1 = entrada.nextInt();
	
	System.out.println("Ingresa otro n�mero: ");
	numero2 = entrada.nextInt();
	
	if (numero1 > numero2) {
		System.out.println("El n�mero "+numero1+" es mayor que el numero "+numero2);
	} else if (numero1 < numero2) {
		System.out.println("El n�mero "+numero1+" es menor que el numero "+numero2);
	} else { //Si no es uno, ni otro
		System.out.println("Ambos n�meros son iguales");
	}
	
	
	
	}

}
