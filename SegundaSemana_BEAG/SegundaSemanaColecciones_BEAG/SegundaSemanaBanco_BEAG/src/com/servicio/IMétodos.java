package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMétodos {

	// Interface de Métodos
	// Aquí declaramos las operaciones que la clase encargada de la
	// lógica encargada de la lógica tendrá que resolver

	// Consultar una cuenta de banco
	// Método con retorno, que nos regrese datos de Cuenta
	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos de nuestra cuenta
	public Ticket despositar(int numeroCuenta, double monto);

	
}
