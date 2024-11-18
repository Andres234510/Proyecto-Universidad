package co.edu.uniquindio.poo;

public class Sedan extends CombustibleAGas {
    private int numeroPuertas; // Número de puertas del sedán
    private int numPasajeros; // Número de pasajeros que puede llevar
    private double capacidadMaletero; // Capacidad del maletero en litros
    private boolean tieneAirbags; // Indica si tiene airbags
    private double kilometraje; // Kilometraje total del sedán
    private boolean inspeccionRealizada; // Estado de la inspección

    public Sedan(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
            TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio,
            int numeroPuertas, int numPasajeros, double capacidadMaletero, boolean tieneAirbags) {
        super(capacidadTanque, nivelEmisiones, potenciaMotor, rendimiento, tipoCombustible, placa, marca, modelo,
                precio);
        this.numeroPuertas = numeroPuertas;
        this.numPasajeros = numPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAirbags = tieneAirbags;
        this.kilometraje = 0.0;
        this.inspeccionRealizada = false;
    }

    // Getters y setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

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

    public boolean isTieneAirbags() {
        return tieneAirbags;
    }

    public void setTieneAirbags(boolean tieneAirbags) {
        this.tieneAirbags = tieneAirbags;
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

    // Métodos requeridos:

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("       Características del Sedán");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad del Tanque: " + getCapacidadTanque() + " litros");
        System.out.println("Nivel de Emisiones: " + getNivelEmisiones());
        System.out.println("Potencia del Motor: " + getPotenciaMotor() + " HP");
        System.out.println("Rendimiento: " + getRendimiento() + " km/l");
        System.out.println("Número de Puertas: " + numeroPuertas);
        System.out.println("Número de Pasajeros: " + numPasajeros);
        System.out.println("Capacidad del Maletero: " + capacidadMaletero + " litros");
        System.out.println("¿Tiene Airbags?: " + (tieneAirbags ? "Sí" : "No"));
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para el sedán con placa " + getPlaca());
        } else {
            System.out.println("El sedán con placa " + getPlaca() + " ya tiene una inspección realizada.");
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
