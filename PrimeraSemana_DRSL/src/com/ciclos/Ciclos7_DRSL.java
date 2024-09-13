package com.ciclos;

public class Ciclos7_DRSL {

	public static void main(String[] args) {
//		7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
//		dinero?
		System.out.println("===== EJERCICIO #7 =====");
		float money = 700.0f;
		float interestRate = 0.02f;
		float monthlyInterest = 0.0f;
		int monthCount = 1;
		while(money < 1500)
		{
			monthlyInterest = money * interestRate;
			money += monthlyInterest;
			System.out.println("Mes  "+ monthCount + " = $" + money);
			monthCount++;
		}
	    System.out.println("Fueron " + monthCount +" Meses para ganar $1500!");
	}

}
