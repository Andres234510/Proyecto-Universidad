package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Usuario {
    private int idEmpleado;
    private String rol;
    private List<Transaccion> transacciones;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Empleado(String nombre, String apellido, String nombreUsuario, String clave, int idEmpleado, String rol) {
        super(nombre, apellido, nombreUsuario, clave);
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.transacciones = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNombre() + " registrado por el empleado " + nombre);
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        System.out.println("Vehículo " + vehiculo.getMarca() + " registrado en el sistema por el empleado " + nombre);
    }

    public void realizarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
        System.out.println("Transacción realizada: " + transaccion.toString());
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " " + apellido + " - Rol: " + rol);
    }
}
