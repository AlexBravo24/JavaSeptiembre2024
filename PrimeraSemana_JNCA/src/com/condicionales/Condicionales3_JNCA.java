package com.condicionales;

import java.util.Scanner;

public class Condicionales3_JNCA {

	public static void main(String[] args) {
		
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

	    int numero1;
	    int numero2;
	    int resultado;
	    Scanner entrada = new Scanner(System.in);
	    
		System.out.println("==================================");
		System.out.println("=========EJERCICIO 3 JNCA=========");
        System.out.println("==================================");
		
        System.out.println("Introduce primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Introduce segundo numero");
        numero2 = entrada.nextInt();
        entrada.close(); 
        if (numero2 == 0) {
        	System.out.println("error");
        }else {
        	resultado = (numero1 / numero2);
        	System.out.println("El esultado de la division es: " + resultado);
        }
        
	}

}
