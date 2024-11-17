package co.edu.uniquindio.poo;

public class Van extends Vehiculo {
    private int numPasajeros;
    private int capacidadMaletero;

    public Van(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, int numPasajeros, int capacidadMaletero) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.numPasajeros = numPasajeros;
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Van: " + marca + " " + modelo + " - Pasajeros: " + numPasajeros + ", Capacidad Maletero: " + capacidadMaletero + "L");
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}
