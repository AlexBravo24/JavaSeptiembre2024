package com;

public class Principal {

	public static void main(String[] args) 
	{
		
    Celular iPhone = new Celular();
    Celular samsung =  new Celular("samsung","S24","Negro",6.2,12,256);
    
    Carro carro1 = new Carro("Ford",5,6);
    Carro carro2 = new Carro("Nissan",3,4);
    
    Computadora compu1 = new Computadora("HP",1000,3);
    Computadora compu2 = new Computadora("ASUS",2000,8);
    
    Microfono micro1 = new Microfono("SHURE" ,-2,"USB");
    Microfono micro2 = new Microfono("RODE",0,"XLR");
    
    iPhone.setColor("Color");
    iPhone.setRam(12.0);
    iPhone.setModelo("iPhone 15");
    
    System.out.println(carro1.toString());
    System.out.println(carro2.toString());
    
    System.out.println(compu1.toString());
    System.out.println(compu2.toString());
    
    System.out.println(micro1.toString());
    System.out.println(micro2.toString());
	}

}
