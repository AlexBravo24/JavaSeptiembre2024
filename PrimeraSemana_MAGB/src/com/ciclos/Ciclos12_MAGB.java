package com.ciclos;

import java.util.Scanner;

public class Ciclos12_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
		//cuando el promedio de las edades sea superior a 25.
		int promedio=0;
		int contador=0;
		int edad;
		int sumaedad=0;
		Scanner escaner = new Scanner(System.in);
		
		
		System.out.println("ingresa las edades");
		while (promedio<=25) {
			
			edad=escaner.nextInt();
			sumaedad = sumaedad + edad;
			contador=contador+1;
			promedio= sumaedad/contador;
		}
		System.out.println("Has ingresado: "+contador+" "+"edades");
		escaner.close();
	}

}
