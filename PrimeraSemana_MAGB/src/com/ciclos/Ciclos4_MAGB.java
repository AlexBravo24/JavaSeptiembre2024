package com.ciclos;

import java.util.Scanner;

public class Ciclos4_MAGB {
	public static void main(String[] args) {
		//4.Programa que reciba una frase y una letra por teclado. Deber� retornar como resultado
		//cu�ntas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
		//�Car�cter no encontrado�. 
		
		String pal;
		String pal1;
		int contador=0;
		Scanner palabra=new Scanner(System.in);
		System.out.println("Indique una palabra");
		pal=palabra.next().toLowerCase();
		System.out.println("Indique la letra a buscar");
		pal1=palabra.next().toLowerCase();
		
		for (int i = 0; i < pal.length(); i++) {
			if (pal.charAt(i) == pal1.charAt(0)) {
				contador=contador+1;
			}
		}
		
		if (contador == 0) {
			
			System.out.println("Car�cter no encontrado");
		}else {
			System.out.println("Hay" + " "+ contador +" "+ "letras en la palabra");
		}
		
		palabra.close();
	}
}
