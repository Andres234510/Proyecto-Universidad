package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private boolean frenosAire;
    private int numEjes;

    public Camion(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, double capacidadCarga, boolean frenosAire, int numEjes) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.capacidadCarga = capacidadCarga;
        this.frenosAire = frenosAire;
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Camion: " + marca + " " + modelo + " - Capacidad de Carga: " + capacidadCarga + " kg, Ejes: " + numEjes + ", Frenos de Aire: " + (frenosAire ? "Sí" : "No"));
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
