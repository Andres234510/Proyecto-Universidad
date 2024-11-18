package co.edu.uniquindio.poo;

public abstract class Hibrido extends Vehiculo {
    private double capacidadTanque; // Capacidad del tanque en litros
    private double capacidadBateria; // Capacidad de la batería en kWh
    private double autonomiaTotal; // Autonomía total combinada en kilómetros
    private double autonomiaElectrica; // Autonomía eléctrica en kilómetros
    private String tipoHibrido; // Tipo de híbrido (Paralelo, Serie, Enchufable)
    private double rendimientoCombinado; // Rendimiento combinado en km/l

    // Constructor
    public Hibrido(double capacidadTanque, double capacidadBateria, double autonomiaTotal, double autonomiaElectrica,
                    String tipoHibrido, double rendimientoCombinado, String placa, String marca, String modelo, double precio) {
        super(placa, marca, modelo, precio);
        this.capacidadTanque = capacidadTanque;
        this.capacidadBateria = capacidadBateria;
        this.autonomiaTotal = autonomiaTotal;
        this.autonomiaElectrica = autonomiaElectrica;
        this.tipoHibrido = tipoHibrido;
        this.rendimientoCombinado = rendimientoCombinado;
    }

    // Getters y setters
    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomiaTotal() {
        return autonomiaTotal;
    }

    public void setAutonomiaTotal(double autonomiaTotal) {
        this.autonomiaTotal = autonomiaTotal;
    }

    public double getAutonomiaElectrica() {
        return autonomiaElectrica;
    }

    public void setAutonomiaElectrica(double autonomiaElectrica) {
        this.autonomiaElectrica = autonomiaElectrica;
    }

    public String getTipoHibrido() {
        return tipoHibrido;
    }

    public void setTipoHibrido(String tipoHibrido) {
        this.tipoHibrido = tipoHibrido;
    }

    public double getRendimientoCombinado() {
        return rendimientoCombinado;
    }

    public void setRendimientoCombinado(double rendimientoCombinado) {
        this.rendimientoCombinado = rendimientoCombinado;
    }

    // Métodos requeridos
    @Override
    public abstract void mostrarCaracteristicas();


    public void modoConduccion(String modo) {
        switch (modo.toLowerCase()) {
            case "eco" -> System.out.println("Modo de conducción: ECO. Máxima eficiencia activada.");
            case "sport" -> System.out.println("Modo de conducción: SPORT. Máximo rendimiento activado.");
            case "normal" -> System.out.println("Modo de conducción: NORMAL. Balance entre eficiencia y potencia.");
            default -> System.out.println("Modo de conducción no reconocido.");
        }
    }

    protected abstract void registrarKilometraje(double kilometraje);
}

