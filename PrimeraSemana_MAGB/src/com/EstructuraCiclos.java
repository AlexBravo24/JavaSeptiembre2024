package com;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//metodos que permiten ejecutar sentencias o tareas una cantidad de veces mientras una condicion se cumpla
		
		//while = se ejecutara una cantidad indeterminada, mientras se cumpla la condicion
		//do-while = se ejecutara una vez, luego evaluara si seguira ejecutandoce
		//for = es un ciclo determinado, tiene un limite definido por el usuario, ejecutara la actividad hasta que la condicion se cumpla
		
		int x = 0;
		while (x<4) {
			System.out.println("Estos e un ciclo While");
			//para evitar que tienda al infinito, se puede introducir un cambio para incrementar la condicion y llegar a un tope, de lo contrario, se reproducira eternamente
			x = x+1;
		}
		
		
		do {
			System.out.println("Esto es un ciclo do-While");
			x = x+1;
		}while (x<4);
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Esto es un ciclo for");
		}
	}

}
