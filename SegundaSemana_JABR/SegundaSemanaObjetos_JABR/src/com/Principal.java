package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clas� con el
		//m�todo main que se encargar� de ejecutar el proyecto
		
		
		//Probar crear un objeto Celular con el constructor vacio
		
		Celular iPhone = new Celular();
		
		//Forma incorrecta de asignar valores a los atributos
		//de mi objeto iPhone
		
		//iPhone.marca="Apple";
		
		//Probando crear un nuevo celular con el Constructor con todos los argumentos
		Celular galaxy = new Celular("Samsung", "S24", "Negro", 6.1, 12, 256);
		
		//Creando un celular solo con marca y modelo teniendo dicho constructor previamente
		Celular xiaomi = new Celular("Xiaomi", "Note20");
		
		//Ahora s� a mi celular iPhone que estaba vac�o le puedo asignar valores
		//a sus atributos con los respectivos m�todos setter
		iPhone.setMarca("Apple");
		iPhone.setModelo("15");
		
		//Con los m�todos get puedo recuperar la info de un atributo de un objeto
		System.out.println(galaxy.getModelo());
		
		//Con el m�todo toString() creado en la clase podemos ver la informaci�n
		//de nuestro objeto impreso en consola
		System.out.println(galaxy);
		
		System.out.println(xiaomi);
		System.out.println(iPhone);
		
		//Van a crear 3 clases m�s para poder crear 6 objetos
		// Van a crear uno vacio y uno con todo de cada clase
		//Deben llevar todo, atributos, por lo menos 3 atributos cada clase
		//Constructores (vacio y el de todos los argumentos)
		//Getters y Setters
		//toString()
		//Y los prueban en esta mis clase principal
		
		//Ej. Mesa...
		Mesa madera = new Mesa();
		
		Mesa metal = new Mesa("Hierro", 5500.50, "Rustico");
		
		madera.setMaterial("Pino");
		
		System.out.println(madera);
		System.out.println(metal);

	}

}
