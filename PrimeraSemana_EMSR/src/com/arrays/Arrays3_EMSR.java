package com.arrays;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes


public class Arrays3_EMSR {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.
		
		System.out.println("============================");
		System.out.println("Ejercicio 3=================");
		System.out.println("============================");
		
		Scanner entrada = new Scanner(System.in );
		System.out.println("Introduce una frase: ");
		String frase = entrada.nextLine();
		
		char[] caracteres = frase.toCharArray();
		
		System.out.println("\nLa frase convertida en caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Caracter en índice " + i + ": " + caracteres[i]);
        }
	}

}
