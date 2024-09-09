package com.ciclos;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes

public class Ciclos2_EMSR {

	public static void main(String[] args) {
		/* 
		 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
23 x 95 = ??? 
		 * 
		 */
		
		int numero1;
		int numero2;
		int x = 1;
		
		System.out.println("============================");
		System.out.println("Ejercicio 2=================");
		System.out.println("============================");
		
		
		Scanner entrada = new Scanner(System.in ); 
		
		System.out.println("Ingresa la tabla que deseas realizar");
		numero1 = entrada.nextInt();
		
		System.out.println("Ingresa hasta que numero quieres la tabla");
		numero2 = entrada.nextInt();
		
		while(x<=numero2){
			int resultado = x*numero1;
			System.out.println(numero1 + " x "+ x + " = " + resultado);
			//para detener que este ciclo tienda al infinito
			//Tenemos que introducir un cambio en x, es decir, incrementarla
			//Hay dos formas de expresar esto
			
			//x= x+1;
			x++;
		}
		

	}

}
