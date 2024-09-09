package com.condicionales;
import java.util.Scanner;

public class Condicionales7_DRSL {

	public static void main(String[] args) {

//		7. Realiza un programa que pida por teclado el resultado (dato entero)
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
//		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
//		mostrará el mensaje: “ERROR: número incorrecto”.
		System.out.println("===== EJERCICIO #7 =====");
		Scanner input = new Scanner(System.in);
		
		int dice;
		System.out.println("Introduce un numero de dado de 6 caras!");
		dice = input.nextInt();
		if(dice < 1 || dice > 6)
		{
			System.out.println("ERROR: Numero incorrecto!");
			input.close();
			return;
		}
		switch(dice)
		{
			case 1:
				System.out.println("La cara opuesta es: SEIS");
				break;
			case 2:
				System.out.println("La cara opuesta es: CINCO");
				break;
			case 3:
				System.out.println("La cara opuesta es: CUATRO");
				break;
			case 4:
				System.out.println("La cara opuesta es: TRES");
				break;
			case 5:
				System.out.println("La cara opuesta es: DOS");
				break;
			case 6:
				System.out.println("La cara opuesta es: UNO");
				break;
		}
		input.close();
	}

}
