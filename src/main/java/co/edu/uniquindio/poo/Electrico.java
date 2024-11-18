package co.edu.uniquindio.poo;

public abstract class Electrico extends Vehiculo {
    private double capacidadBateria; // Capacidad de la batería en kWh
    private double autonomia; // Autonomía máxima en kilómetros
    private double tiempoRecarga; // Tiempo de recarga completo en horas
    private String tipoConector; // Tipo de conector (Tipo 2, CCS, CHAdeMO, etc.)
    private double potenciaMotor; // Potencia del motor en kW

    // Constructor
    public Electrico(double capacidadBateria, double autonomia, double tiempoRecarga, String tipoConector,
                    String placa, String marca, String modelo, double precio, double potenciaMotor) {
        super(placa, marca, modelo, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
        this.tiempoRecarga = tiempoRecarga;
        this.tipoConector = tipoConector;
        this.potenciaMotor = potenciaMotor;
    }

    // Getters y setters
    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getTiempoRecarga() {
        return tiempoRecarga;
    }

    public void setTiempoRecarga(double tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    // Métodos requeridos

    @Override
    public abstract void mostrarCaracteristicas();

    public double calcularAutonomia() {
        return capacidadBateria * autonomia;
    }

    public double tiempoEstimadoRecarga(double porcentaje) {
        if (porcentaje <= 0 || porcentaje > 100) {
            System.out.println("Porcentaje inválido. Debe estar entre 1 y 100.");
            return -1;
        }
        double tiempo = tiempoRecarga * (porcentaje / 100);
        System.out.println("Tiempo estimado para recargar " + porcentaje + "% de la batería: " + tiempo + " horas.");
        return tiempo;
    }

    public void mostrarEstadoBateria() {
        System.out.println("Estado actual de la batería:");
        System.out.println("Capacidad total: " + capacidadBateria + " kWh");
        System.out.println("Autonomía máxima: " + autonomia + " km");
        System.out.println("Tiempo de recarga completo: " + tiempoRecarga + " horas");
        System.out.println("Tipo de conector: " + tipoConector);
        System.out.println("Potencia del motor: " + potenciaMotor + " kW");
    }
}
