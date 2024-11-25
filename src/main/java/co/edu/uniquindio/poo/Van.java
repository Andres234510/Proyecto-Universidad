package co.edu.uniquindio.poo;

public class Van extends CombustibleAGas {
    private int capacidadPasajeros; // Número de pasajeros que puede transportar
    private double espacioCarga; // Espacio de carga en metros cúbicos
    private double kilometraje; // Kilometraje total de la Van
    private boolean inspeccionRealizada; // Estado de la inspección técnica

    // Constructor
    public Van(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
               TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio,
               int capacidadPasajeros, double espacioCarga) {
        super(capacidadTanque, nivelEmisiones, potenciaMotor, rendimiento, tipoCombustible, placa, marca, modelo,
                precio);
        this.capacidadPasajeros = capacidadPasajeros;
        this.espacioCarga = espacioCarga;
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

    public double getEspacioCarga() {
        return espacioCarga;
    }

    public void setEspacioCarga(double espacioCarga) {
        this.espacioCarga = espacioCarga;
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
        System.out.println("      Características de la Van");
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
        System.out.println("Espacio de Carga: " + espacioCarga + " m³");
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para la Van con placa " + getPlaca());
        } else {
            System.out.println("La Van con placa " + getPlaca() + " ya tiene una inspección realizada.");
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
