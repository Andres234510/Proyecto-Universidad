package co.edu.uniquindio.poo;

public abstract class CombustibleAGas extends Vehiculo {
    private TipoCombustible tipoCombustible;
    private double capacidadTanque;
    private double rendimiento;
    private String nivelEmisiones;
    private double potenciaMotor;

    public CombustibleAGas(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento, TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio) {
        super(placa, marca, modelo, precio);
        this.nivelEmisiones = nivelEmisiones;
        this.potenciaMotor = potenciaMotor;
        this.rendimiento = rendimiento;
        this.tipoCombustible = tipoCombustible;
    }

    

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque =  capacidadTanque;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getNivelEmisiones() {
        return nivelEmisiones;
    }

    public void setNivelEmisiones(String nivelEmisiones) {
        this.nivelEmisiones = nivelEmisiones;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
}
