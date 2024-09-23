package com;

public interface ITermometro {
//Las interfaces nos ayudan a simular el tema de multi herencia
	//dado que solo son un dictado de metodos abstractos
	//que una clase tendra que implementar
	//aqui solo se declaran metodos abstractos
	//e incluso no es necesario el uso de abstract
	
	public void tomarTemperatura();
	
	//Algo que si no podemos hacer es declarar un metodo cuerpo
	//public void convertirFarenheit(){}
	
}
