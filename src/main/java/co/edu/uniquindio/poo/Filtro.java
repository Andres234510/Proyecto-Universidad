package co.edu.uniquindio.poo;

public class Filtro {
    private String criterio;
    private String valor;

    public Filtro(String criterio, String valor) {
        this.criterio = criterio;
        this.valor = valor;
    }

    public void aplicarFiltro(Reporte reporte) {
        System.out.println("Aplicando filtro por: " + criterio + " = " + valor);
        reporte.generarReportePorPeriodo();
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
