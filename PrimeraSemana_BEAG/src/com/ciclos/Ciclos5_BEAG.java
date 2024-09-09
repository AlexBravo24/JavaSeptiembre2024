package com.ciclos;

import java.util.Scanner;

public class Ciclos5_BEAG {

	public static void main(String[] args) {

		/*
		 * 5. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		 * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		 * horas
		 */

		System.out.println("------ EJERCICIO 5 ------");

		// Segundos en un día
		int segundosDia = 24 * 60 * 60;

		for (int segundosTotales = 0; segundosTotales < segundosDia; segundosTotales++) {
			// Cálculo de horas, minutos y segundos a partir de los segundos totales
			int horas = segundosTotales / 3600;
			int minutos = (segundosTotales % 3600) / 60;
			int segundos = segundosTotales % 60;

			// Formato de reloj digital: %02d:%02d:%02d%n
			System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

			// Esperar un segundo entre cada uno:
			try {
				Thread.sleep(1000); // Pausa de 1 segundo
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

//		//Otra forma de hacerlo:	
//			for (int h = 0; h <= 23; h++) {
//				for (int m = 0; m <= 59; m++) {
//				for (int s = 0; s <= 59; s++) {
//						System.out.printf("%02d:%02d:%02d\n", h, m, s);
//						Thread.sleep(1000);
//					}

		}
	}
}
