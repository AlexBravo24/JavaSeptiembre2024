package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Juguete funko = new Juguete("funko", "para todas las edades", "funkopop");
carritos bmw = new carritos("hot wheels", "mayores de 3", "mattel", "bmw m5", 2023,"negro" );
carritos paqueteDino = new carritos();
paqueteDino.setDistribuidora("matel");
paqueteDino.setNombre("Paquete carros dinosaurio");
System.out.println(funko);
System.out.println(bmw);
System.out.println(paqueteDino);
	}

}
