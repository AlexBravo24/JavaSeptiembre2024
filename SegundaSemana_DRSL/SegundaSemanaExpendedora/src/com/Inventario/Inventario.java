package com.Inventario;

import java.util.HashMap;
import java.util.Map;

import com.producto.Producto;

public class Inventario 
{
	public Map<Integer,Producto> inventario = new HashMap();
	public Map<Integer,Integer> cantidad = new HashMap();;
	
	public boolean VerificarInventario(Integer codigo)
	{
		if(inventario.get(codigo)!= null)
		{
			if(cantidad.get(codigo) > 0)
			{
				System.out.println("Producto = " + inventario.get(codigo).producto);
				System.out.println("Cantidad de Producto Encontrado  = " + cantidad.get(codigo));
				return true;
			}
			else
			{
				System.out.println("No hay inventario :( ");
				return false;
			}
		}	
		else
		{
			System.out.println("No existe producto");
			return false;
		}
	}
	public void AgregarInventario(Integer codigo, Producto _producto, int _cantidad)
	{		
		if(VerificarInventario(codigo) == false)// no existe el producto
		{
			inventario.put(codigo, _producto);
			cantidad.put(codigo, _cantidad);
			System.out.println("Inventario Actual = "  + cantidad.get(codigo));
		}
		else if(VerificarInventario(codigo))// existe el producto 
		{
			if(inventario.get(codigo).producto.equals(_producto.getProducto()))// verifico que el codigo coicida con el producto
			{		
				System.out.println("Inventario Anterior = "  + cantidad.get(codigo));
				cantidad.put(codigo, _cantidad+ cantidad.get(codigo));
				System.out.println("Inventario Actual = "  + cantidad.get(codigo));
			}
		}	
	}
	
	public void RemoverInventario(Integer codigo)
	{	
		if(VerificarInventario(codigo))
		{
			System.out.println("Inventario Anterior = "  + cantidad.get(codigo));
			cantidad.put(codigo,cantidad.get(codigo)-1);
			System.out.println("Inventario Actual = "  + cantidad.get(codigo));
		}
	}
	@Override
	public String toString() {
		return "Inventario [inventario=" + inventario + ", cantidad=" + cantidad + "]";
	}
	
}
