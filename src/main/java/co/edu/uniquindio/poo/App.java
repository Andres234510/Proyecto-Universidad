package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Inicialización de objetos
        try (Scanner scanner = new Scanner(System.in)) {
            // Inicialización de objetos
            Administrador admin = new Administrador("Juan", "Pérez", "admin123", "clave123", 1);
            Empleado empleado = new Empleado("Carlos", "López", "empleado1", "clave456", 2, "Ventas");
            Cliente cliente = new Cliente(3, "Ana", "Gómez", "ana@gmail.com");
            
            // Vehículos
            List<Vehiculo> vehiculos = new ArrayList<>();
            vehiculos.add(new SedanHibrido(40, 12, 800, 50, "Enchufable", 20, "SED123", "Toyota", "Prius", 30000, 5, 450, 6));
            vehiculos.add(new BusElectrico(150, 500, 3.5, "CCS", "BUS456", "BYD", "K9", 250000, 350, 50, TipoUso.URBANO));
            vehiculos.add(new Deportivo(60, "Euro 6", 400, 10, TipoCombustible.Gasolina, "DEP789", "Ferrari", "Roma", 350000, 340, 2.9, "Automática"));
            
            // Registro de transacciones
            RegistroTransacciones registroTransacciones = new RegistroTransacciones();
            
            // Inicialización de características de seguridad
            CaracteristicasSeguridad seguridad = new CaracteristicasSeguridad(true, true, true, true);
            
            // Menú interactivo
            int opcion;
            
            do {
                System.out.println("=================================");
                System.out.println("         Menú Principal          ");
                System.out.println("=================================");
                System.out.println("1. Información de usuarios");
                System.out.println("2. Ver vehículos disponibles");
                System.out.println("3. Registrar cliente");
                System.out.println("4. Registrar vehículo");
                System.out.println("5. Comprar un vehículo");
                System.out.println("6. Alquilar un vehículo");
                System.out.println("7. Generar reporte de transacciones");
                System.out.println("8. Mostrar características de seguridad");
                System.out.println("9. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> mostrarInformacionUsuarios(admin, empleado, cliente);
                    case 2 -> mostrarVehiculos(vehiculos);
                    case 3 -> registrarCliente(empleado, scanner);
                    case 4 -> registrarVehiculo(empleado, vehiculos, scanner);
                    case 5 -> realizarCompra(vehiculos, cliente, empleado, registroTransacciones, scanner);
                    case 6 -> realizarAlquiler(vehiculos, cliente, empleado, registroTransacciones, scanner);
                    case 7 -> generarReporte(registroTransacciones, scanner);
                    case 8 -> mostrarCaracteristicasSeguridad(seguridad);
                    case 9 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 9);
        }
    }

    // Métodos Auxiliares

    private static void mostrarInformacionUsuarios(Administrador admin, Empleado empleado, Cliente cliente) {
        System.out.println("=================================");
        System.out.println("Administrador:");
        admin.mostrarInformacion();
        System.out.println("---------------------------------");
        System.out.println("Empleado:");
        empleado.mostrarInformacion();
        System.out.println("---------------------------------");
        System.out.println("Cliente:");
        System.out.println("ID: " + cliente.getIdCliente());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println("Contacto: " + cliente.getContacto());
        System.out.println("=================================");
    }

    private static void mostrarVehiculos(List<Vehiculo> vehiculos) {
        System.out.println("=================================");
        System.out.println("Vehículos disponibles:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo() + " - $" + vehiculos.get(i).getPrecio());
        }
        System.out.println("=================================");
    }

    private static void registrarCliente(Empleado empleado, Scanner scanner) {
        System.out.print("Ingrese el ID del cliente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese el contacto del cliente: ");
        String contacto = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(id, nombre, apellido, contacto);
        empleado.registrarCliente(nuevoCliente);
    }

    private static void registrarVehiculo(Empleado empleado, List<Vehiculo> vehiculos, Scanner scanner) {
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.next();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.next();
        System.out.print("Ingrese el precio del vehículo: ");
        double precio = scanner.nextDouble();

        Vehiculo nuevoVehiculo = new SedanHibrido(40, 12, 800, 50, "Enchufable", 20, "GEN456", marca, modelo, precio, 5, 450, 6);
        vehiculos.add(nuevoVehiculo);
        empleado.registrarVehiculo(nuevoVehiculo);
    }

    private static void realizarCompra(List<Vehiculo> vehiculos, Cliente cliente, Empleado empleado, RegistroTransacciones registro, Scanner scanner) {
        System.out.println("Seleccione el número del vehículo que desea comprar:");
        mostrarVehiculos(vehiculos);
        int seleccion = scanner.nextInt() - 1;

        if (seleccion >= 0 && seleccion < vehiculos.size()) {
            Vehiculo vehiculoSeleccionado = vehiculos.get(seleccion);
            Venta venta = new Venta(cliente, empleado, vehiculoSeleccionado, registro.generarIdTransaccion());
            registro.registrarVenta(venta);
            System.out.println("Compra realizada exitosamente. Detalles:");
            venta.generarRecibo();
            vehiculos.remove(vehiculoSeleccionado);
        } else {
            System.out.println("Selección inválida.");
        }
    }

    private static void realizarAlquiler(List<Vehiculo> vehiculos, Cliente cliente, Empleado empleado, RegistroTransacciones registro, Scanner scanner) {
        System.out.println("Seleccione el número del vehículo que desea alquilar:");
        mostrarVehiculos(vehiculos);
        int seleccion = scanner.nextInt() - 1;

        if (seleccion >= 0 && seleccion < vehiculos.size()) {
            Vehiculo vehiculoSeleccionado = vehiculos.get(seleccion);
            System.out.print("Ingrese el costo del alquiler por día: ");
            double costoPorDia = scanner.nextDouble();
            scanner.nextLine(); // Consumir salto de línea
            System.out.print("Ingrese la fecha de inicio del alquiler: ");
            String fechaInicio = scanner.nextLine();
            System.out.print("Ingrese la fecha de fin del alquiler: ");
            String fechaFin = scanner.nextLine();

            Alquiler alquiler = new Alquiler(registro.generarIdTransaccion(), "2024-01-01", empleado, cliente, vehiculoSeleccionado, costoPorDia, fechaInicio, fechaFin);
            registro.registrarAlquiler(alquiler);
            System.out.println("Alquiler registrado exitosamente. Detalles:");
            alquiler.generarRecibo();
        } else {
            System.out.println("Selección inválida.");
        }
    }

    private static void generarReporte(RegistroTransacciones registro, Scanner scanner) {
        System.out.print("Ingrese la fecha de inicio del reporte (YYYY-MM-DD): ");
        String fechaInicio = scanner.next();
        System.out.print("Ingrese la fecha de fin del reporte (YYYY-MM-DD): ");
        String fechaFin = scanner.next();

        Reporte reporte = new Reporte(fechaInicio, fechaFin, registro.getTransacciones());
        System.out.println("Generando reporte...");
        reporte.generarReportePorPeriodo();
    }

    private static void mostrarCaracteristicasSeguridad(CaracteristicasSeguridad seguridad) {
        System.out.println("=================================");
        seguridad.mostrarCaracteristicasSeguridad();
        System.out.println("=================================");
    }
}
