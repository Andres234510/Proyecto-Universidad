package co.edu.uniquindio.poo;

public class Venta extends Transaccion {

    public Venta(int idTransaccion, String fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo, double monto) {
        super(idTransaccion, fecha, empleado, cliente, vehiculo, monto);
    }

    @Override
    public void generarRecibo() {
        System.out.println("Recibo de Venta - Vehículo: " + vehiculo.getMarca() +
                            ", Cliente: " + cliente.getNombre() + ", Monto: $" + monto);
    }
}
