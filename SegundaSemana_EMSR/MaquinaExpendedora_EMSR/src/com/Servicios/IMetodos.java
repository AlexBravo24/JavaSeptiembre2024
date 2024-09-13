package com.Servicios;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
    public Cuenta consultar(int numeroProducto) ;
	
	// Retirar recursos de nuestra cuenta
	public Ticket retirar (int numeroProducto, double monto);
	
	// Depositar recursos en nuestra cuenta
	
	public Ticket depositar (int numeroProducto, double monto);

}
