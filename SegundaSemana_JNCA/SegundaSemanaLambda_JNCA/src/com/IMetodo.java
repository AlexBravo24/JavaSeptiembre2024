package com;

@FunctionalInterface
public interface IMetodo {

	//Interface funcional - Es aquella interface
	//que cuenta solo con un metodo abstracto declarado
	
	//Ejemplo vamos a declarar un metodo para poder hacer
	//operaciones aritmeticas
	//Se puede utilizar o no la anotacion @FunctionalInterface
	//arriba del nombre de la interface. Esto nos obliga 
	//a que solo haya un metodo declarado en dicha interface
	//si hay mas de uno, genera un error
	
	public void operacion (double a, double b);
	
	
	
}
