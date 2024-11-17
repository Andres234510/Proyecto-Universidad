package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String tipoCombustible;
    protected String transmision;
    protected boolean estado; // nuevo o usado

    public Vehiculo(String marca, String modelo, String tipoCombustible, String transmision, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void mostrarCaracteristicas();
}
