package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clasé con el
		//método main que se encargará de ejecutar el proyecto
		
		
		//Probar crear un objeto Celular con el constructor vacio
		
		Celular iPhone = new Celular();
		
		//Forma incorrecta de asignar valores a los atributos
		//de mi objeto iPhone
		
		//iPhone.marca="Apple";
		
		//Probando crear un nuevo celular con el Constructor con todos los argumentos
		Celular galaxy = new Celular("Samsung", "S24", "Negro", 6.1, 12, 256);
		
		//Creando un celular solo con marca y modelo teniendo dicho constructor previamente
		Celular xiaomi = new Celular("Xiaomi", "Note20");
		
		//Ahora sí a mi celular iPhone que estaba vacío le puedo asignar valores
		//a sus atributos con los respectivos métodos setter
		iPhone.setMarca("Apple");
		iPhone.setModelo("15");
		
		//Con los métodos get puedo recuperar la info de un atributo de un objeto
		System.out.println(galaxy.getModelo());
		
		//Con el método toString() creado en la clase podemos ver la información
		//de nuestro objeto impreso en consola
		System.out.println(galaxy);
		
		System.out.println(xiaomi);
		System.out.println(iPhone);
		
		//Van a crear 3 clases más para poder crear 6 objetos
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
