package com.logica;

import com.modelo.Producto;
import com.respuesta.RespuestaPantalla;
import com.servicio.IMetodo;

import java.util.Map;
import java.util.Scanner;

public class MaquinaExpendedora implements IMetodo {

    private Map<String, Producto> inventario;
    private RespuestaPantalla pantalla;

    // Constructor que recibe el inventario
    public MaquinaExpendedora(Map<String, Producto> inventario) {
        this.inventario = inventario;
        this.pantalla = new RespuestaPantalla();
    }

    @Override
    public void procesarCompra(String codigoProducto) {
        if (!inventario.containsKey(codigoProducto)) {
            System.out.println("Producto no encontrado.");
            return;
        }

        Producto producto = inventario.get(codigoProducto);

        if (producto.getCantidad() == 0) {
            System.out.println("Producto agotado.");
            return;
        }

        double montoIngresado = solicitarDinero(producto.getPrecio());
        if (montoIngresado >= producto.getPrecio()) {
            System.out.println("Despachando " + producto.getNombre() + ". Cambio: $" + (montoIngresado - producto.getPrecio()));
            producto.disminuirCantidad();
        } else {
            System.out.println("Monto insuficiente. Faltan $" + (producto.getPrecio() - montoIngresado));
        }
    }

    private double solicitarDinero(double precio) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("El precio del producto es $" + precio + ". Ingrese el dinero: ");
        return scanner.nextDouble();
    }
}