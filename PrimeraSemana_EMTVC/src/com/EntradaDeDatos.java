package com;

import java.util.Scanner; //aqui vemos los imports de clases de otros paquetes

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// ENTRADA DE DATOS
		
		//Vamos a aprender a introducir valores desde teclado
		//Ejemplo, si queremos guardar un valor numerico, necesitamos primero
		//una variable donde guardar ese valor

		int edad;
		
		//Necesito un objeto o variable de la clase Scanner donde se guarde 
		//lo que quiero teclear
		Scanner entrada = new Scanner(System.in);
		
		//Lo que quiero guardar es un numero entero desde el teclado en la variable
		//edad
		//Antesd de hacer la asignacion puedo enviar una impresion en consola
		//que me diga que me esta solicitando el programa
		System.out.print("Ingresa una edad: ");
		edad = entrada.nextInt();
		
		//Puedo solicitar con el mismo objeto Scanner otros valores, por ejemplo
		//un nombre
		System.out.print("Ingresa un nombre: ");
		//El metodo nextLine consume los espacios, por eso necesitamos consumir primero
		//el salto de linea y despues hacer la asignacion
		entrada.nextLine();
		String nombre = entrada.nextLine();
		
		//Una vez que se guarda la edad tecleada, podemos hacer uso de ella
		//para algun proposito
		System.out.println("Hola " + nombre +" Tu edad del proximo ano sera: "+(edad+1));
		entrada.close();
	}

}
