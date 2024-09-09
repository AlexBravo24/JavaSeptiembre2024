package com.ciclos;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Ciclos3_EMSR {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.  
		
		System.out.println("============================");
		System.out.println("Ejercicio 3=================");
		System.out.println("============================");

		
				Scanner entrada=new Scanner(System.in);
				System.out.println("Ingresa una palabra");
				String original=entrada.nextLine(); 
				String reversa ="";
				
				
				for (int i=original.length()-1;i>=0;i--) {
					reversa = reversa + original.charAt(i);
				}
				
				System.out.println(original);
				System.out.println(reversa);
				
				
				System.out.println("reversa: " + reversa.replace(" ",""));
				
			
				if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))){
					System.out.println("Es palindromo");
					
				}else
					System.out.println("No es palindromo");

			}

		
		
	}


