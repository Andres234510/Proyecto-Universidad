package co.edu.uniquindio.poo;

public abstract class Transaccion {
    protected int idTransaccion;
    protected static String fecha;
    protected Empleado empleado;
    protected Cliente cliente;
    protected Vehiculo vehiculo;
    protected static double monto;

    public Transaccion(int idTransaccion, String fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo, double monto) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.monto = monto;
    }

    public abstract void generarRecibo();
}

