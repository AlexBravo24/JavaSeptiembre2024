package com;

@FunctionalInterface
public interface IMetodo {

	//Interfase Funcional - Es aquella interface que cuenta
	//con un solo método abstracto declarado
	
	//Ejemplo: vamos a declarar un método para poder hacer 
	//operaciones aritméticas
	//Se puede utilizar o no la anotación @FunctionalInterface
	//arriba del nombre de la interface. Esto nos obliga a que 
	//sólo puede haber un método declarado en dicha interface, si 
	//hay más de uno, genera un error
	
	public void operacion (double a, double b);

	
}
