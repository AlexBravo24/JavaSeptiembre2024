package com;

public class Principal {

	public static void main(String[] args) {
		Mascota juan = new Mascota("juan", "Vacunacion", 33);
		
		Perro labrador= new Perro ("juan", "Vacunacion", 33,"Luna", "Chihuahua", 2);
		
		Perro salchicha =  new Perro();
		salchicha.setAsunto("operacion");
		salchicha.setEdad(4);
		
		System.out.println(juan);
		System.out.println(labrador);
		System.out.println(salchicha);

	}

}
