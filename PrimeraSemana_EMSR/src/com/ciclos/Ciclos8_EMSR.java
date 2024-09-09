package com.ciclos;
import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes


public class Ciclos8_EMSR {

	public static void main(String[] args) {
		// 8. Programa Java que lea dos números y muestre los números desde el menor hasta el 
		//mayor  
		
		System.out.println("============================");
		System.out.println("Ejercicio 8=================");
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
			System.out.println(numero1 );
			//para detener que este ciclo tienda al infinito
			//Tenemos que introducir un cambio en x, es decir, incrementarla
			//Hay dos formas de expresar esto
			
			//x= x+1;
			numero1++;
		}
		
		while(numero2<=numero1){
			
			System.out.println(numero2);
			//para detener que este ciclo tienda al infinito
			//Tenemos que introducir un cambio en x, es decir, incrementarla
			//Hay dos formas de expresar esto
			
			//x= x+1;
			numero2++;
		}
		
		
	}

}
