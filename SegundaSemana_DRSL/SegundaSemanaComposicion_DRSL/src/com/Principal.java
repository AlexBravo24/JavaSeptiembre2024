package com;

public class Principal {

	public static void main(String[] args) 
	{
		RAM kingston = new RAM("Kingston","DDR4",8);
		Almacenamiento disco = new Almacenamiento("ADATA","SSD","1024");
		Procesador intel = new Procesador("Intel", "i5" , 2.5f);
		
		Laptop hp = new Laptop("HP","Victus","Negra",16000,kingston,disco,intel);
		
		System.out.println(hp);
	}

}
