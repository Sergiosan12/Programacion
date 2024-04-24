import java.util.ArrayList;
import java.util.List;

public class Mision {
    private String nombre;
    private String fechaLanzamiento;
    private String objetivos;
    private NaveEspacial naveEspacial;
    private List<MiembroTripulacion> miembroTripulacion;

    public Mision() {
    }


    public Mision(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public NaveEspacial getNaveEspacial() {
        return naveEspacial;
    }

    public void setNaveEspacial(NaveEspacial naveEspacial) {
        this.naveEspacial = naveEspacial;
    }

    public List<MiembroTripulacion> getMiembroTripulacion() {
        return miembroTripulacion;
    }

    public void setMiembroTripulacion(List<MiembroTripulacion> miembroTripulacion) {
        this.miembroTripulacion = miembroTripulacion;
    }
}
