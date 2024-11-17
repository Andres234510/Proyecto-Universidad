package co.edu.uniquindio.poo;

public class Administrador extends Usuario {
    private int idAdministrador;

    public Administrador(String nombre, String apellido, String nombreUsuario, String clave, int idAdministrador) {
        super(nombre, apellido, nombreUsuario, clave);
        this.idAdministrador = idAdministrador;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public void generarReporte(Reporte reporte) {
        reporte.generarReportePorPeriodo();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Administrador: " + nombre + " " + apellido);
    }
}
