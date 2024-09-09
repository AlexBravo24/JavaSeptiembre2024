package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Estructuras Ciclos
		//Tambien llamadas bucles o estructuras de iteracion
		//Nos van a permitir ejecutar una tarea o sentencias
		//"n" veces mientras una variable booleana o condicion se cumplan
		
		//while - indeterminado (mientras se cumpla una condicion)
		
		/*
		 * mientras (esto se cumpla){
		 * se ejecuta este bloque de codigo
		 * }
		 */

		int x = 1; //Variable que nos ayudara a iterar o ejecutar una tarea 
		//de acuerdo a como cambie su valor
		
		while (x <= 5) {
			System.out.println(x + " .-Hola Mundo");
//			//Para detener que este ciclo tiende al infinito
//			//tenemos que introducir un cambio en x, es decir, incrementarla
//			//Hay dos formas de expresar esto
			x = x + 1;
//		    x ++;
		}
		
		//do - while - Primero hace y despues evalua si debe seguir ejecutandose
		//Es util cuando nos encontremos con tareas
		// o condiciones que posiblemente no se puedan complir
		//pero asi aseguramos que el programa se ejecute por lo menos una vez
		
//		do {
//			System.out.println("Hola Mundo");
//		}while (x > 5);

		//for (para... los siguientes argumentos)
		//Es un ciclo determinado, porque desde un inicio sabemos cuantas veces
		//se ejecutara la tarea o por lo menos tendra un limite definido
		
		/*
		 * para (los siguientes argumentos){
		 * SE EJECUTA ESTO
		 * }
		 * 
		 * para (variable para iterar; condicion; incremento o decremento){
		 *    se ejecuta esto
		 *    }
		 *    
		 */
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i + " .-Hola Mundo");
//		}
		
	}

}
