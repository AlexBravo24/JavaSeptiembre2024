package com;

import java.util.Scanner; //aqui vemos los imports de clases de otros paquetes

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//ENTRADA DE DATOS
		
		//Vamos a aprender a introducir valores desde teclado
		//Ejemplo, si queremos guardar un valor númerico, necesitamos primero
		//una variable donde guardar ese valor
		
		int edad;
		
		//Necesito un objeto o variable de la clase Scanner donde se guarde
		//lo que quiero teclear
		Scanner entrada = new Scanner(System.in);
		
		//Lo que quiero guardar es un número entero desde el teclado en la variable
		//edad
		//Antes de hacer la asignación puedo enviar una impresión en consola
		//que me diga que me esta solicitando el programa
		System.out.println("Ingresa una edad");
		edad = entrada.nextInt();
		
		//Puedo solicitar con el mismo objeto Scanner otros valores, por ejemplo
		//un nombre
		System.out.println("Ingresa un nombre");
		//El método nextLine() consume los espacios, por eso necesitamos consumir primero
		//el salto de linea y después hacer la asignación
		entrada.nextLine();
		String nombre = entrada.nextLine();
		
		//Si no vamos a utilizar el Scanner para seguir recibiendo datos
		//lo podemos cerrar para ahorrar recursos
		entrada.close();
		
		//Una vez que se guarda la edad tecleada, podemos hace uso de ella
		//para algún proposito
		System.out.println("Hola " + nombre + " tu edad del proximo año será: " +(edad+1));

	}

}
