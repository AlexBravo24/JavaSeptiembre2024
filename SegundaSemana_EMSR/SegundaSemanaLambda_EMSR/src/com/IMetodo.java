package com;

@FunctionalInterface

public interface IMetodo {

	//Interface Funciona_ Es aquella interface 
	//que cuenta solo con un metodo declarado
	
	//Ejemplo vamos a declarar un metodo para poder hacer
	//operaciones aritmeticas
	//se puede utilizar o no la anotacion @FuntionalInterface
	//arriba del nombre de la interface. Esto nos obliga
	//a que solo haya un metodo declarado en dicha interface
	// si hay mas de uno genera error
	
	public void operacion(double a, double b);
	
}
