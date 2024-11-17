package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int caballosFuerza;
    private double tiempoCienKm;

    public Deportivo(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, int caballosFuerza, double tiempoCienKm) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKm = tiempoCienKm;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Deportivo: " + marca + " " + modelo + " - HP: " + caballosFuerza + ", 0-100 km/h en: " + tiempoCienKm + " segundos");
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public double getTiempoCienKm() {
        return tiempoCienKm;
    }

    public void setTiempoCienKm(double tiempoCienKm) {
        this.tiempoCienKm = tiempoCienKm;
    }
}
