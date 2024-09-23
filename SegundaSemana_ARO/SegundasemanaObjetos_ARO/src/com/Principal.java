package com;

public class Principal {

	public static void main(String[] args) {
		//En el POO solo debe de existir una clase con el metodo main
		//este se encarga de ejecutqar nuestro proyecto
		// TODO Auto-generated method stub
Celular iphone = new Celular();
// forma incorrecta de asignar valores a los atributos
//de mi iphone

Celular galaxy = new Celular("samsung", "s22 ", "negro", 6.1, 12, 256);
	
	//ahora si a el celular iphone  se da CON setter
iphone.setMarca("apple");
iphone.setModelo("15");
// con los metodos get puedo recuperar la info de un atributo de un objeto
System.out.println(galaxy.getModelo());
	System.out.println(galaxy);

	Sneaker dunk420 = new Sneaker();
	Sneaker bornRaised = new Sneaker("nike", "dunk sb low", "adulto",26);
	dunk420.setMarca("nike");
	System.out.println(dunk420);
	System.out.println(bornRaised);
	
	Equiposcomputo compuMedia = new Equiposcomputo();
	Equiposcomputo compuAlta = new Equiposcomputo("ryzen 9", "nvidia 4070", "win 11", 2000, 64);
	compuMedia.setRam(12);
	compuMedia.setCapacidaddd(2000);
	System.out.println(compuAlta);
	System.out.println(compuMedia);
	
Peces neon = new Peces();
Peces guppy = new Peces("full red albino", "rojo", 11.1, "macho");
neon.setColor("Rojo");
neon.setRaza("tetra neon");
System.out.println(neon);
System.out.println(guppy);
	}

}
