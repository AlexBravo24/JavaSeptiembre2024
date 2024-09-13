package com.respuesta;

public class Recibo {
    private String fecha;
    private String producto;
    private int cantidad;
    private double total;
    
    // Constructor
    public Recibo(String fecha, String producto, int cantidad, double total) {
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }
    
    // Métodos getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // Método para imprimir el recibo
    public void imprimirRecibo() {
        System.out.println("Recibo:");
        System.out.println("Fecha y Hora: " + fecha);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + total);
    }
}
