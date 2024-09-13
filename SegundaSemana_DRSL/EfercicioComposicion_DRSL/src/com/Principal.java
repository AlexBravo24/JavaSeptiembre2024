package com;

public class Principal {

	public static void main(String[] args) {
		Flash flash = new Flash(10, "Amarillo");
		Bateria bateria = new Bateria(2500,2);
		Lente lente = new Lente(100,55);
		
		Camara camara = new Camara(lente, bateria, flash);

		System.out.println(camara);
	}

}
