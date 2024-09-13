package com;

import com.logica.MaquinaExpendedora;
import com.modelo.Producto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Crear: inventario de productos
		Map<String, Producto> inventario = new HashMap<>();
		inventario.put("A1", new Producto("A1", "Galletas", 20.50, 10));
		inventario.put("B1", new Producto("B1", "Refresco", 18.00, 5));
		inventario.put("C1", new Producto("C1", "Chocolate", 14.50, 2));

		// Crear: máquina expendedora con el inventario
		 MaquinaExpendedora maquina = new MaquinaExpendedora(inventario);

		// Escanear código del producto
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido - Máquina Expendedora");
		System.out.print("Ingresa el código del producto: ");
		String codigoProducto = scanner.nextLine();

		maquina.procesarCompra(codigoProducto);
	}
}