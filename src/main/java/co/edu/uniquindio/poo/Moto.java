package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private int cilindraje;
    private int velocidadMaxima;

    public Moto(String marca, String modelo, String tipoCombustible, String transmision, boolean estado, int cilindraje, int velocidadMaxima) {
        super(marca, modelo, tipoCombustible, transmision, estado);
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Moto: " + marca + " " + modelo + " - Cilindraje: " + cilindraje + "cc, Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
