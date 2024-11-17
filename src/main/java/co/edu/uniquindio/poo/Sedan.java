package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private int capacidadMaletero;

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public Sedan(String marca, String modelo, String tipoCombustible, String transmision, boolean estado,
                    int numPasajeros, int numPuertas, int capacidadMaletero) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Sedan: " + marca + " " + modelo + " - Pasajeros: " + numPasajeros +
                           ", Puertas: " + numPuertas + ", Maletero: " + capacidadMaletero + "L");
    }
}
