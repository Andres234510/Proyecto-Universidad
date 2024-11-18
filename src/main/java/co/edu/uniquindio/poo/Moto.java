    package co.edu.uniquindio.poo;

    public class Moto extends CombustibleAGas {
        private String tipoManillar; 
        private int cilindrada; 
        private double peso; 
        private int cilindraje;
        private int velocidadMaxima;
        private boolean tieneMaletero;
        private double kilometraje; // Kilometraje total de la moto
        private boolean inspeccionRealizada; // Estado de la inspección

        public Moto(double capacidadTanque, String nivelEmisiones, double potenciaMotor, double rendimiento,
                TipoCombustible tipoCombustible, String placa, String marca, String modelo, double precio,
                String tipoManillar, int cilindrada, double peso, int cilindraje, int velocidadMaxima,
                boolean tieneMaletero) {
            super(capacidadTanque, nivelEmisiones, potenciaMotor, rendimiento, tipoCombustible, placa, marca, modelo,
                    precio);
            this.tipoManillar = tipoManillar;
            this.cilindrada = cilindrada;
            this.peso = peso;
            this.cilindraje = cilindraje;
            this.velocidadMaxima = velocidadMaxima;
            this.tieneMaletero = tieneMaletero;
            this.kilometraje = 0.0;
            this.inspeccionRealizada = false;
        }

        public String getTipoManillar() {
            return tipoManillar;
        }

        public void setTipoManillar(String tipoManillar) {
            this.tipoManillar = tipoManillar;
        }

        public int getCilindrada() {
            return cilindrada;
        }

        public void setCilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public int getCilindraje() {
            return cilindraje;
        }

        public void setCilindraje(int cilindraje) {
            this.cilindraje = cilindraje;
        }

        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }

        public void setVelocidadMaxima(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
        }

        public boolean isTieneMaletero() {
            return tieneMaletero;
        }
    
        public void setTieneMaletero(boolean tieneMaletero) {
            this.tieneMaletero = tieneMaletero;
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

        // Método para realizar la inspección técnica
    public void realizarInspeccion() {
        if (!inspeccionRealizada) {
            inspeccionRealizada = true;
            System.out.println("Inspección realizada para la moto con placa " + getPlaca());
        } else {
            System.out.println("La moto con placa " + getPlaca() + " ya tiene una inspección realizada.");
        }
    }

    // Método para registrar el kilometraje recorrido
    public void registrarKilometraje(double kilometros) {
        if (kilometros > 0) {
            kilometraje += kilometros;
            System.out.println("Se ha registrado un recorrido de " + kilometros + " kilómetros. Kilometraje total: " + kilometraje);
        } else {
            System.out.println("El kilometraje ingresado no es válido.");
        }
    }

    // Método para aplicar un descuento sobre el precio de la moto
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = (getPrecio() * porcentaje) / 100;
            setPrecio(getPrecio() - descuento);
            System.out.println("Se ha aplicado un descuento del " + porcentaje + "%. Precio actualizado: " + getPrecio());
        } else {
            System.out.println("Porcentaje de descuento inválido.");
        }
    }


    @Override
    public void mostrarCaracteristicas() {
        System.out.println("=================================");
        System.out.println("       Características de la Moto");
        System.out.println("=================================");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Capacidad del Tanque: " + getCapacidadTanque() + " litros");
        System.out.println("Nivel de Emisiones: " + getNivelEmisiones());
        System.out.println("Potencia del Motor: " + getPotenciaMotor() + " HP");
        System.out.println("Rendimiento: " + getRendimiento() + " km/l");
        System.out.println("Tipo de Combustible: " + getTipoCombustible());
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Inspección Realizada: " + (inspeccionRealizada ? "Sí" : "No"));
        System.out.println("Tipo de Manillar: " + tipoManillar);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("¿Tiene Maletero?: " + (tieneMaletero ? "Sí" : "No"));
        System.out.println("=================================");
    }
    
    }
    