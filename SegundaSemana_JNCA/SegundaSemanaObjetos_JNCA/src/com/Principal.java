package com;

public class Principal {

	public static void main(String[] args) {
		// En la poo solo debe existir una clase con el
		//metodo main que se encargara de ejecutar el proyecto

		
		//Probar crear un objeto Celular con el contructor vacio
		
		Celular iPhone = new Celular();
		
		//Forma incorrecta de asignar valores a los atributos
		//de mi objeto iPhone
		
		//iPhone.marca = "Apple";
		
		//Probando crear un nuevo celular con el Constructor con todos los argumentos
		Celular galaxy = new Celular ("Samusng", "S24", "Negro", 6.1, 12, 256);
		
		//Creando un celular solo con marca y modelo teniendo dicho constructor previamente
		Celular xiaomi = new Celular("Xiaomi", "Note20");
		
		//Ahora si a mi celuar iPhone que estaba vacio le puedo asignar valores
		//a sus atributos con los respectivos metodos setter
		iPhone.setMarca("Apple");
		iPhone.setModelo("15");
		
		//Con los metodos get puedo recuperar la info de un atributo de un objeto
		System.out.println(galaxy.getModelo());
		
		//Con el metodo toString() creado en la clase podemos ver la informacion
		//de nuestro objeto impreso en consola
		System.out.println(galaxy);
		
		System.out.println(xiaomi);
		System.out.println(iPhone);
		
		//Van a crear 3 clases mas para poder crear 6 objetos
		//Van a crear uno vacio y uno con todo de cada clase
		//deben llevar todo, atributos, por lo menos 3 atributos cada clase
		//constructores (vacio y el de todos los rgumentos)
		//getters y setters
		//toString
		//Y los prueban en esta clase principal
		
		//Ej. Mesa...
		Mesa madera = new Mesa();
		
		Mesa metal = new Mesa("Hierro", 5500.50, "Rustico");
		
		madera.setMaterial("Pino");
		
		System.out.println(madera);
		System.out.println(metal);
		
		System.out.println("==================================");
		System.out.println("=========Ejercicios===============");
		System.out.println("==================================");
		
		Humano Jesus = new Humano("Masculino", 25, "Ingeniero de Servicio");
		Humano Narciso = new Humano();	
		System.out.println(Jesus);
		System.out.println(Narciso);
		
		Autos maxima = new Autos("Nissan", 2012, "Gris");
		Autos jetta = new Autos();
		System.out.println(maxima);
		System.out.println(jetta);
		
		Libros elHobbit = new Libros("novela", 1975, 375);
		Libros meditaciones = new Libros();
		System.out.println(elHobbit);
		System.out.println(meditaciones);
		
		
	}

}
