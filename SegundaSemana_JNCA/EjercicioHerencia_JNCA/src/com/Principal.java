package com;

public class Principal {

	public static void main(String[] args) {
		
		Transporte Mar = new Transporte("Maritimo", "ug56nbfg");
		
		Maritimo barco = new Maritimo("Maritimo", "hyrf456l", "de transporte", "Naviera Integral", 80);
		
		
		Maritimo lancha = new Maritimo();
		lancha.setCompañia("Naviera Integral");
		lancha.setCapacidad(80);
		
		System.out.println(Mar);
		System.out.println(barco);
		System.out.println(lancha);
		


	}

}
