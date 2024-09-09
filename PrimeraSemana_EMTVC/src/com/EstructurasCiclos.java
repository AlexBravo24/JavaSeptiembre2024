package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		/*
		 * Estructuras Ciclos
		 * Tambien llamadas bucles o estructuras de iteracion
		 * nos van a permitir ejecutar una tarea o sentencias
		 * "n" veces mientras una variable booleana o condicion se cumplan
		 */
		//While - indeterminado (mientras se cumpla una condicion)
		
		/*mientras (esto se cumpla){
		 * se ejecute este bloque de codigo
		 * }
		 */
		
		@SuppressWarnings("unused")
		int x =1;
		
//		while(x<=5) {
//			System.out.println(x+" .-Hola mundo");
//			/*Para detener que este ciclo tienda al infinito
//			 * tenemos que introducir un cambio en x, es decir, incrementarla
//			 * Hay dos formas de expresar esto*/
//			//x= x+1;
//			x++;
//		}
		
		
		/*do - while - Primero hace y despues evalua si debe seguir ejecutandose
		 * Es util cuando nos encontremos con tareas
		 * o condiciones que posiblemente no se puedan cumplir
		 * pero asi aseguramos que el programa se ejecute por lo menos una vez */
		
//		do {
//			System.out.println("Hola mundo");	
//		}while(x>5);
		
		
		/*for (Para... los siguientes argumentos)
		 * Es un ciclo determinado, porque desde un inicio sabemos cuantas veces
		 * se ejecuta la tarea o por lo menos tendra un limite definido		 */
		
		/*
		 * para (los siguientes argumentos){
		 * 		SE EJECUTA ESTO
		 * }
		 * 
		 * para (varibale a iterar; condicion; incremento o decremento){
		 * 		SE EJECUTA ESTO
		 * }
		 * 
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i+" .-Hola mundo");	
		}
		
		
	}

}
