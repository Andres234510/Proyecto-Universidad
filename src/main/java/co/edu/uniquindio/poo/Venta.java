package co.edu.uniquindio.poo;

public class Venta extends Transaccion {

    public Venta(Cliente cliente, Empleado empleado, Vehiculo vehiculo, int idTransaccion) {
        super(idTransaccion, fecha, empleado, cliente, vehiculo, monto);
    }

    @Override
    public void generarRecibo() {
        System.out.println("Recibo de Venta - Vehículo: " + vehiculo.getMarca() +
                            ", Cliente: " + cliente.getNombre() + ", Monto: $" + monto);
    }

    public Administrador getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }

    public Administrador getEmpleado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmpleado'");
    }

    public Vehiculo getVehiculo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVehiculo'");
    }

    public String getPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }

    public String getIdTransaccion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdTransaccion'");
    }
}
