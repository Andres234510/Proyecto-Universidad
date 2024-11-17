package co.edu.uniquindio.poo;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String contacto;

    public Cliente(int idCliente, String nombre, String apellido, String contacto) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void actualizarInformacion(String nuevoContacto) {
        this.contacto = nuevoContacto;
        System.out.println("Información de contacto actualizada.");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
