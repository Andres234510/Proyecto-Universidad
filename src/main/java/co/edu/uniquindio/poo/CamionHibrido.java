package co.edu.uniquindio.poo;

public class CamionHibrido extends Hibrido {
    private double capacidadCarga; // Capacidad de carga en toneladas
    private String tipoRemolque; // Tipo de remolque (plataforma, cerrado, etc.)

    // Constructor
    public CamionHibrido(double capacidadTanque, double capacidadBateria, double autonomiaTotal, double autonomiaElectrica,
                            String tipoHibrido, double rendimientoCombinado, String placa, String marca, String modelo,
                            double precio, double capacidadCarga, String tipoRemolque) {
        super(capacidadTanque, capacidadBateria, autonomiaTotal, autonomiaElectrica, tipoHibrido, rendimientoCombinado,
                placa, marca, modelo, precio);
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
        System.out.println("   Características del Camión Híbrido");
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
        System.out.println("Capacidad de Carga: " + capacidadCarga + " toneladas");
        System.out.println("Tipo de Remolque: " + tipoRemolque);
        System.out.println("=================================");
    }

    public double calcularAutonomia() {
        double autonomiaRestante = getAutonomiaTotal() - (getCapacidadCarga() * 10); // Ajuste hipotético por carga
        System.out.println("La autonomía estimada considerando la carga es de " + autonomiaRestante + " km.");
                return autonomiaRestante;
    }

    public void detallesRendimiento() {
        System.out.println("=================================");
        System.out.println("   Detalles de Rendimiento");
        System.out.println("=================================");
        System.out.println("Rendimiento Combinado: " + getRendimientoCombinado() + " km/l");
        System.out.println("Autonomía Total: " + getAutonomiaTotal() + " km");
        System.out.println("Autonomía Eléctrica: " + getAutonomiaElectrica() + " km");
        System.out.println("Consumo ajustado por carga: " + (getCapacidadCarga() * 0.5) + " l/km");
        System.out.println("=================================");
    }

    @Override
    public void modoConduccion(String modo) {
        switch (modo.toLowerCase()) {
            case "eco" -> System.out.println("Modo ECO activado. Priorizando el uso de energía eléctrica y optimización del combustible.");
            case "normal" -> System.out.println("Modo Normal activado. Balance entre rendimiento y consumo.");
            case "sport" -> System.out.println("Modo Sport activado. Máximo rendimiento y potencia disponibles.");
            default -> System.out.println("Modo de conducción no reconocido. Opciones disponibles: ECO, Normal, Sport.");
        }
    }
}

