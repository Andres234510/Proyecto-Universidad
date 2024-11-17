package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        // Crear empleados y administrador
        Empleado empleado1 = new Empleado("Juan", "Pérez", "juan.perez", "1234", 1, "Ventas");
        Administrador admin1 = new Administrador("Ana", "Gomez", "ana.gomez", "admin123", 1);
        
        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Carlos", "Lopez", "carlos@example.com");
        Cliente cliente2 = new Cliente(2, "María", "Fernandez", "maria@example.com");
        
        // Crear vehículos de diferentes tipos
        Vehiculo moto = new Moto("Yamaha", "MT-07", "Gasolina", "Manual", true, 689, 210);
        Vehiculo sedan = new Sedan("Toyota", "Corolla", "Gasolina", "Automática", true, 5, 4, 470);
        Vehiculo deportivo = new Deportivo("Porsche", "911", "Gasolina", "Automática", true, 450, 3.5);
        Vehiculo suv = new SUV("Jeep", "Wrangler", "Gasolina", "Manual", true, 5, true);
        Vehiculo pickup = new PickUp("Ford", "Ranger", "Diesel", "Manual", true, 1000, true);
        Vehiculo van = new Van("Mercedes", "Sprinter", "Diesel", "Manual", true, 15, 500);
        Vehiculo bus = new Bus("Volvo", "B11R", "Diesel", "Automática", true, 50, 3);
        Vehiculo camion = new Camion("Scania", "R450", "Diesel", "Manual", true, 20000, true, 4);

        // Registrar vehículos en el sistema
        empleado1.registrarVehiculo(moto);
        empleado1.registrarVehiculo(sedan);
        empleado1.registrarVehiculo(deportivo);
        empleado1.registrarVehiculo(suv);
        empleado1.registrarVehiculo(pickup);
        empleado1.registrarVehiculo(van);
        empleado1.registrarVehiculo(bus);
        empleado1.registrarVehiculo(camion);

        // Mostrar características de los vehículos
        moto.mostrarCaracteristicas();
        sedan.mostrarCaracteristicas();
        deportivo.mostrarCaracteristicas();
        suv.mostrarCaracteristicas();
        pickup.mostrarCaracteristicas();
        van.mostrarCaracteristicas();
        bus.mostrarCaracteristicas();
        camion.mostrarCaracteristicas();

        // Crear características de seguridad y combustible para un vehículo
        CaracteristicasSeguridad seguridad1 = new CaracteristicasSeguridad(true, true, true, true);
        seguridad1.mostrarCaracteristicasSeguridad();
        
        Combustible combustible1 = new Combustible("Eléctrico", 300, true);
        combustible1.mostrarInformacionCombustible();

        // Registrar clientes
        empleado1.registrarCliente(cliente1);
        empleado1.registrarCliente(cliente2);

        // Crear transacciones de compra, venta y alquiler
        Transaccion compra1 = new Compra(1, "2024-01-10", empleado1, cliente1, sedan, 20000);
        Transaccion venta1 = new Venta(2, "2024-02-05", empleado1, cliente2, suv, 30000);
        Transaccion alquiler1 = new Alquiler(3, "2024-03-01", empleado1, cliente1, van, 500, "2024-03-01", "2024-03-10");

        // Registrar transacciones en el sistema
        RegistroTransacciones registro = new RegistroTransacciones();
        registro.agregarTransaccion(compra1);
        registro.agregarTransaccion(venta1);
        registro.agregarTransaccion(alquiler1);

        // Realizar las transacciones y generar recibos
        compra1.generarRecibo();
        venta1.generarRecibo();
        alquiler1.generarRecibo();

        // Mostrar todas las transacciones registradas
        System.out.println("\n--- Transacciones Registradas ---");
        registro.mostrarTransacciones();

        // Crear un reporte de transacciones
        List<Transaccion> listaTransacciones = new ArrayList<>();
        listaTransacciones.add(compra1);
        listaTransacciones.add(venta1);
        listaTransacciones.add(alquiler1);
        
        Reporte reporte1 = new Reporte("2024-01-01", "2024-12-31", listaTransacciones);

        // Aplicar un filtro al reporte y exportarlo
        Filtro filtro1 = new Filtro("Empleado", "Juan Pérez");
        filtro1.aplicarFiltro(reporte1);
        
        FormatoReporte formatoPDF = new FormatoReporte("PDF");
        formatoPDF.exportarReporte(reporte1);

        // El administrador genera un reporte
        System.out.println("\n--- Generando Reporte por el Administrador ---");
        admin1.generarReporte(reporte1);
    }
}
