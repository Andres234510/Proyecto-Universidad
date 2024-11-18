package co.edu.uniquindio.poo;

public abstract class Hibrido extends Vehiculo {
    private double capacidadTanque;
    private double autonomiaBateria;

    public Hibrido(String placa, String marca, String modelo, double precio, double capacidadTanque, double autonomiaBateria) {
        super(placa, marca, modelo, precio);
        this.capacidadTanque = capacidadTanque;
        this.autonomiaBateria = autonomiaBateria;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(double autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
}
