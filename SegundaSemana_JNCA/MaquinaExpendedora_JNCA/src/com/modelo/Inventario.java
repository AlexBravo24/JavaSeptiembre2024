package com.modelo;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    // Map para almacenar los productos con sus c�digos y cantidades
    private Map<Integer, Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new HashMap<>();
        // Inicializar con algunos productos (c�digo, nombre, cantidad, precio)
        productos.put(1, new Producto("Doritos", 5, 17));
        productos.put(2, new Producto("Gansito", 8, 15));
        productos.put(3, new Producto("Agua", 3, 12));
        productos.put(4, new Producto("Pinguinos", 4, 20));
        
    }

  

    // M�todo para vender un producto
    public boolean venderProducto(int codigo, int cantidad) {
        Producto producto = productos.get(codigo);
        if (producto != null && producto.getCantidad() >= cantidad) {
            producto.setCantidad(producto.getCantidad() - cantidad);
            return true;
        }
        return false;
    }

    // M�todo para consultar un producto por su c�digo
    public Producto consultarProducto(int codigo) {
        return productos.get(codigo);
    }

    // M�todo para consultar todo el inventario
    public Map<Integer, Producto> consultarInventario() {
        return new HashMap<>(productos);
    }
}
