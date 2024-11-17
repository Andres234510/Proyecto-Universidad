package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private double capacidadCajaCarga;
    private boolean traccion4x4;

    public PickUp(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, double capacidadCajaCarga, boolean traccion4x4) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.capacidadCajaCarga = capacidadCajaCarga;
        this.traccion4x4 = traccion4x4;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Pick-Up: " + marca + " " + modelo + " - Capacidad de Carga: " + capacidadCajaCarga + " kg, Tracción 4x4: " + (traccion4x4 ? "Sí" : "No"));
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public void setTraccion4x4(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }
}
