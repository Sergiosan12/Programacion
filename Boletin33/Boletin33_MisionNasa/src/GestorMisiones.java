import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorMisiones {
    private List<Mision> misiones = new ArrayList<>();
    private List<NaveEspacial> naves = new ArrayList<>();
    private List <MiembroTripulacion> tripulantes = new ArrayList<>();
    private String nombreMisionReciente;
    public GestorMisiones() {
        naves.add(CrearNaves.crearNave("Apollo12"));
        naves.add(CrearNaves.crearNave("Apollo11"));
        tripulantes.add(CrearTripulacion.crearTripulacion("Neil Armstrong"));
        tripulantes.add(CrearTripulacion.crearTripulacion("Laika"));
    }
    public void crearMision(String nombreMision, String fechaLanzamiento, String objetivos, NaveEspacial naveEspacial, List<MiembroTripulacion> miembrosTripulacion) {
        try {
            this.nombreMisionReciente = nombreMision;
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreMision + ".txt"));
            writer.write("Nombre de la misión: " + nombreMision);
            writer.newLine();
            writer.write("Fecha de lanzamiento: " + fechaLanzamiento);
            writer.newLine();
            writer.write("Objetivos: " + objetivos);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getNombreMisionReciente() {
        return nombreMisionReciente;
    }

    public String[] getNombresMisiones() {
        List<String> nombresMisiones = new ArrayList<>();
        if (nombreMisionReciente != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(nombreMisionReciente+".txt"))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    if (linea.startsWith("Nombre de la misión: ")) {
                        nombresMisiones.add(linea.substring("Nombre de la misión: ".length()));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, crea una misión antes de asignar una nave.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return nombresMisiones.toArray(new String[0]);
    }

    public NaveEspacial getNavePorNombre(String nombreNave) {
        for (NaveEspacial nave : naves) {
            if (nave.getNombreNaves().equals(nombreNave)) {
                return nave;
            }
        }
        return null;
    }
    public String[] getNombresNaves() {
        String[] nombresNaves = new String[naves.size()];
        for (int i = 0; i < naves.size(); i++) {
            nombresNaves[i] = naves.get(i).getNombreNaves();
        }
        return nombresNaves;
    }

    public void asignarNaveAMision(String nombreMision, NaveEspacial nave) {
        for (Mision mision : misiones) {
            if (mision.getNombre().equals(nombreMision)) {
                mision.setNaveEspacial(nave);
                break;
            }
        }
    }
    public String[] getNombresTripulantes() {
        String[] nombresTripulantes = new String[tripulantes.size()];
        for (int i = 0; i < tripulantes.size(); i++) {
            nombresTripulantes[i] = tripulantes.get(i).getNombreTripulacion();
        }
        return nombresTripulantes;
    }
    public MiembroTripulacion getTripulantePorNombre(String nombreTripulante) {
        for (MiembroTripulacion tripulante : tripulantes) {
            if (tripulante.getNombreTripulacion().equals(nombreTripulante)) {
                return tripulante;
            }
        }
        return null;
    }
    public void asignarTripulanteAMision(String nombreMision, MiembroTripulacion tripulante) {
        for (Mision mision : misiones) {
            if (mision.getNombre().equals(nombreMision)) {
                mision.getMiembroTripulacion().add(tripulante);
                break;
            }
        }
    }

}
