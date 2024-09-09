package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Estructura ciclos
		// Tambien llamadas bucles o estructuras de iteracion 
		// Nos van a permitir ejecutar una tarea o sentencias
		//"n" veces mientras un variable booleana o condicion se cumplan
		
		// While- indeterminado (Mientras se cumpla una condicion)
		
		/*
		 * mientras (esto se cumpla){
		 * 		se ejecuta este bloque de codigo
		 * }
		 */

		int x =1; // variable que nos ayudara a iterar o ejecutar una tarea
		// de acuerdo a como cambie su valor
		
		while(x<=5){
			System.out.println(x +" . Hola mundo");
			//para detener que este ciclo tienda al infinito
			//Tenemos que introducir un cambio en x, es decir, incrementarla
			//Hay dos formas de expresar esto
			
			//x= x+1;
			x++;
			
		}
		
		// do - While Primero hace y despues evalua si debe seguir ejecutandose
		// Es util cuando nos enconttramos con tareas
		// o condiciones que posiblemente no se puedan cumplir
		// Pero asi aseguramos que el programa se ejecuta por lo menos una vez
		
//		do {
//			System.out.println("Hola mundo");
//		}while (x>5);
//		
		// for (para... los siguientes argumentos)
		// Es un ciclo determinado, porque desde n iniciosabemos cuantas veces
		//se ejecutara la tares o por lo menos tendra un limite definido
		
		/*
		 * para (los siguientes argumentos){
		 * 		se ejecuta esto
		 * }
		 * 
		 * para (variable para iterar; condiciones; incremento o decremento){
		 * 
		 * se ejecuta esto
		 * }
		 */
		
		for (int i =0 ; i< 5 ;i++) {
			System.out.println(i + " .-Hola mundo");
		}
		
	}

}
