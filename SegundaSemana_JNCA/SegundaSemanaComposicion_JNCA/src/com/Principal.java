package com;

public class Principal {

	public static void main(String[] args) {
		
		//En este concepto de composicion de objetos
		//primero debemos crear los objetos "mas pequeños" o que formran
		//parte de uno mas grande

		Ram kingstone = new Ram("Kingstone", "DDR4", 8);
		
		Almacenamiento disco = new Almacenamiento("Adata", "SSD", 1024);
		
		Procesador intel = new Procesador("Intel", "i5", 2.5);
		
		//Ahora si ya podemos crear nuestra laptop
		Laptop hp = new Laptop("HP", "Victus", "Negra", 16000, kingstone, disco, intel);
		
		System.out.println(hp);
		
		//Actividad realizar un ejemplo de objeto de composicion
		//Un objeto que se componga de atributos propios y de por lo menos
		//otros 3 objetos. Como el ejemplo de Laptop
		//Van a crear un nuevo proyecto que se llamara, EjercicioComposicion_JNCA
		
	}

}
