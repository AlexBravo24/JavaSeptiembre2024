package com.condicionales;
import java.util.Scanner;

public class Condionales7_MAGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		//mostrará el mensaje: “ERROR: número incorrecto”
		
		int num;
		Scanner dados = new Scanner(System.in);
		String[ ] numeros = {"Uno","Dos","Tres","Cuatro","Cinco","Seis"};
	
		System.out.println("Ingrese el numero del dado obtenido:");
		num=dados.nextInt();
		
		switch(num){
			case 1:
				System.out.println("El numero opuesto es "+numeros[5]);
				break;
			case 2:
				System.out.println("El numero opuesto es "+numeros[4]);
				break;
			case 3:
				System.out.println("El numero opuesto es "+numeros[3]);
				break;
			case 4:
				System.out.println("El numero opuesto es "+numeros[2]);
				break;
			case 5:
				System.out.println("El numero opuesto es "+numeros[1]);
				break;
			case 6:
				System.out.println("El numero opuesto es "+numeros[0]);
				break;
			default:
				System.out.println("“ERROR: número incorrecto");
		}
		dados.close();
	}

}
