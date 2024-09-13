package com;

@FunctionalInterface
public interface IMetodo {

	//Interfase Funcional - Es aquella interface que cuenta
	//con un solo m�todo abstracto declarado
	
	//Ejemplo: vamos a declarar un m�todo para poder hacer 
	//operaciones aritm�ticas
	//Se puede utilizar o no la anotaci�n @FunctionalInterface
	//arriba del nombre de la interface. Esto nos obliga a que 
	//s�lo puede haber un m�todo declarado en dicha interface, si 
	//hay m�s de uno, genera un error
	
	public void operacion (double a, double b);

	
}
