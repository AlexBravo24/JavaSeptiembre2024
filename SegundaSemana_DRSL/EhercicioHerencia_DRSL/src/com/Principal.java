package com;

public class Principal {

	public static void main(String[] args) 
	{
		ConsolaVideojuegos xbox = new ConsolaVideojuegos(120, 10 , 5, "xbox one", 4, true);
		
		ConsolaVideojuegos ps5 = new ConsolaVideojuegos(140, 15 , 8, "PlayStation 5 slim", 4, false);
		
		System.out.println(xbox);
		System.out.println(ps5);
	}

}
