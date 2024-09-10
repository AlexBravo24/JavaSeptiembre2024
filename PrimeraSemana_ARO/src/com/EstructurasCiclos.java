package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//estructuras ciclos
		//tambien llamadas bubles o estructuras de interaccion
		//nos van a permitir ejecutar una tarea o sentencia
		//"n" veces mientas una variable booleana o condicion se cumpla
		/*Mientras estp se cumpla
		 * se ejecuta este codigo
		 * *
		 */
		int x = 1;
		//while (x<5) {
			//System.out.println("Hola mundo");
			//para detener ese infinito tenemos que realizar cambios en X
			//se puiede expresar de la siguient manera
			//x = x +1;
		//}
		// do while, primero hace y despues evalua si se ejecuta
		// es utitl para tareas qie no se puedan cu,plie 
	//	do {
		//	System.out.println("hola mundo");
			
		//}
		//while (x>5);
		
		
		//for (para ... los siguientes argumentos)
		//es un ciclo determinado. porque desde un inicio sabemos cuantas veces
		//se ejecutara la tarera o por lo menos tendra un limite definido
		/*
		 * para (los siguientes argumentos)
		 * SE EJECUTA ESTO
		 * }
		 * 
		 * PARA (variable para iterar; condicion; incremento o decremento) {
		 * se ejecuta esto
		 * }
		 * 
		 */
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".- hola mundo");
		}
	}

}
