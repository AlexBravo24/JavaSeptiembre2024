package com.logica;

import java.util.Date;
import java.util.Map;

import com.Servicios.IMetodos;
import com.modelo.Cuenta;
import com.respuesta.Ticket;

public class MaquinaExpendedora implements IMetodos {

	private String sucursal;
	private double cambio;
	private Map<Integer,Cuenta> cuentas;
	
	private int folio=1;
	
	public MaquinaExpendedora() {
		
	}

	
	
	
	public MaquinaExpendedora(String sucursal,  Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}




	@Override
	public Cuenta consultar(int numeroProducto) {
		Cuenta cuenta = null;
		
		
		cuenta= cuentas.get(numeroProducto);
		
		return cuenta;
		
	}

	@Override
	public Ticket retirar(int numeroProducto, double monto) {
		Ticket ticket= null;
		
		if (consultar(numeroProducto) !=null) {
			Cuenta cuenta =consultar(numeroProducto);
			
			//validaciones
			if(monto==cuenta.getCosto()) {
				System.out.println("El monto es suficiente para comprar el producto ");
				cambio=0;
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				
				return ticket;
				
			}else if (cuenta.getSaldo()+ monto>cuenta.getCosto()) {
				System.out.println("El monto supera el costo del producto");
				
				cambio = (cuenta.getSaldo()+ monto)-cuenta.getCosto();
				
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				return ticket;
			}else {
				
				System.out.println("Monto insuficiente para poder comprar el producto");
				
				return ticket;
				
			}
				
		}else  {
		System.out.println("No hay un numero asociado a ese Producto");
		return ticket;
	}
	
	}

	@Override
	public Ticket depositar(int numeroProducto, double monto) {
		Ticket ticket =null;
		
		if (consultar(numeroProducto) !=null) {
			Cuenta cuenta =consultar(numeroProducto);
			
			//validaciones
			if(monto==cuenta.getCosto()) {
				System.out.println("El monto es suficiente para comprar el producto ");
				cambio=0;
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				
				return ticket;
				
			}else if (cuenta.getSaldo()+ monto==cuenta.getCosto()) {
				System.out.println("El monto es suficiente para comprar el producto");
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				cambio=0;
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				return ticket;
				
				
			}else if (cuenta.getSaldo()+ monto<cuenta.getCosto()) {
				System.out.println("El monto es insuficiente para comprar el producto");
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				return ticket;
				
			}else if (cuenta.getSaldo()+ monto>cuenta.getCosto()) {
				System.out.println("El monto supera el costo del producto");
				
				cambio = (cuenta.getSaldo()+ monto)-cuenta.getCosto();
				
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				
				
				ticket = new Ticket(folio++, new Date(), cuenta.getProducto(), cuenta.getCosto(), sucursal, 1, cambio);
				
				return ticket;
				
			}
				
			}else {
				System.out.println("No hay un numero asociado a ese Producto");
				return ticket;
	}
	
  }
	
	
}
