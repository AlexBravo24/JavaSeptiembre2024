package com.maquina;
import java.util.Scanner;

import com.Inventario.*;
import com.producto.*;
public class Maquina 
{
	Inventario inventario = new Inventario();
	public Maquina()
	{
		
	}
	public void Comprar()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("ingresa el dinero");
		int dinero = input.nextInt();
		System.out.println("ingresa el codigo de producto");
		int codigo = input.nextInt();
		if(inventario.VerificarInventario(codigo))
		{
			if(dinero >= inventario.inventario.get(codigo).precio)
			{
				inventario.RemoverInventario(codigo);
				System.out.println("Toma Tu producto = "  + inventario.inventario.get(codigo).producto);
			}
			if(dinero < inventario.inventario.get(codigo).precio)
			{
				System.out.println("Dinero Insuficiente");
			}
		}		
	}
	public void AgregarProducto()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa El nombre del producto");
		String _nombre = input.next();
		System.out.println("Ingresa el codigo");
		int _codigo = input.nextInt();
		System.out.println("Ingresa el precio");
		int _precio = input.nextInt();
		Producto _producto = new Producto(_nombre, _precio);
		inventario.AgregarInventario(_codigo, _producto,1);
	}
	public void MostrarProducto()
	{
		inventario.toString();
	}
}
