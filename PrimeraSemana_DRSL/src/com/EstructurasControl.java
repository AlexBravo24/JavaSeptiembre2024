package com;

public class EstructurasControl {

	public static void main(String[] args) {

		int x = 10;
		String cadena = "Hoy es 3 de SEPTIEMBRE de 2024";
		
		if(x <= 10)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
		if(cadena.length() > 20 && cadena.length() < 30)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		if(!(cadena.length() > 20))
		{
			System.out.println("TRUE");
		}
		String nombre = "Alex";
		String nombre2 = "Alex";
		
		String nombre3 = new String("Alex");
		
		if(nombre.equals(nombre3))
		{
			System.out.println("Cierto");
		}
		else
		{
			System.out.println("Falso");
		}
		
		int index = 0;
		switch(index)
		{
		case 0:
			
			break;
		case 1:
			
			break;
			
			default:
			break;
		}
			
	}

}
