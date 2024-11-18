package co.edu.uniquindio.poo;

public class SedanHibrido extends Hibrido {
    private int numPasajeros; // Número de pasajeros que puede transportar
    private double capacidadMaletero; // Capacidad del maletero en litros
    private int airbags; // Número de airbags

    private double nivelBateria; // Nivel actual de la batería en porcentaje (0-100)

    // Constructor
    public SedanHibrido(double capacidadTanque, double capacidadBateria, double autonomiaTotal, double autonomiaElectrica,
                        String tipoHibrido, double rendimientoCombinado, String placa, String marca, String modelo,
                        double precio, int numPasajeros, double capacidadMaletero, int airbags) {
        super(capacidadTanque, capacidadBateria, autonomiaTotal, autonomiaElectrica, tipoHibrido, rendimientoCombinado,
                placa, marca, modelo, precio);
        this.numPasajeros = numPasajeros;
        this.capacidadMaletero = capacidadMaletero;
        this.airbags = airbags;
        this.nivelBateria = 100.0; // Inicialmente la batería está al 100%
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

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = Math.max(0, Math.min(100, nivelBateria)); // Limitar entre 0 y 100
    }

    // Métodos requeridos
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("   Características del Sedán Híbrido");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad del Tanque: " + getCapacidadTanque() + " litros");
        System.out.println("Capacidad de la Batería: " + getCapacidadBateria() + " kWh");
        System.out.println("Autonomía Total: " + getAutonomiaTotal() + " km");
        System.out.println("Autonomía Eléctrica: " + getAutonomiaElectrica() + " km");
        System.out.println("Tipo Híbrido: " + getTipoHibrido());
        System.out.println("Rendimiento Combinado: " + getRendimientoCombinado() + " km/l");
        System.out.println("Número de Pasajeros: " + numPasajeros);
        System.out.println("Capacidad del Maletero: " + capacidadMaletero + " litros");
        System.out.println("Número de Airbags: " + airbags);
        System.out.println("Nivel de Batería: " + nivelBateria + "%");
        System.out.println("=================================");
    }

    public double calcularAutonomia() {
        double autonomia = (nivelBateria / 100) * getAutonomiaElectrica() + getCapacidadTanque() * getRendimientoCombinado();
        System.out.println("La autonomía estimada es de: " + autonomia + " km");
        return autonomia;
    }

    public double tiempoEstimadoRecarga(double porcentaje) {
        if (porcentaje <= 0 || porcentaje > 100) {
            System.out.println("Porcentaje ingresado no válido. Debe estar entre 1 y 100.");
            return -1;
        }
        double capacidadRecarga = (porcentaje / 100) * getCapacidadBateria();
        double tiempo = capacidadRecarga / 22; // Suponiendo una potencia de carga de 22 kW
        System.out.println("Tiempo estimado para recargar " + porcentaje + "% de la batería: " + tiempo + " horas");
        return tiempo;
    }

    public void mostrarEstadoBateria() {
        System.out.println("El nivel actual de la batería es: " + nivelBateria + "%");
        if (nivelBateria < 20) {
            System.out.println("Advertencia: La batería está por debajo del 20%. Recarga recomendada.");
        }
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

