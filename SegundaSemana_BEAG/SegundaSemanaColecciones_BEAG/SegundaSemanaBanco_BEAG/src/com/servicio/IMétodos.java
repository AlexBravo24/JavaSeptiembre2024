package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IM�todos {

	// Interface de M�todos
	// Aqu� declaramos las operaciones que la clase encargada de la
	// l�gica encargada de la l�gica tendr� que resolver

	// Consultar una cuenta de banco
	// M�todo con retorno, que nos regrese datos de Cuenta
	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos de nuestra cuenta
	public Ticket despositar(int numeroCuenta, double monto);

	
}
