package co.edu.uniquindio.poo;

public class Bus extends Vehiculo {
    private int numPasajeros;
    private int numEjes;

    public Bus(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, int numPasajeros, int numEjes) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.numPasajeros = numPasajeros;
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Bus: " + marca + " " + modelo + " - Pasajeros: " + numPasajeros + ", Ejes: " + numEjes);
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
