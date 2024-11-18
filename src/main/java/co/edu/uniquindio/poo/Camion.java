package co.edu.uniquindio.poo;

public class Camion extends CombustibleAGas {
    private double capacidadCarga; // Capacidad de carga en toneladas
    private String tipoRemolque; // Tipo de remolque (Plano, Cisterna, Caja cerrada, etc.)

    // Constructor
    public Camion(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
            TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio,
            double capacidadCarga, String tipoRemolque) {
        super(capacidadTanque, nivelEmisiones, potenciaMotor, rendimiento, tipoCombustible, placa, marca, modelo,
                precio);
        this.capacidadCarga = capacidadCarga;
        this.tipoRemolque = tipoRemolque;
    }

    // Getters y setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoRemolque() {
        return tipoRemolque;
    }

    public void setTipoRemolque(String tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }

    // Métodos requeridos
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("   Características del Camión");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
        System.out.println("Tipo de Remolque: " + tipoRemolque);
        System.out.println("=================================");
    }

    public double calcularAutonomia(double rendimiento, double capacidadTanque) {
        if (rendimiento <= 0 || capacidadTanque <= 0) {
            System.out.println("Datos de rendimiento o capacidad del tanque inválidos.");
            return -1;
        }
        double autonomia = rendimiento * capacidadTanque;
        System.out.println("Autonomía estimada: " + autonomia + " km");
        return autonomia;
    }

    public String detallesRendimiento(double rendimiento) {
        return "Rendimiento del camión: " + rendimiento + " km/l";
    }

    public void modoConduccion(String modo) {
        switch (modo.toLowerCase()) {
            case "eco" -> System.out.println("Modo de conducción: ECO. Máxima eficiencia activada.");
            case "carga" -> System.out.println("Modo de conducción: CARGA. Potencia optimizada para transportar cargas pesadas.");
            case "normal" -> System.out.println("Modo de conducción: NORMAL. Balance entre eficiencia y potencia.");
            default -> System.out.println("Modo de conducción no reconocido.");
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
