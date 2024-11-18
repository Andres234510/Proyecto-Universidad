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

    public String getIdTransaccion() {
        return String.valueOf(idTransaccion); // Convierte y retorna el ID de la transacción como String
    }

    public Cliente getCliente() {
        return cliente; // Retorna el cliente asociado a la venta
    }

    public Empleado getEmpleado() {
        return empleado; // Retorna el empleado asociado a la venta
    }

    public Vehiculo getVehiculo() {
        return vehiculo; // Retorna el vehículo involucrado en la venta
    }

    public String getPrecio() {
        return String.format("$%.2f", monto); // Retorna el monto de la venta en formato de precio
    }

}
