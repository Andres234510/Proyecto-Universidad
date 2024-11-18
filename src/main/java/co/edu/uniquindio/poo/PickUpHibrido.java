package co.edu.uniquindio.poo;

public class PickUpHibrido extends Hibrido {
    private double capacidadCarga; // Capacidad de carga en kg
    private String tipoCaja; // Tipo de caja (abierta, cerrada, etc.)

    private double kilometraje; // Kilometraje total del vehículo
    private boolean inspeccionRealizada; // Estado de la inspección técnica

    // Constructor
    public PickUpHibrido(double capacidadTanque, double capacidadBateria, double autonomiaTotal, double autonomiaElectrica,
                         String tipoHibrido, double rendimientoCombinado, String placa, String marca, String modelo,
                         double precio, double capacidadCarga, String tipoCaja) {
        super(capacidadTanque, capacidadBateria, autonomiaTotal, autonomiaElectrica, tipoHibrido, rendimientoCombinado,
                placa, marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
        this.tipoCaja = tipoCaja;
        this.kilometraje = 0.0;
        this.inspeccionRealizada = false;
    }

    // Getters y setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
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
        System.out.println("   Características de la Pick-Up Híbrida");
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
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
        System.out.println("Tipo de Caja: " + tipoCaja);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para la Pick-Up Híbrida con placa " + getPlaca());
        } else {
            System.out.println("La Pick-Up Híbrida con placa " + getPlaca() + " ya tiene una inspección realizada.");
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
