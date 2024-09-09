package com.condicionales;

import java.util.Scanner;

public class Condicionales1_JNCA {

	public static void main(String[] args) {
		
		/*   1.Realiza un programa que reciba dos números por 
		 *   teclado e indique cuál es mayor o si son iguales.
		 */   
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("=========EJERCICIO 1 JNCA=========");
        System.out.println("==================================");
        
        System.out.println("Introduce primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Introduce segundo numero");
        numero2 = entrada.nextInt();
        
        entrada.close();
        
        if (numero1 > numero2) {
        	System.out.println("El primer numero es mayor");
        }else if (numero1 == numero2) {
        	System.out.println("Ambos numero son iguales");
        }else{
        	System.out.println("El segundo numero es mayor");
        }
        
        
	}

}
