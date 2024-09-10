package com.ifelse;

import java.util.Scanner;

public class IfElse6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int alumnos;
Scanner entrada = new Scanner(System.in);
System.out.println("Cuantos Alumnos iran al viaje?");
alumnos = entrada.nextInt();
if (alumnos > 100) {
	System.out.println("el costo de viaje con renta de autobus es de: " + (4000 + (alumnos * 65)));
}
	else if (alumnos >= 50) {
		System.out.println("el costo de viaje con renta de autobus es de: " + (4000 + (alumnos * 70)));
	}
	else if (alumnos >= 30) {
		System.out.println("el costo de viaje con renta de autobus es de: " + (4000 + (alumnos * 95)));
	}
}
	
	}


