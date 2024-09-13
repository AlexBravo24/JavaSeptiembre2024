package com;

@FunctionalInterface
public interface IMetodo {
	
	//Interface Funcional - Es aquella interface
	//que cuenta solo con un método abstracto declarado
	
	//Ejemplo vamos a declar un método para poder hacer
	//operaciones aritméticas
	//Se puede utilizar o no la anotación @FunctionalInterface
	//arriba del nombre de la interface. Esto nos obliga
	//a que solo haya un método declarado en dicha interface
	//si hay más de uno, genera un error
	
	public void operacion (double a, double b);
	

}
