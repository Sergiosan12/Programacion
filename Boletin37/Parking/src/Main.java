import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking parking = new Parking(10);

        while (true) {
            System.out.println("\nMenú de Gestión del Parking");
            System.out.println("1. Introducir Vehículo");
            System.out.println("2. Sacar Vehículo");
            System.out.println("3. Comprobar Estado del Parking");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de vehículo (coche/camion): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese el ID del vehículo: ");
                    String id = scanner.nextLine();

                    Vehiculo vehiculo;
                    if (tipo.equalsIgnoreCase("coche")) {
                        vehiculo = new Coche(id);
                    } else if (tipo.equalsIgnoreCase("camion")) {
                        vehiculo = new Camion(id);
                    } else {
                        System.out.println("Tipo de vehículo no válido.");
                        break;
                    }

                    parking.introducirParking(vehiculo);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del vehículo a retirar: ");
                    String idRetirar = scanner.nextLine();
                    parking.sacarParking(idRetirar);
                    break;
                case 3:
                    parking.comprobarParking();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
