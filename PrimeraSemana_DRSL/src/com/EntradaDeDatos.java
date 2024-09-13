package com;
import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args)
	{
		int edad;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una edad");
		edad = entrada.nextInt();
		System.out.println("Ingresa tu nombre");
		entrada.nextLine();
		String nombre = entrada.nextLine();
		
		System.out.println("Tu edad es "+ edad);
		System.out.println("El proximo anio sera " + (edad+1));
		System.out.println("Hola "+ nombre);
		
		entrada.close();
	}

}
