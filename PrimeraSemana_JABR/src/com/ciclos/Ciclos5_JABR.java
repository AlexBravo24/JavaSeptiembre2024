package com.ciclos;

public class Ciclos5_JABR {

	public static void main(String[] args) throws InterruptedException {
		// 5. Simular el comportamiento de un reloj digital,
		// imprimiendo la hora, minutos y segundos de un día
		// desde las 00:00:00 horas hasta las 23:59:59 horas

		for (int h = 0; h <= 23; h++) {
			for (int m = 0; m <= 59; m++) {
				for (int s = 0; s <= 59; s++) {
					System.out.printf("%02d:%02d:%02d\n", h, m, s);
					Thread.sleep(1000);
				}

			}

		}
	}

}
