package com;

import java.util.Scanner; //Aquí vemos los imports de clases de otros paquetes

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENTRADA DE DATOS
		
		//Vamos a aprender a introducir valores desde el teclado
		//Ejemplo: Si queremos guardar un valor numérico necesitamos
		//una variable donde guardar ese valor;
		
		int edad;
		
		//necesito un objeto o variable de la clase Scanner donde se guarde
		//lo que quiero teclear
		
		Scanner entrada = new Scanner (System.in);
		
		//Lo que quiero guardar es un número entero desde el teclado en la
		//variable edad
		//Antes de hacer la asignación puedo enviar una impresión en 
		//consola que me diga qué me está solicitando el programa
		System.out.println("Ingresa la edad");
		
		edad = entrada.nextInt();
		
		//Puedo solicitar con el mismo objeto Scanner otros valores, por
		//ejemplo un nombre
		System.out.println("Ingresa tu nombre");
		//El método NextLine consume los espacios, por eso necesitamos
		//consumir primero el salto de línea y después la asignación
		entrada.nextLine();
		String nombre = entrada.nextLine();
		
		//Si no vamos a utilizar el Scanner para seguir recibiendo datos se puede cerrar para ahorrar recursos:
		//entrada.close();
		entrada.close();
		//Una vez que se guarda la edad tecleada, podemos utilizarla
		
		System.out.println("Hola " + nombre + " Tu edad del próximo año será: "+ (edad+1));
		

	}

}
