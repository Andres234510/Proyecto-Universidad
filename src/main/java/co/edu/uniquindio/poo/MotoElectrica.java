package co.edu.uniquindio.poo;

public class MotoElectrica extends Electrico {
    private int capacidadPasajeros; // Número de pasajeros que puede transportar
    private double espacioCarga; // Espacio de carga en litros
    private double kilometraje; // Kilometraje total de la moto
    private boolean inspeccionRealizada; // Estado de la inspección técnica

    // Constructor
    public MotoElectrica(double capacidadBateria, double autonomia, double tiempoRecarga, String tipoConector, String placa,
                String marca, String modelo, double precio, double potenciaMotor, int capacidadPasajeros, double espacioCarga) {
        super(capacidadBateria, autonomia, tiempoRecarga, tipoConector, placa, marca, modelo, precio, potenciaMotor);
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
        System.out.println("   Características de la Moto Eléctrica");
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
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
        System.out.println("Espacio de Carga: " + espacioCarga + " litros");
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para la Moto Eléctrica con placa " + getPlaca());
        } else {
            System.out.println("La Moto Eléctrica con placa " + getPlaca() + " ya tiene una inspección realizada.");
        }
    }

    @Override
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
