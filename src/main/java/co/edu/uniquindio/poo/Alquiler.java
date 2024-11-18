package co.edu.uniquindio.poo;

public class Alquiler extends Transaccion {
    private String fechaInicioAlquiler;
    private String fechaFinAlquiler;

    public Alquiler(int idTransaccion, String fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo, double monto, String fechaInicioAlquiler, String fechaFinAlquiler) {
        super(idTransaccion, fecha, empleado, cliente, vehiculo, monto);
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    @Override
    public void generarRecibo() {
        System.out.println("Recibo de Alquiler - Vehículo: " + vehiculo.getMarca() +
                            ", Cliente: " + cliente.getNombre() + ", Período: " + fechaInicioAlquiler + " a " + fechaFinAlquiler + ", Monto: $" + monto);
    }

    public String getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(String fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public String getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    public void setFechaFinAlquiler(String fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    public String getIdTransaccion() {
        return String.valueOf(idTransaccion);
    }
}

