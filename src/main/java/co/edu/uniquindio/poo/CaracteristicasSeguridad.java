package co.edu.uniquindio.poo;

public class CaracteristicasSeguridad {
    private boolean ABS;
    private boolean controlTraccion;
    private boolean sensoresColision;
    private boolean camaraReversa;

    public CaracteristicasSeguridad(boolean ABS, boolean controlTraccion, boolean sensoresColision, boolean camaraReversa) {
        this.ABS = ABS;
        this.controlTraccion = controlTraccion;
        this.sensoresColision = sensoresColision;
        this.camaraReversa = camaraReversa;
    }

    public void mostrarCaracteristicasSeguridad() {
        System.out.println("Características de Seguridad: ABS: " + (ABS ? "Sí" : "No") +
                            ", Control de Tracción: " + (controlTraccion ? "Sí" : "No") +
                            ", Sensores de Colisión: " + (sensoresColision ? "Sí" : "No") +
                            ", Cámara de Reversa: " + (camaraReversa ? "Sí" : "No"));
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    public boolean isControlTraccion() {
        return controlTraccion;
    }

    public void setControlTraccion(boolean controlTraccion) {
        this.controlTraccion = controlTraccion;
    }

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }
}
