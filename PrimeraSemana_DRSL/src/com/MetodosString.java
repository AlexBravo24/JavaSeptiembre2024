package com;

public class MetodosString 
{
	public static void main(String[] args) 
	{
		//Metodos de la clase string.
		String cadena = "Hoy es 3 de SEPTIEMBRE de 2024";
		System.out.println(cadena.length());
		
		System.out.println(cadena.charAt(0));
		
		System.out.println(cadena.substring(20,30));
		
		System.out.println(cadena.toLowerCase());
		
		System.out.println(cadena.toUpperCase());
		
		System.out.println(cadena.equalsIgnoreCase("Hoy es 3 de SEPTIEMBRE de 2024"));
		
		
	}

}
