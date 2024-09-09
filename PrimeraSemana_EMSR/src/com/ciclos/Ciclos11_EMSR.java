package com.ciclos;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Ciclos11_EMSR {

	public static void main(String[] args) {
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8 
		
		System.out.println("============================");
		System.out.println("Ejercicio 11=================");
		System.out.println("============================");
	
		int numero1;
		int numero2;
		int x = 1;
		
Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa el ancho de la tabla");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa el alto de la tabla");
		numero2 = entrada.nextInt();
		
		for (int fila = 1; fila <= numero2; fila++) {
			for (int columna = 1; columna <= numero1; columna++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
