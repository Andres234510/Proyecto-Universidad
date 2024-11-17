package co.edu.uniquindio.poo;

public class FormatoReporte {
    private String tipoFormato;

    public FormatoReporte(String tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    public void exportarReporte(Reporte reporte) {
        System.out.println("Exportando reporte en formato: " + tipoFormato);
        reporte.generarReportePorPeriodo();
    }

    public String getTipoFormato() {
        return tipoFormato;
    }

    public void setTipoFormato(String tipoFormato) {
        this.tipoFormato = tipoFormato;
    }
}
