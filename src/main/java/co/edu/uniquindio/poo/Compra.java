package co.edu.uniquindio.poo;

public class Compra extends Transaccion {

    public Compra(int idTransaccion, String fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo, double monto) {
        super(idTransaccion, fecha, empleado, cliente, vehiculo, monto);
    }

    @Override
    public void generarRecibo() {
        System.out.println("Recibo de Compra - Vehículo: " + vehiculo.getMarca() +
                           ", Cliente: " + cliente.getNombre() + ", Monto: $" + monto);
    }
}
