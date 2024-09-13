package com.condicionales;
import java.util.Scanner;

public class Condicionales6_DRSL {

	public static void main(String[] args) {
//		6. El director de una escuela est� organizando un viaje de estudios y requiere
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada
//		alumno por el viaje.
		System.out.println("===== EJERCICIO #6 =====");
		Scanner input = new Scanner(System.in);
		
		int students;
		int totalPrice = 1;
		float perStudentPrice;
		System.out.println("Ingresa La cantidad de alumnos");
		students = input.nextInt();
		
		if(students >= 100)
		{
			totalPrice = students* 65; 
		}
		else if (students >= 50 && students < 100)
		{
			totalPrice =students* 70;
		}
		else if (students >= 30 && students < 50)
		{
			totalPrice = students* 95;
		}
		else if (students <30)
		{
			totalPrice = 4000;
		}
		
		perStudentPrice = (float)totalPrice / (float)students;
		System.out.println("El precio total = " + totalPrice + " EUROS");
		System.out.println("El precio por alumno es = " + perStudentPrice + " EUROS");
		input.close();
	}

}
