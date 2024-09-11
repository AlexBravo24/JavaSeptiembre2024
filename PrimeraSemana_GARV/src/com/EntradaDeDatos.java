package com;

import java.util.Scanner; //Aqu� vemos los imports de clases de otros paquetes

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENTRADA DE DATOS
		
		//Vamos a aprender a introducir valores desde el teclado
		//Ejemplo: Si queremos guardar un valor num�rico necesitamos
		//una variable donde guardar ese valor;
		
		int edad;
		
		//necesito un objeto o variable de la clase Scanner donde se guarde
		//lo que quiero teclear
		
		Scanner entrada = new Scanner (System.in);
		
		//Lo que quiero guardar es un n�mero entero desde el teclado en la
		//variable edad
		//Antes de hacer la asignaci�n puedo enviar una impresi�n en 
		//consola que me diga qu� me est� solicitando el programa
		System.out.println("Ingresa la edad");
		
		edad = entrada.nextInt();
		
		//Puedo solicitar con el mismo objeto Scanner otros valores, por
		//ejemplo un nombre
		System.out.println("Ingresa tu nombre");
		//El m�todo NextLine consume los espacios, por eso necesitamos
		//consumir primero el salto de l�nea y despu�s la asignaci�n
		entrada.nextLine();
		String nombre = entrada.nextLine();
		
		//Si no vamos a utilizar el Scanner para seguir recibiendo datos se puede cerrar para ahorrar recursos:
		//entrada.close();
		entrada.close();
		//Una vez que se guarda la edad tecleada, podemos utilizarla
		
		System.out.println("Hola " + nombre + " Tu edad del pr�ximo a�o ser�: "+ (edad+1));
		

	}

}
