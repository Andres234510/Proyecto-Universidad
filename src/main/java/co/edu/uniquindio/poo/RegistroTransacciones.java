package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class RegistroTransacciones {
    private int idActual; // Contador para generar IDs únicos
    private final List<Transaccion> transacciones; // Lista para almacenar todas las transacciones (ventas y alquileres)

    // Constructor
    public RegistroTransacciones() {
        this.idActual = 1; // Comienza en 1
        this.transacciones = new ArrayList<>();
    }

    // Genera el siguiente ID de transacción
    public int obtenerSiguienteId() {
        return idActual++; // Retorna el ID actual y luego lo incrementa
    }

    // Registra una nueva venta
    public void registrarVenta(Venta venta) {
        transacciones.add(venta);
        System.out.println("Venta registrada exitosamente. ID: " + venta.getIdTransaccion());
    }

    // Registra un nuevo alquiler
    public void registrarAlquiler(Alquiler alquiler) {
        transacciones.add(alquiler);
        System.out.println("Alquiler registrado exitosamente. ID: " + alquiler.getIdTransaccion());
    }

    // Método adicional para obtener todas las transacciones
    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    // Genera un ID único para cada transacción
    public int generarIdTransaccion() {
        return obtenerSiguienteId();
    }

    // Muestra todas las transacciones registradas
    public void mostrarTransacciones() {
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            System.out.println("Transacciones registradas:");
            for (Transaccion transaccion : transacciones) {
                transaccion.generarRecibo();
            }
        }
    }
}
