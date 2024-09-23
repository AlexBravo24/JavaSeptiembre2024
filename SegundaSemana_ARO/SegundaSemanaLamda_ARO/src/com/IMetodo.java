package com;

@FunctionalInterface
public interface IMetodo {
//interface funcional - es aquella 
	//que cuenta solo con un metodo abstracto declarado
	
	//ejemplo vamos a declarar un metodo para
	//operaciones aritmeticas
	//se puede utilizar o no la notacion
	//arriba del nombre de la interface
	//esto obliga a que solo haya un metodo declarado
	//en dicha interface si hay mas de uno, genera un error
	
	public void operacion (double a, double b);
	
	
}
