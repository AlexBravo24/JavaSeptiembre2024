package com.logica;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import com.modelo.Producto;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
//en el paquete com.logica se encuentra la clase que realiza las operaciones
	//se declaran atributops cahjeros
	private Map<Integer, Producto> productos;
	//declarar una variable auxiliar para incrementar folio en ticket
	private int folio=1;
	public Cajero() {}
	
	public Cajero(Map<Integer, Producto> productos) {
		super();
		this.productos = productos;
		
	}

	@Override
	public Producto consultar(int codigoProducto) {
		//se requiere crear un producto vacio inicial
		Producto producto = null;
		producto = productos.get(codigoProducto);
		return producto;
	}

	@Override
	public Ticket venta(int codigoProducto, int saldo, int cantidad) {
		Ticket ticket = null;
		//se busca el producto
		
		if (consultar(codigoProducto) !=null) {
			 Producto producto = consultar(codigoProducto);
			//ya estamos trabajando con un producto
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa monedas: ");
			saldo = entrada.nextInt();
			System.out.println(cantidad);
			
			if(saldo<producto.getCosto()) {
				
				System.out.println("El saldo es insuficiente");
				return ticket;
			}
			
				
				
			
			else {
				producto.setCantidad((producto.getCantidad())-1);
				int cambio = (saldo-producto.getCosto());
				ticket = new Ticket(folio++, new Date(), cambio, "maquina 1");
			return ticket;
			}
				
				
			
			}
					
			
					

			
			
		
			
		
		return ticket;
		
	}

	private int Integer(int cantidad) {
		// TODO Auto-generated method stub
		return cantidad;
	}
	

}
