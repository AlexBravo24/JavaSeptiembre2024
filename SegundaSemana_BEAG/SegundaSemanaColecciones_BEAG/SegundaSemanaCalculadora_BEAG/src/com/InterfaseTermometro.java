package com;

public interface InterfaseTermometro { // Las interfases son nombradas con una I inicial seguido del nombre del archivo

	//Las interfases nos ayudan a simular el tema de la multiherencia en Java,
	//dado que solo son un listado de métodos abstractos que una clase tendrá
	//que implementar 
	//Aquí solo se declaran métodos abstractos e incluso no es necesario
	//el uso de la palabra "abstract"
	
	public void tomarTemp();
	
	//Algo que si no podemos hacer es declarar un método con cuerpo
	//public void convertirFarenheit() {
	//}

	
	
}
