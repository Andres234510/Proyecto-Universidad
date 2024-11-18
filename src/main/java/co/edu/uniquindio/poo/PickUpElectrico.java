package co.edu.uniquindio.poo;

public class PickUpElectrico extends Electrico {
    private double capacidadCarga; // Capacidad de carga en kilogramos
    private String tipoCaja; // Tipo de caja (manual, automática, etc.)
    private double kilometraje; // Kilometraje total de la camioneta eléctrica
    private boolean inspeccionRealizada; // Estado de la inspección técnica

    // Constructor
    public PickUpElectrico(double capacidadBateria, double autonomia, double tiempoRecarga, String tipoConector,
                           String placa, String marca, String modelo, double precio, double potenciaMotor,
                           double capacidadCarga, String tipoCaja) {
        super(capacidadBateria, autonomia, tiempoRecarga, tipoConector, placa, marca, modelo, precio, potenciaMotor);
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
        System.out.println("   Características de la PickUp Eléctrica");
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
        System.out.println("Capacidad de Carga: " + capacidadCarga + " kg");
        System.out.println("Tipo de Caja: " + tipoCaja);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("=================================");
    }

    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para la PickUp Eléctrica con placa " + getPlaca());
        } else {
            System.out.println("La PickUp Eléctrica con placa " + getPlaca() + " ya tiene una inspección realizada.");
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
