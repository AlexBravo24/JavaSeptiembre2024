package com.condicionales;
import java.util.Scanner;
public class Condicionales5_DRSL {

	public static void main(String[] args) 
	{
//		5. Realiza un programa que calcule la aceptación de una solicitud en base a
//		los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
	Scanner input = new Scanner(System.in);
	int nota;
	int edad;
	String sexo;
	System.out.println("===== EJERCICIO #5 =====");
	
	System.out.println("Ingresa tu Nota");
	nota = input.nextInt();
	
	System.out.println("Ingresa tu Edad");
	edad = input.nextInt();
	
	System.out.println("Ingresa tu sexo 'F' 0 'M' ");
	sexo = input.next();
	
		if(nota >= 5)
		{
			if(edad >= 18)
			{
				if(sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm')
				{
					System.out.println("POSIBLE");
					input.close();
					return;	
				}
				else if(sexo.charAt(0) == 'F' || sexo.charAt(0) == 'f')
				{
					System.out.println("ACEPTADA");
					input.close();
					return;	
				}
				else if(sexo.charAt(0) != 'F' || sexo.charAt(0) != 'f'|| sexo.charAt(0) != 'M' || sexo.charAt(0) != 'm' )
				{
					System.out.println("NO ACEPTADA");
					input.close();
					return;	
				}
			}
			else
			{
				System.out.println("NO ACEPTADA!");
				input.close();
				return;	
			}
		}
		else
		{
			System.out.println("NO ACEPTADA!");
			input.close();
			return;
		}
		input.close();
	}

}
