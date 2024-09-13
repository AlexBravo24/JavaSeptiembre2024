package com.logica;

import com.servicio.IMetodos;
import com.respuesta.Recibo;
import com.modelo.Inventario;
import com.modelo.Producto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class MaquinaExpendedora implements IMetodos {
    // Atributos
    private Inventario inventario;
    private double saldo;
    
    // Constructor
    public MaquinaExpendedora() {
        this.inventario = new Inventario();
        this.saldo = 0.0;
    }
    
    @Override
    public void seleccionarProducto(int codigo) {
        Producto producto = inventario.consultarProducto(codigo);
        if (producto != null) {
            System.out.println("Producto seleccionado: " + producto.getNombre());
            // Aquí se agrega lógica adicional para manejar la selección
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    @Override
    public void realizarPago(double monto) {
        Producto productoSeleccionado = inventario.consultarProducto(1); // Aquí se usa el producto real seleccionado
        if (productoSeleccionado != null) {
            double precio = productoSeleccionado.getPrecio();
            if (monto >= precio) {
                double cambio = monto - precio;
                saldo += precio; // Agregar el monto al saldo total de la máquina
                // Actualizar el inventario
                inventario.venderProducto(1, 1); // Suponiendo que se compra 1 unidad del producto seleccionado
                // Generar y mostrar el recibo
                Date fecha = new Date(); // Obtener la fecha y hora actuales
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String fechaFormato = formatoFecha.format(fecha);
                String nombreProducto = productoSeleccionado.getNombre();
                int cantidad = 1; 
                Recibo recibo = new Recibo(fechaFormato, nombreProducto, cantidad, precio);
                recibo.imprimirRecibo();
                // Mostrar el cambio
                System.out.println("Cambio a devolver: $" + cambio);
            } else {
                System.out.println("Monto insuficiente. Necesita al menos $" + precio);
            }
        } else {
            System.out.println("No se ha seleccionado ningún producto válido.");
        }
    }

    @Override
    public void consultarInventario() {
        // Consultar y mostrar todo el inventario
        System.out.println("Inventario:");
        for (Map.Entry<Integer, Producto> entry : inventario.consultarInventario().entrySet()) {
            Producto producto = entry.getValue();
            System.out.println("Código: " + entry.getKey() + ", Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad() + ", Precio: $" + producto.getPrecio());
        }
    }
}
