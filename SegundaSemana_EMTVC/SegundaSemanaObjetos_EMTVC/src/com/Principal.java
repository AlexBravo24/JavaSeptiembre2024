package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el
		//metodo main que se encargara de ejecutar el proyecto

		
		//Probar crear un objeto Celular con el constructor vacio
		
		Celular iPhone= new Celular ();
		
		//Forma incorrecta de asignar valores a los atributos
		//de mi objeto iphone
		
		//iPhone.marca= "Apple";
		
		//Probando crear un nuevo celular con el constructor con todos los argumentos
		Celular galaxy = new Celular("Samsung", "S24", "Negro", 6.1, 12, 256);
		
		//Creando un nuevo celular con solo marca y modelo teniendo dicho constructor previamente
		Celular xiaomi= new Celular("Xiaomi","Note 22");
		
		//Ahora si a mi celular iphone que estaba vacio le puedo asignar valores
		//a sus atributos con los respectivos metodos setter
		iPhone.setMarca("Apple");
		iPhone.setModelo("15");
		
		//Con los metodos get puedo recuperar la info de un atributo de un objeto
		System.out.println(galaxy.getModelo());
		
		//COn el metodo toString() creado en la clase podemos ver la informacion 
		//de nuestro objeto impreso en consola
		System.out.println(galaxy);
		
		System.out.println(xiaomi);
		System.out.println(iPhone);
		
		//Van a crear 3 clases mas para poder crear 6 objetos
		//Van a craer uno vacio y uno con todo de cada clase
		//Deben llevar todo, atributos, por lo menos, 3 atributos cada clase
		//Constructores (Vacio y el de todos los argumentos)
		//Getters y Setters
		//toString()
		//Y los prueban en esta misma clase
		
		//CLASE 1 LAPTOPS
		Laptops Lenovo = new Laptops();
		
		Laptops Acer = new Laptops("Aspire lite", 16, 512);
		
		Lenovo.setModelo("Ideapad Slim 5");
//		Lenovo.setAlmacenamiento(512);
//		Lenovo.setRam(8);
		
		System.out.println(Lenovo);
		System.out.println(Acer);
		
		//CLASE 2 PROCESADORES
		Procesador Intel = new Procesador();
		
		Procesador AMD = new Procesador("Ryzen 7 5700G", 3000, 3.4);
		
		Intel.setModelo("Core i9 12900K");
//		Intel.setPrecio(6743);
//		Intel.setVelocidad(5.2);
		
		System.out.println(Intel);
		System.out.println(AMD);
		
		//CLASE 3 CANCIONES
		Cancion Sharks = new Cancion();
		
		Cancion LoMaloDeSerBueno = new Cancion("Lo malo de ser bueno", "Porfiado", "El cuarteto de Nos");
		
		Sharks.setTitulo("Sharks");
		//Sharks.setAlbum("Sharks");
		//Sharks.setArtista("Imagine Dragons");
		
		System.out.println(Sharks);
		System.out.println(LoMaloDeSerBueno);
	}

}
