package co.edu.uniquindio.poo;

public class SUV extends Vehiculo {
    private int numPasajeros;
    private boolean traccion4x4;

    public SUV(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, int numPasajeros, boolean traccion4x4) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.numPasajeros = numPasajeros;
        this.traccion4x4 = traccion4x4;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("SUV: " + marca + " " + modelo + " - Pasajeros: " + numPasajeros + ", Tracción 4x4: " + (traccion4x4 ? "Sí" : "No"));
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public boolean isTraccion4x4() {
        return traccion4x4;
    }

    public void setTraccion4x4(boolean traccion4x4) {
        this.traccion4x4 = traccion4x4;
    }
}
