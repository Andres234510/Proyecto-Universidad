package co.edu.uniquindio.poo;

public class DeportivoElectrico extends Electrico {
    private double velocidadMaxima; // Velocidad máxima en km/h
    private double aceleracion; // Tiempo de aceleración de 0 a 100 km/h en segundos
    private String tipoTransmision; // Tipo de transmisión (automática, manual, etc.)
    private double kilometraje; // Kilometraje total del deportivo eléctrico
    private boolean inspeccionRealizada; // Estado de la inspección técnica

    // Constructor
    public DeportivoElectrico(double capacidadBateria, double autonomia, double tiempoRecarga, String tipoConector,
                              String placa, String marca, String modelo, double precio, double potenciaMotor,
                              double velocidadMaxima, double aceleracion, String tipoTransmision) {
        super(capacidadBateria, autonomia, tiempoRecarga, tipoConector, placa, marca, modelo, precio, potenciaMotor);
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
        this.tipoTransmision = tipoTransmision;
        this.kilometraje = 0.0;
        this.inspeccionRealizada = false;
    }

    // Getters y setters
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isInspeccionRealizada() {
        return inspeccionRealizada;
    }

    public void setInspeccionRealizada(boolean inspeccionRealizada) {
        this.inspeccionRealizada = inspeccionRealizada;
    }

    // Métodos requeridos

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("   Características del Deportivo Eléctrico");
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
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Aceleración (0-100 km/h): " + aceleracion + " segundos");
        System.out.println("Tipo de Transmisión: " + tipoTransmision);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para el Deportivo Eléctrico con placa " + getPlaca());
        } else {
            System.out.println("El Deportivo Eléctrico con placa " + getPlaca() + " ya tiene una inspección realizada.");
        }
    }

    public void registrarKilometraje(double kilometros) {
        if (kilometros > 0) {
            kilometraje += kilometros;
            System.out.println("Se ha registrado un recorrido de " + kilometros + " kilómetros. Kilometraje total: " + kilometraje);
        } else {
            System.out.println("El kilometraje ingresado no es válido.");
        }
    }

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
