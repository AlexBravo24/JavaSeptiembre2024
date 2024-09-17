package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.logica.Maquina;
import com.modelo.Producto;

public class Principal {

	public static void main(String[] args) {
		Map<String, Producto> productos = new HashMap<String, Producto>();
		char[] letras = {'A','B','C'};
		
		
		Maquina universidad = new Maquina("Universidad", productos); 
		productos.put("A1", new Producto("Barcel", "Takis", "Fuego", 18, 5));
		productos.put("A2", new Producto("Barcel", "Takis", "Cobra", 22, 10));
		productos.put("A3", new Producto("Sabritas", "Sabritas", "FlaminHot", 20, 1));
		productos.put("B1", new Producto("Bimbo", "Mantecadas", "Nuez", 24, 0));
		//productos.put("B2", new Producto("Barcel", "Takis", "Fuego", 18, 5));
		//productos.put("B3", new Producto("Barcel", "Takis", "Fuego", 18, 5));
		//productos.put("C1", new Producto("Barcel", "Takis", "Fuego", 18, 5));
		productos.put("C2", new Producto("Nestle", "Nescafe", "Latte", 22.5, 3));
		//productos.put("C3", new Producto("Barcel", "Takis", "Fuego", 18, 5));
		
		
		for (int i = 0; i < letras.length; i++) {
			String acum="";
			for (int j = 1; j <= 3; j++) {
				String codigo= ""+ letras[i]+j;
				 acum= acum + universidad.consultar(codigo) + "       ";
			}
			System.out.println(acum);
		}
		
		Scanner entrada = new Scanner(System.in);
		boolean admin= false;
		if (!(admin==false)) {
			do {
			System.out.println("Ingrese La casilla a reabastecer: ");
			String casilla= entrada.next();
			String codigo= casilla.toUpperCase();
			//System.out.println(codigo);
			System.out.println("Ingrese la cantidad a reabastecer: ");
			int cantidad= entrada.nextInt();
			universidad.reabastecer(codigo, cantidad);
			
			System.out.println("¿Salir del modo reabastecer?(Si - No)");
			String decision=entrada.next();
			
			if(decision.toLowerCase() == "si") {
				admin=true;
			}
			System.out.println(admin);
			break;
			}while(admin==true);
		}
		System.out.println("Ingrese el codigo del producto: ");
		String codigo= entrada.nextLine();
		universidad.despachar(codigo.toUpperCase());
		entrada.close();
	}

}
