package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Cientifica operacion = new Cientifica();
		int i = 0;
		// int veces=0;
		//int[] numeros = new int[10];
		String opr;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese la operacion a realizar: ");
		opr = entrada.next();
		System.out.println("Cuantos numeros: ");
		i = entrada.nextInt();

		opr = opr.toLowerCase();
		switch (opr) {
		case "sumar":
			
			//System.out.println("s");
			
			operacion.sumar(i);
			break;
		case "restar":
			operacion.restar(i);
			break;
		case "dividir":
			operacion.dividir(i);
			break;
		case "multiplicar":
			operacion.multiplicar(i);
			break;

		default:
			System.out.println("fallo");
			break;
		}
		entrada.close();
	}
}
