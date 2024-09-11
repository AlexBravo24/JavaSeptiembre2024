package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		//Estructuras ciclos
		//También llamadas bucles o estructuras de interación
		//Nos va a permitir ejecutar una tarea o sentencia "n" veces mientras una
		//variable booleana o condición se cumpla
		
		//while - indeterminado (mientras se cumpla una condición)
		
		/*mientras (esto se cumpla)}
		 * se ejecuta este bloque de código
		 * }
		 */
		
		int x = 1; //Variable que nos ayudará a iterar o ejecutar una tarea de acuerdo a
		//cómo cambia su valor
		
//		while (x<=5) {
//			System.out.println("Hola mundo "+x);
//			//Para evitar que este ciclo tienda a infinito tenemos que introducir un cambio en x,
//			//es decir, incrementarla
//			//Hay dos formas de expresar esto:
//			//x=x+1;
//			x++;
//		}
		
		//do - while - Primero hace y después evalúa si debe seguir ejecutandose
		//Es útil cuando nos encontremos con tarea o condiciones que posiblemente no se puedan 
		//cumplir pero así nos aseguramos que el programa se ejecute por lo menos una vez
		
//		do {
//			System.out.println("Hola mundo");
//		} while (x>5);
//		}
	
	//for (para... los siguientes argumentos)
		//Es un ciclo determinado porque desde un inicio sabemos cuántas veces se va a ejecutar
		//la tarea o por lo menos tendrá un límite definido
		
		/*para (los siguientes argumentos){
		 * 	SE EJECUTA ESTO
		 * }
		 * para (variable a iterar; condición; incremento o decremento){
		 * 	se ejecuta esto
		 * }
		 * 
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ".-Hola mundo");
			
		}
			
		}

	







}


