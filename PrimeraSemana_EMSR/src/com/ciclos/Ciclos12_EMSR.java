package com.ciclos;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Ciclos12_EMSR {

	public static void main(String[] args) {
		// 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25.

		System.out.println("============================");
		System.out.println("Ejercicio 12=================");
		System.out.println("============================");
	
		
		int total = 0;
		int suma = 0;
		double promedio = 0;
		int edad=0;
		
		
		while (promedio<=25) {
			Scanner entrada = new Scanner(System.in ); 
			System.out.println("Ingresa la edad");
			edad = entrada.nextInt();
		    suma= suma + edad;
			total++;
			promedio= suma/total;
			
		}
		
		System.out.println("El promedio de las edades ingresadas es: " + promedio);
	}

}
