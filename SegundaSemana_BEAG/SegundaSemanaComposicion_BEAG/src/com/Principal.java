package com;

public class Principal {

	public static void main(String[] args) {

		// En este concepto de composici�n de objetos, primero debemos crear los objetos
		// "m�s peque�os" o que formar�n parte de uno m�s grande

		Ram kingston = new Ram("Kingston", "DDR4", 8);
		Almacenamiento disco = new Almacenamiento("Adata", "SSD", 1024);
		Procesador intel = new Procesador("Intel", "i5", 2.5);
		
		//Ahora si ya podemos crear nuestra laptop
		//Poner el nombre de los valores de los objetos m�s peue�os en los atributos que se solicitan
		Laptop hp = new Laptop("HP", "Victus", "Negra", 16000, kingston, disco, intel);
		
		System.out.println(hp);
		
		//ACTIVIDAD A REALIZAR:
		//Un ejemplo de objeto de composici�n
		//Un objeto que se componga de atributos propios y de por lo menos de otros 3 objetos
		//Van a crear un nuevo proyecto que se llamar� EjercicioComposicion_BEAG
	}

}
