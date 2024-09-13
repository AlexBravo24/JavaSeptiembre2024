package com;

public class Principal {

	public static void main(String[] args) {
	
		Kilometraje millas = new Kilometraje(404.8, 9320.57, "millas");
		Llanta rueda = new Llanta("deportiva", 22.5, 12);
		Motor diesel = new Motor(8, 600, "diesel");
		
		Camion Volvo = new Camion("Volvo", "FH16", 2023, "Blanco", millas, rueda, diesel);
		
		System.out.println(Volvo); 
	}

}
