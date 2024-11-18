package co.edu.uniquindio.poo;

public class SUV extends CombustibleAGas {
    private int capacidadPasajeros; // Número máximo de pasajeros
    private String traccion; // Tipo de tracción (4x4, delantera, trasera, etc.)
    private double capacidadCarga; // Capacidad de carga en kilogramos
    private double kilometraje; // Kilometraje total del SUV
    private boolean inspeccionRealizada; // Estado de la inspección técnica

    // Constructor
    public SUV(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
                TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio,
                int capacidadPasajeros, String traccion, double capacidadCarga) {
        super(capacidadTanque, nivelEmisiones, potenciaMotor, rendimiento, tipoCombustible, placa, marca, modelo,
                precio);
        this.capacidadPasajeros = capacidadPasajeros;
        this.traccion = traccion;
        this.capacidadCarga = capacidadCarga;
        this.kilometraje = 0.0;
        this.inspeccionRealizada = false;
    }

    // Getters y setters
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
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
        System.out.println("   Características del SUV");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad del Tanque: " + getCapacidadTanque() + " litros");
        System.out.println("Nivel de Emisiones: " + getNivelEmisiones());
        System.out.println("Potencia del Motor: " + getPotenciaMotor() + " HP");
        System.out.println("Rendimiento: " + getRendimiento() + " km/l");
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
        System.out.println("Tipo de Tracción: " + traccion);
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para el SUV con placa " + getPlaca());
        } else {
            System.out.println("El SUV con placa " + getPlaca() + " ya tiene una inspección realizada.");
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
