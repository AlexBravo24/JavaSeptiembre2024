package com;

public class EstructurasCiclos_No5 {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CICLOS
		//Tambi�n llamadas blucles o estructuras de iteraci�n
		//Nos van a permitir ejecutar una tarea o sentencias
		//"n" veces mientras una variable booleana o condici�n se cumplan
		
		//Existen 2 tipos: while y for
		//WHILE - es indeterminado /mientras se cumpla una condici�n
		
		/* mientras (esto se cumpla) {
		 * 		se ejecuta este bloque de c�digo
		 * }
		 */
		
		//Ejemplo while:
		int x = 1; //variable que nos ayudar� a iterar o ejecutar una tarea
		//de acuerdo a como cambie su valor
		
//		while (x<5) {
//			System.out.println(x + ".-Hola mundo");
//			//Para detener este ciclo tienda al inifinito
//			//tenemos que introducir un cambio en x, es decir, incrementarla
//			//Hay dos formas de expresar esto, la primera:
//			//x = x + 1;
//			//Otra forma es:
//			x++;
//		}

		//Existe otra forma de while: 
		//do - while: Primero hace y despu�s eval�a su debe seguir ejecut�ndose 
		//Es �til cuando nos encontramos con tareas
		//o condiciones que posiblemente no se puedan cumplir
		//pero as� aseguramos que el programa se ejecute por lo menos una vez
	
//		do {
//			System.out.println("Hola mundo");
//		} while (x>5);
		
		
		
		//FOR - (para los siguientes argumentos)
		//Es un ciclo determinado, porque desde un inicio sabemos cu�ntas veces
		//se ejecutar� la tarea o por lon menos, tendr� un l�mite definido
		
		/* para (los siguientes argumentos) {
		 * 		SE EJECUTA ESTO
		 * }
		 * 
		 * para (variable para iterar; condici�n; incremento o decremento) {
		 * 		SE EJECUTA ESTO
		 * }
		 */
		
		//escribimos for+Ctrl espacio + enter
		for (int i = 1; i < 5; i++) {
			System.out.println(i + ".-Hola mundo");
		}
		
		
		
	}

}
