package com.ciclos;

public class Ciclos6_DRSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés
//		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si
//		todo el dinero lo reinvierte?
		System.out.println("===== EJERCICIO #6 =====");
		float money = 4000.0f;
		float interestRate = 0.02f;
		float monthlyInterest = 0.0f;
		for (int i = 0; i < 13; i++) 
		{
			monthlyInterest = money * interestRate;
			money += monthlyInterest;
			System.out.println("Mes  "+ i + " = $" + money);
		}
		System.out.println("Dinero Anual = $" + money);
	}
}
