package com;

public class Principal {

	public static void main(String[] args) {
	
		Animal max = new Animal("Max", 2, 11, "Croquetas y Pollo");
		
		Perro dalmata = new Perro("Rex", 4, 25, "Pollo y carne", "Dalmata", "Grande", "Jugueton y amigable");
		
		Perro pomerania = new Perro();
		pomerania.setNombre("Mika");
		pomerania.setTalla("Chica");
		pomerania.setRaza("Pomerania");
		
		System.out.println(max);
		System.out.println(dalmata);
		System.out.println(pomerania);

	}

}
