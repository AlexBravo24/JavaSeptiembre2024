package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
		//23 x 95 = ???
		int contador=1;
		int num;
		int num1;
		Scanner numero= new Scanner(System.in);
		System.out.println("Ingrese el numero de la tabla");
		num=numero.nextInt();
		System.out.println("Ingrese el limite de la tabla");
		num1=numero.nextInt();
		
		System.out.println("Tabla del "+num);
		while (contador <= num1) {
			System.out.println(num*contador);
			contador=contador+1;
		}
		numero.close();
	}

}
