package co.edu.uniquindio.poo;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String nombreUsuario;
    protected String clave;

    public Usuario(String nombre, String apellido, String nombreUsuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        return this.nombreUsuario.equals(usuario) && this.clave.equals(clave);
    }

    public abstract void mostrarInformacion();
}
