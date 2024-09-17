package com;

public class Principal {

	public static void main(String[] args) {

		Info Juan = new Info("Pancho", "Juan", 1234567890);

		Mascota Pancho = new Mascota("Pancho", "Juan", 1234567890, "Perro", "Pastor aleman", "Cafe con manchas negras");
		
		Mascota taquito= new Mascota();
		
		taquito.setDueño("Maria");
		taquito.setEspecie("Perro");
		taquito.setRaza("Salchicha");
		
		System.out.println(Juan);
		System.out.println(Pancho);
		System.out.println(taquito);
	}

}
