package com.ciclos;

public class Ciclos7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double inversion = 700;
double interes =1.02;
double mes = 0;
while (inversion <= 1500) {
	inversion = inversion * interes;
	mes = mes + 1;
	

}
	System.out.println("necesitas " + mes + " mes(es) para compretar tu meta" );
	}

}
