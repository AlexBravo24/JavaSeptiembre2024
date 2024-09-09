package com.ciclos;

public class Ciclos1_EMSR {

	public static void main(String[] args) {
		/*
		 * 1.- Programa un algoritmo que realice la tabla de multiplicar del 12  
		 * 
		 */
		
		System.out.println("============================");
		System.out.println("Ejercicio 1=================");
		System.out.println("============================");

		int x=1;
		
		while(x<=10){
			int resultado = x*12;
			System.out.println(x + " x 12 =" + resultado);
			//para detener que este ciclo tienda al infinito
			//Tenemos que introducir un cambio en x, es decir, incrementarla
			//Hay dos formas de expresar esto
			
			//x= x+1;
			x++;
			
		}
				
	}

}
