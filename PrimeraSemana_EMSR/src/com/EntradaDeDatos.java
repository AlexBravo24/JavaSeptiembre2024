package com;

import java.util.Scanner; // aqui vemos los importa de clases de otros paquetes


public class EntradaDeDatos {

	public static void main(String[] args) {
		// Entada de Datos
		
		// Vamos a aprender a introducir valores desde el teclado
		// Ejemplo; Si queremos guardar un valor numerico, necesitamos primero
		// una variable donde guardar ese valor
		
		int edad;
		
		// Necesito un objeto o variable de la clase scanner donde se guarde
		// lo que quiero teclear
		Scanner entrada = new Scanner(System.in );
		
		// lo que quiero guardar es un numero entero desde el teclado en la variable
		// edad
		// Antes de hacer la asignacion puedo enviar una impresion en consola
		// que me diga me esta solicitando el programa
		System.out.println("Ingresa una edad");
		edad = entrada.nextInt();
		
		// puedo solicitar con el mismo objeto scanner otros valores, por ejemplo
		// un nombre
		System.out.println("Ingresa un nombre");
		// El metodo nextLine()consume los espacios, por eso necesitamos consumir promero
		// el salto de linea y despues hecer la asignacion
		entrada.nextLine();
		String nombre = entrada.nextLine();
		
		// Una vez que se guarda la edad tecleada, podemos hacer uso de ella
		// para algun proposito
		System.out.println("Hola " + nombre+" Tu edad del proximo año sera: "+ (edad+1));

		//si no vamos a utilizar el scanner para seguir recibiendo datos
		// lo podemos cerrar para ahorrar recursos
		// entrada.close();
	}

}
