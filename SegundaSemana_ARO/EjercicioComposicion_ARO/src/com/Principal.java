package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Peces guppy = new Peces("guppy", "blancos", 9);
Plantas gratolia = new Plantas("Tapizante", "verde", 4);
Gambas diablo = new Gambas("diablo", "rojo", 10);
Pecera pecera70= new Pecera(100, "cuadro", "negro", diablo, guppy, gratolia);
System.out.println(pecera70);
	}

}
