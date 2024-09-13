package com;

public class Principal {

	public static void main(String[] args) {
		// En la Poo solo debe existir una clase con el metodo main
		// que se encargara de ejecular el proyecto
		
		// Probar crear un objeto celular con el constructor vacio
		
		Celular iPhone= new Celular();
		
		// Forma incorrecta de asignar valores a los atributos 
		// de mi objeto iPhone
		
		//iPhone.marca = "Apple";
		
		// probando crear un nuevo celular con el constructor con todos los argumentos
		
		
		Celular galaxy= new Celular("samsung", "s24","negro", 6.1, 12,256) ;
		
		// Creando un celular solo con marca y modelo teniendo dico constructor previamente
		
		Celular xianomi = new Celular ("Xianomi", "Note20");
		
		// Ahora si a mi celular Iphone que estaba vacio le puedo asignar valores
		// a sus atributos con los respectivos metodos setter
		
		iPhone.setMarca("Apple");
		iPhone.setModelo("15");
		
		// Con los metodos Get puedo reperar la info de un atributo de un objeto
		
		System.out.println(galaxy.getModelo());
		
		// con el metodo to string creado en la clsa podemos ver la informacion
		// de nuestro objeto impreso en consola
		System.out.println(galaxy);
		System.out.println(xianomi);
		System.out.println(iPhone);
		
		// Van a crear 3 clases mas para crear 6 objetos
		// Deben llevar todo, atributos, por lo menos 3 atributos cada clase
		// Deben llevar todo, atributos, por lo menos 3 atributos cada clase
		// constructores ( vacio y el de todos los argumentos )
		//Getters y setters
		//toString()
		// Y los prueban en esta mis clase principal
		
		// Ej. Mesa..
		
		Mesa madera = new Mesa();
		
		
		Mesa metal = new Mesa("Hierro",5500.50,"Rustico");
		
		madera.setMaterial("Pino");
		
		System.out.println(madera);
		System.out.println(metal);
		
		
		
		System.out.println("============================");
		System.out.println("Clase Helado=================");
		System.out.println("============================");
		
		Helado vainilla = new Helado();
		Helado chocolate = new Helado( "Chocolate","Holanda",34);
		
		vainilla.setPrecio(45);
		
		System.out.println(vainilla);
		System.out.println(chocolate);
		
		System.out.println("============================");
		System.out.println("clase Autos=================");
		System.out.println("============================");
		
		Autos sonic = new Autos();
		Autos chevy = new Autos( "Chevrolet","rojo",3400);
		
		sonic.setKilometraje(50000);
		
		System.out.println(sonic);
		System.out.println(chevy);
		
		System.out.println("============================");
		System.out.println("Clase Zapatos=================");
		System.out.println("============================");
		
		Zapatos botas = new Zapatos();
		Zapatos pantunflas = new Zapatos( "flexy",7,340);
		
		botas.setPrecio(500);
		
		System.out.println(botas);
		System.out.println(pantunflas);
	
	
	}

}
