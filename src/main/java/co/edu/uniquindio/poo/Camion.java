package co.edu.uniquindio.poo;

public class Camion extends Hibrido {

    public Camion(String placa, String marca, String modelo, double precio, double capacidadTanque, double autonomiaBateria) {
        super(placa, marca, modelo, precio, capacidadTanque, autonomiaBateria);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Camión Híbrido: " + getMarca() + " - Modelo: " + getModelo() + " - Capacidad del Tanque: " + getCapacidadTanque() + " - Autonomía: " + getAutonomiaBateria());
    }
}