package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ram Kingston = new Ram("Kingston", "DDR4", 8);
Almacenamiento disco = new Almacenamiento("Adata", "SSD", 1024);
Procesador intel = new Procesador("intel", "i5", 2.5);
Laptoop hp = new Laptoop("hp", "victus", "negra", 16000, Kingston, disco, intel);
System.out.println(hp);
	}

}
