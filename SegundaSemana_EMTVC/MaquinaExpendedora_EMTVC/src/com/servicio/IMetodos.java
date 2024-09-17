package com.servicio;

import com.modelo.Producto;
import com.respuesta.Ticket;

public interface IMetodos {

	public Producto consultar(String codigo);
	public Producto reabastecer (String codigo, int cantidad);
	public Ticket despachar(String codigo);
}
