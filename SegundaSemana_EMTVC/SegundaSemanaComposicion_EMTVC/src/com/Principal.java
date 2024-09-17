package com;

public class Principal {

	public static void main(String[] args) {

		// En este concepto de composicion de objetos
		// primero debemos crear los objetos "mas pequeños"
		//o q formaran parte de uno mas grande
		
		Ram kingston = new Ram("Kingston", "DDR4", 8);
		
		Almacenamiento disco = new Almacenamiento("Adata", "SSD", 1024);
		
		Procesador intel = new Procesador("Intel", "i5", 2.5);
		
		//Ahora si ya podemos crear nuestra laptop
		Laptop hp = new Laptop("HP", "Victus", "Negra", 16000, kingston, disco, intel);

		System.out.println(hp);
	}

}
