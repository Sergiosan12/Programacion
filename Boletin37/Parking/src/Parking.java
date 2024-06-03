import java.util.ArrayList;

public class Parking {
    private CConexion conexion;
    private ArrayList<Vehiculo> vehiculos;
    private int tamañoParking;
    private int espacioOcupado;

    public Parking(int tamañoParking) {
        this.conexion = new CConexion();
        this.vehiculos = new ArrayList<>();
        this.tamañoParking = tamañoParking;
        this.espacioOcupado = 0;
    }

    public boolean introducirParking(Vehiculo v) {
        if (espacioOcupado + v.getEspacio() <= tamañoParking) {
            vehiculos.add(v);
            espacioOcupado += v.getEspacio();
            conexion.insertVehiculo(v instanceof Coche ? "Coche" : "Camion", true);
            System.out.println("Vehículo introducido en el parking.");
            return true;
        } else {
            System.out.println("No hay suficiente espacio en el parking.");
            return false;
        }
    }

    public boolean sacarParking(String ID) {
        for (Vehiculo v : vehiculos) {
            if (v.getID().equals(ID)) {
                vehiculos.remove(v);
                espacioOcupado -= v.getEspacio();
                // Se asume que se usa el ID del vehículo en la base de datos
                // Necesitarás un mecanismo para mapear los ID de los vehículos con los ID en la base de datos
                int dbID = getDatabaseID(v.getID());
                if (dbID != -1) {
                    conexion.deleteVehiculo(dbID);
                    System.out.println("Vehículo retirado del parking.");
                    return true;
                }
            }
        }
        System.out.println("Vehículo no encontrado.");
        return false;
    }

    public void comprobarParking() {
        System.out.println("Estado actual del parking:");
        conexion.selectAllVehiculos();
        System.out.println("Espacio ocupado: " + espacioOcupado + "/" + tamañoParking);
    }

    private int getDatabaseID(String vehiculoID) {
        // Implementa este método para mapear el ID del vehículo con el ID de la base de datos
        // Este es un ejemplo sencillo; necesitas mejorarlo según tu lógica de negocio
        for (Vehiculo v : vehiculos) {
            if (v.getID().equals(vehiculoID)) {
                // Supongamos que el ID en la base de datos es igual al índice del array + 1
                return vehiculos.indexOf(v) + 1;
            }
        }
        return -1;
    }
}
