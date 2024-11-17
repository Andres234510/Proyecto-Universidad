package co.edu.uniquindio.poo;

import java.util.List;

public class Reporte {
    private String fechaInicio;
    private String fechaFin;
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    private List<Transaccion> transacciones;

    public Reporte(String fechaInicio, String fechaFin, List<Transaccion> transacciones) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.transacciones = transacciones;
    }

    public void generarReportePorPeriodo() {
        System.out.println("Reporte de transacciones desde " + fechaInicio + " hasta " + fechaFin);
        for (Transaccion t : transacciones) {
            t.generarRecibo();
        }
    }
}

