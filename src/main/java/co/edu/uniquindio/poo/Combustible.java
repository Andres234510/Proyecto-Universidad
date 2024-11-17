package co.edu.uniquindio.poo;

public class Combustible {
    private String tipoCombustible;
    private double autonomia;
    private boolean esEnchufable;

    public Combustible(String tipoCombustible, double autonomia, boolean esEnchufable) {
        this.tipoCombustible = tipoCombustible;
        this.autonomia = autonomia;
        this.esEnchufable = esEnchufable;
    }

    public void mostrarInformacionCombustible() {
        System.out.println("Combustible: " + tipoCombustible + ", Autonomía: " + autonomia + " km, Enchufable: " + (esEnchufable ? "Sí" : "No"));
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isEsEnchufable() {
        return esEnchufable;
    }

    public void setEsEnchufable(boolean esEnchufable) {
        this.esEnchufable = esEnchufable;
    }
}
