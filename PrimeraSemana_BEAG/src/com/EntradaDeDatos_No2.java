package com;

import java.util.Scanner; //aquí vemos los imports de clases de otros paquetes

public class EntradaDeDatos_No2 {

	public static void main(String[] args) {
		
		// ENTRADA DE DATOS
		
		//Vamos a aprender a introducir valores desde teclado
		//Ejemplo, si queremos guardar un valor numerico, necesitamos primero una variable donde guardar ese valor
		
		int edad;
		
		//Necesito un objeto o variable de la clase Scanner donde se guarde lo que quiero teclear
		//Scanner es un tipo de variable estructurado
		Scanner entrada = new Scanner (System.in); //System.in va a permitir introducir valores desde el teclado
		
		//Lo que quiero guardar es un número entero desde el teclado de la variable edad
		//Antes de hacer la asignación puedo enviar una impresión a consola que me diga qué me está solicitando el programa
		System.out.println("Ingresa una edad");
		edad = entrada.nextInt();
		
		//Puedo solicitar con el mismo objeto Scanner otros valores, por ejemplo un nombre
		System.out.println("Ingresa un nombre");
		
		//con .next() solo va a tomar en cuenta la primera palabra
		//El método .nextLine() va a consumir los espacios, por eso necesitamos consumir primero el salto de linea y después hacer la asignación
		entrada.nextLine();
		String nombre = entrada.nextLine(); 
		
		//Si no vamos a utilizar el Scanner para seguir recibiendo datos
		//lo podemos cerrar para ahorrar recursos
		entrada.close();
		
		//Una vez que se guarda la edad tecleada, podemos hacer uso de ella para un propósito
		System.out.println("Hola " + nombre + " tu edad de próximo año será: " +(edad+1));
		

	}

}
