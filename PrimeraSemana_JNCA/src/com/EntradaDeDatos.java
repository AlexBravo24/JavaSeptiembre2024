package com;

import java.util.Scanner; //aqui vemos los importes de clases de otro paquetes

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// ENTRADA DE DATOS
		
		//Introducir valores desde teclado
		//Ejemplo, si queremos guardar un valor numerico, necesitamos primero
		//una variable donde guardar ese valor
		
		int edad;
		
		//Necesito un objeto o variable de la clase Scanner donde se guarde
		//lo que quiero teclear
		
		Scanner entrada = new Scanner(System.in);
		
		// Lo que quiero guardar es un numero entero desde el teclado en la variable edad
		System.out.println("Ingresa una edad");
		edad = entrada.nextInt();
        
		//puedo solicitar con el mismo objeto scanner otros valores, por ejemplo un nombre
		System.out.println("Ingresa un nombre");
		
		String nombre = entrada.next();
		
		//una vez guardada la edad tecleada, se puede hacer uso de ella para algun proposito
		System.out.println("Hola " + nombre + " Tu edad del proximo año sera: " + (edad + 1));
		
		
		
		
	}

}
