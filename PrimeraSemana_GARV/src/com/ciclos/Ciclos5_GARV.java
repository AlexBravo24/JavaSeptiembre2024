package com.ciclos;

public class Ciclos5_GARV {


	public static void main(String[] args) throws InterruptedException {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas

		int hora=0, minutos=0, segundos = 0;
				
		while (true) {
			
			if(hora<10) {
				System.out.print("0");
			}
			System.out.print(hora+":");
			
			if(minutos<10) {
				System.out.print("0");
			}	
			System.out.print(minutos+":");
			
			if(segundos<10) {
				System.out.print("0");
			}	
			System.out.println(segundos);
			
	
		segundos++;
		
		if (segundos==60) {
			segundos=0;
			minutos++;
			if (minutos==60) {
			minutos=0;
			hora++;
			if (hora==24) {
			hora=0;
			}
			}
		}
		
		Thread.sleep(1000);
		
		}
		

		
		
	}
	}

