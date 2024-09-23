package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.logica.Cajero;
import com.modelo.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//vamos a crear nuestro hash map de productos
		//declaramos el hashmap
		Scanner entrada = new Scanner(System.in);
		Map<Integer, Producto> productos = new HashMap<Integer, Producto>();
		Producto gansito = new Producto(1, "Gansito", 18, 2);
		productos.put(1,gansito);
		//creando directo en el hashmap
		productos.put(2, new Producto(2,"sabritas", 24,1));
		productos.put(3, new Producto(3,"chokis", 22,3));
		productos.put(4, new Producto(4,"takis", 21,0));
		productos.put(5, new Producto(5,"coca", 19,1));
		
		//para recuperar valor de un objeto hashamp
		System.out.println(productos.get(2));
		//crear nuevo cajero
		Cajero maquinaCentro = new Cajero(productos);
		// probar el metodo
		System.out.println("Escribe el codigo del producto");
		int codigoIngresado = entrada.nextInt();
		System.out.println(maquinaCentro.consultar(codigoIngresado));
		
	}

}
