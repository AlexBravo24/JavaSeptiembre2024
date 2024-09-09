package com.ciclos;

public class Ciclos1_JNCA {

	public static void main(String[] args) {
		
		//1.- Programa un algoritmo que realice la tabla de multiplicar del 12 

		int numeroTabla = 12;
		System.out.println("Bienvenido a la tabla de multiplicar del 12");
		
		for (int i = 1; i <=10; i++) {
			int resultado = numeroTabla * i;
			System.out.println(numeroTabla + "x" + i + "=" + resultado);
		}
		
	}

}
