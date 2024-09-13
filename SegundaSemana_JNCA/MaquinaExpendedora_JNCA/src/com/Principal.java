package com;

import com.logica.MaquinaExpendedora;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("---- Menú de Máquina Expendedora ----");
            System.out.println("1. Consultar Inventario");
            System.out.println("2. Seleccionar Producto");
            System.out.println("3. Realizar Pago");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Consultar inventario
                    maquina.consultarInventario();
                    break;

                case 2:
                    // Seleccionar producto
                    System.out.print("Ingrese el código del producto: ");
                    int codigo = scanner.nextInt();
                    maquina.seleccionarProducto(codigo);
                    break;

                case 3:
                    // Realizar pago
                    System.out.print("Ingrese el monto del pago: ");
                    double monto = scanner.nextDouble();
                    maquina.realizarPago(monto);
                    break;

                case 4:
                    // Salir
                    continuar = false;
                    System.out.println("Gracias por usar la máquina expendedora. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                    break;
            }
        }
        
        scanner.close();
    }
}

