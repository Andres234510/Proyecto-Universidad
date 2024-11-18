package co.edu.uniquindio.poo;

public class SedanElectrico extends Electrico {
    private int numPasajeros; // Número de pasajeros
    private double capacidadMaletero; // Capacidad del maletero en litros
    private boolean airbags; // Indica si el sedán tiene airbags

    // Constructor
    public SedanElectrico(double capacidadBateria, double autonomia, double tiempoRecarga, String tipoConector, 
                          String placa, String marca, String modelo, double precio, double potenciaMotor, 
                          int numPasajeros, double capacidadMaletero, boolean airbags) {
        super(capacidadBateria, autonomia, tiempoRecarga, tipoConector, placa, marca, modelo, precio, potenciaMotor);
        this.numPasajeros = numPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
    }

    // Getters y setters
    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAirbags() {
        return airbags;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    // Métodos requeridos

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("   Características del Sedán Eléctrico");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad de Batería: " + getCapacidadBateria() + " kWh");
        System.out.println("Autonomía: " + getAutonomia() + " km");
        System.out.println("Tiempo de Recarga: " + getTiempoRecarga() + " horas");
        System.out.println("Tipo de Conector: " + getTipoConector());
        System.out.println("Potencia del Motor: " + getPotenciaMotor() + " kW");
        System.out.println("Número de Pasajeros: " + numPasajeros);
        System.out.println("Capacidad del Maletero: " + capacidadMaletero + " litros");
        System.out.println("¿Tiene Airbags?: " + (airbags ? "Sí" : "No"));
        System.out.println("=================================");
    }

    @Override
    public double calcularAutonomia() {
        double autonomiaCalculada = getCapacidadBateria() * getAutonomia();
        System.out.println("Autonomía estimada: " + autonomiaCalculada + " km");
        return autonomiaCalculada;
    }

    @Override
    public double tiempoEstimadoRecarga(double porcentaje) {
        if (porcentaje <= 0 || porcentaje > 100) {
            System.out.println("Porcentaje inválido. Debe estar entre 1 y 100.");
            return -1;
        }
        double tiempo = getTiempoRecarga() * (porcentaje / 100);
        System.out.println("Tiempo estimado para recargar " + porcentaje + "% de la batería: " + tiempo + " horas.");
        return tiempo;
    }

    @Override
    public void mostrarEstadoBateria() {
        System.out.println("Estado actual de la batería:");
        System.out.println("Capacidad total: " + getCapacidadBateria() + " kWh");
        System.out.println("Autonomía máxima: " + getAutonomia() + " km");
        System.out.println("Tiempo de recarga completo: " + getTiempoRecarga() + " horas");
        System.out.println("Tipo de conector: " + getTipoConector());
        System.out.println("Potencia del motor: " + getPotenciaMotor() + " kW");
    }

    @Override
    public void registrarKilometraje(double kilometros) {
        if (kilometros > 0) {
            double kilometraje = kilometros;
            System.out.println("Se ha registrado un recorrido de " + kilometros + " kilómetros. Kilometraje total: " + kilometraje);
        } else {
            System.out.println("El kilometraje ingresado no es válido.");
        }
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = (getPrecio() * porcentaje) / 100;
            setPrecio(getPrecio() - descuento);
            System.out.println("Se ha aplicado un descuento del " + porcentaje + "%. Precio actualizado: $" + getPrecio());
        } else {
            System.out.println("Porcentaje de descuento inválido.");
        }
    }
}
