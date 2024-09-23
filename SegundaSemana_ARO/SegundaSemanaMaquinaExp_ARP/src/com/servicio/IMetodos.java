package com.servicio;

import com.modelo.Producto;
import com.respuesta.Ticket;

public interface IMetodos {
	//se declaran las operaciones
	//que la clase encargada de la logica realizara
	
	//consultar un prpducto
	public Producto consultar(int codigoProducto);
	
	//realizar venta
	public Ticket venta(int codigoProducto, int saldo, int cantidad);

	
	
	

}
