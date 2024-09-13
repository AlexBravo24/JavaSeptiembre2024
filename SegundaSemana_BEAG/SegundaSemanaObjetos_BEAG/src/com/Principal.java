package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO sólo debe de existir una clase con el método main,
		// que se encargará de ejecutar el proyecto
		
		// Probar crear un objeto Celular con el CONSTRUCTOR VACÍO
		
		Celular iPhone = new Celular(); // clase (Celular) + objeto/instancia (iPhone)
		//instancia y objeto es lo mismo
		
		// Forma incorrecta de asignar valores a los atributos de mi objeto iPhone
		// iPhone.marca = "Apple";
		
		// Forma correcta: (previamente en la clase Celular tuve que haber puesto los argumentos)
		// Probando crear un nuevo celular con el CONSTRUCTOR CON TODOS LOS ARGUMENTOS
		Celular galaxy = new Celular("Samsgung", "S24", "Negro", 6.1, 12, 256);
		// ... new + Ctrl + espacio me da todos los argumentos, y voy cambiando todos los atributos
		
		
		//Creando un Celular solo con marca y modelo teniendo dicho constructor previamente
		Celular xiamoi = new Celular("Xiaomi", "Note 20");
		
		
		//Ahora sí, a mi celular iPhone que estbaa vacío le puedo asignar valores a sus atributos con los respectivos
		//métodos setter
		iPhone.setMarca("Apple");
		iPhone.setModelo("15");
		
		//Con los métodos get puedo recuperar la info de un atributo de un objeto 
		System.out.println(galaxy.getModelo());
		
		//Previamente en la clase Celular tuve que haber establecido el Método toString ()
		//Con el método toString() creado en la clase podemos ver la info de nuestro objeto impreso en la consola
		
		System.out.println(galaxy);
		System.out.println(xiamoi);
		System.out.println(iPhone);
		
		//ACTIVIDAD A REALIZAR
		//Van a crear 3 clases más para poder crear 6 objetos
		//Van a crear uno vacío y uno con todo de cada clase
		//Deben de llevar todo, atributos, por lo menos 3 atributos cada clase
		//Constructores (vacio y el de todos los argumentos)
		//Getters y Setters
		//toString ()
		//y los prueban en esta mi clase principal
		
		System.out.println("\nACTIVIDAD POO");
		
		System.out.println("Clase 1: VIVIENDA");
		
		Vivienda apartamento = new Vivienda ();
		
		Vivienda casa = new Vivienda("Californiano", 2000000, 80, 1, "Colonia Del Valle");
				
		apartamento.setMetrosCuadrados(30);
		
		System.out.println(casa);
		System.out.println(apartamento);
		
		//--------
		System.out.println("\nClase 2: PELÍCULAS");
		
		Peliculas terror = new Peliculas ();
		
		Peliculas accion = new Peliculas("Artes Marciales", 1980, "B", 2.45);
		
		terror.setClasificación("C");
		
		System.out.println(terror);
		System.out.println(accion);
		
		//---------
		System.out.println("\nClase 3: ROPA");
		
		Ropa adulto = new Ropa ();
		Ropa juvenil = new Ropa("pantalon", "Zara", "M", "Poliéster", 399.00);
		
		adulto.setMarca("Massimo Dutti");
		
		System.out.println(adulto);
		System.out.println(juvenil);
	}

}
