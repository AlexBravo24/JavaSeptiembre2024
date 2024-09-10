package com.ciclos;

public class Ciclos6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inversion = 1000.00;
		double interes = 1.02;
		int mes = 1;
		while (mes <= 12) {
			inversion = inversion * interes;
			System.out.println("tu inversion a " + mes + " mes(es) es de " + inversion);
			mes = mes + 1;
		}
			
		}

	}


