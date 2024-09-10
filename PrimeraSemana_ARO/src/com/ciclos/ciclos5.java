package com.ciclos;

public class ciclos5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int segundos = 0; 
int minutos = 0;
int horas = 0;
while (horas <=23) {
	while (minutos<=59)
	{
		while (segundos <= 59)
		{
			System.out.println("la hora es: " + horas + ":"+ minutos + ":" + segundos);
		segundos = segundos + 1;
		
		}
		minutos = minutos + 1;
		segundos = 0;
		
	}
	horas = horas+1;
	minutos = 0;
}
	}

}
