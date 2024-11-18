package co.edu.uniquindio.poo;

public class Deportivo extends CombustibleAGas {
    private int velocidadMaxima; // Velocidad máxima en km/h
    private double aceleracion; // Aceleración en segundos (de 0 a 100 km/h)
    private String tipoTransmision; // Tipo de transmisión (manual, automática, etc.)
    private double kilometraje; // Kilometraje total del deportivo
    private boolean inspeccionRealizada; // Estado de la inspección

    // Constructor
    public Deportivo(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
                        TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio,
                        int velocidadMaxima, double aceleracion, String tipoTransmision) {
        super(capacidadTanque, nivelEmisiones, potenciaMotor, rendimiento, tipoCombustible, placa, marca, modelo,
                precio);
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
        this.tipoTransmision = tipoTransmision;
        this.kilometraje = 0.0;
        this.inspeccionRealizada = false;
    }

    // Getters y setters
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
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
        System.out.println("   Características del Deportivo");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad del Tanque: " + getCapacidadTanque() + " litros");
        System.out.println("Nivel de Emisiones: " + getNivelEmisiones());
        System.out.println("Potencia del Motor: " + getPotenciaMotor() + " HP");
        System.out.println("Rendimiento: " + getRendimiento() + " km/l");
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
            System.out.println("Inspección realizada para el deportivo con placa " + getPlaca());
        } else {
            System.out.println("El deportivo con placa " + getPlaca() + " ya tiene una inspección realizada.");
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

