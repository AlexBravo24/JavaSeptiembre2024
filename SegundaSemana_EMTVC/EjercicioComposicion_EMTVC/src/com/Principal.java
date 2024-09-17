package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Asiento asiento = new Asiento(4, "Tela", "Negros");
		
		Motor motor= new Motor("Mecanico 5 velocidades", 4, 6000);
		
		Llantas llanta= new Llantas(14, "Negro", "Agosto 2024");
		
		Carro sail = new Carro("Chevrolet", "Sail", "Gris", asiento, motor, llanta, 200000);
		System.out.println(sail);
	}

}
