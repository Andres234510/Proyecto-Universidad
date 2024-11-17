package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class RegistroTransacciones {
    private List<Transaccion> transacciones;

    public RegistroTransacciones() {
        this.transacciones = new ArrayList<>();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    public void mostrarTransacciones() {
        for (Transaccion t : transacciones) {
            t.generarRecibo();
        }
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
