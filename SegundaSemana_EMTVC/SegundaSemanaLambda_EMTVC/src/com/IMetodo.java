package com;

@FunctionalInterface
public interface IMetodo {

	//Interface Funcional - Es aquella interface
	//que cuenta con solo un metodo abstracto  declarado
	
	//ejemplo vamos a declarar un metodo para poder hacer
	//operaciones aritmeticas
	//Se puede utilizar o no la anotacion @FuncionalInterface
	//arriba del nombre de la interface. Esto nos obliga
	//A que solo haya un metodo declarado en dicha interface
	//si hay ams de uno, genera un error
	
	public void operacion(double a, double b);
	
	
}
