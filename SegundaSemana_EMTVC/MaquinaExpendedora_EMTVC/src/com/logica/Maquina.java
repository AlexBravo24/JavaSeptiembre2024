package com.logica;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import com.modelo.Producto;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Maquina implements IMetodos {

	private String sucursal;
	private Map<String, Producto> productos;

	Calendar calendario = Calendar.getInstance();
	private int año = calendario.get(Calendar.YEAR);
	private int mes = calendario.get(Calendar.MONTH);
	private int dia = calendario.get(Calendar.DAY_OF_MONTH);
	private int hrs = calendario.get(Calendar.HOUR_OF_DAY);
	private int min = calendario.get(Calendar.MINUTE);
	private int seg = calendario.get(Calendar.SECOND);
	private String fecha = "" + año + mes + dia + hrs + min + seg;
	private Long folio = Long.parseLong(fecha);

	public Maquina() {
	}

	public Maquina(String sucursal, Map<String, Producto> productos) {
		this.sucursal = sucursal;
		this.productos = productos;
	}

	@Override
	public Producto consultar(String codigo) {
		Producto producto = null;
		producto = productos.get(codigo);
		return producto;
	}

	@SuppressWarnings("resource")
	@Override
	public Producto reabastecer(String codigo, int cantidad) {
		Scanner entrada = new Scanner(System.in);
		boolean x=false;
		Producto produc = null;
		//Producto producto = consultar(codigo);
		if (consultar(codigo) != null) {
			
			System.out.println("¿cambio o reabastecimiento?");
			String decision = entrada.next();
			decision.toLowerCase();
			do {
				switch (decision) {
				case "reabastecer":
					x=true;
					Producto producto = consultar(codigo);
					producto.setCantidad(cantidad);
					return producto;
					
					
				case "cambiar":
					x=true;
					//Producto producto = consultar(codigo);
					System.out.println("Ingrese Marca");
					String marca = entrada.next();
					System.out.println("Ingrese Modelo");
					String modelo = entrada.next();
					System.out.println("Ingrese sabor");
					String sabor = entrada.next();
					System.out.println("Ingrese precio");
					double precio = entrada.nextDouble();
					Producto producto1 = new Producto(marca, modelo, sabor, precio, cantidad);
					productos.replace(codigo, producto1);
					return producto1;
					//break;
				default:
					System.out.println("Solo puede elegir reabastecer o cambiar");
					//break;
				}
				System.out.println("¿cambio o reabastecimiento?");
				decision = entrada.next();
			} while (x == true);

//			Producto producto = consultar(codigo);
//			producto.setCantidad(cantidad);
		} else {

			System.out.println("Ingrese Marca");
			String marca = entrada.nextLine();
			System.out.println("Ingrese Modelo");
			String modelo = entrada.nextLine();
			System.out.println("Ingrese sabor");
			String sabor = entrada.nextLine();
			System.out.println("Ingrese precio");
			double precio = entrada.nextDouble();
			Producto producto= new Producto(marca, modelo, sabor, precio, cantidad);
			productos.put(codigo, producto);
			return producto;
		}
		
		return produc;
	}

	@Override
	public Ticket despachar(String codigo) {
		Ticket ticket= null;
		
		Producto producto = consultar(codigo);
		if ((consultar(codigo) != null)&&(producto.getCantidad()>0)) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese su dinero: ");
			System.out.print("$");
			double monto= entrada.nextDouble();
			System.out.print("Tome su cambio: $");			
			System.out.println(producto.getPrecio()- monto);
			producto.setCantidad(producto.getCantidad()-1);
			ticket= new Ticket(folio, new Date(), producto.getPrecio(), sucursal);
			System.out.println("Se imprime su ticket: ");
			System.out.println(ticket);
			entrada.close();
			return ticket;
		}else {
			System.out.println("El producto no esta disponible");
		return ticket;
		}
		
	}

}
