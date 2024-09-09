package com.ciclos;

public class Ciclos5_JNCA {

	public static void main(String[] args) throws InterruptedException {
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
 
		
		for (int i = 0; i <= 23; i++) {
			
			for (int i2 = 0; i2 <= 59; i2++) {
			
				for (int i3 = 0; i3 <= 59; i3++) {
					
					System.out.printf("%02d:%02d:%02d\n", i, i2, i3);
					Thread.sleep(1000);
				}
			}
		}
		
	}

}
