public class CrearTripulacion {
    public static MiembroTripulacion crearTripulacion(String nombre) {
        MiembroTripulacion tripulacion = new MiembroTripulacion();

        switch (nombre) {
            case "Neil Armstrong":
                tripulacion.setNombre("Neil Armstrong");
                tripulacion.setRol("Capitan");
                tripulacion.setExperiencia(10);
                break;
            case "Laika":
                tripulacion.setNombre("Laika");
                tripulacion.setRol("Polizon");
                tripulacion.setExperiencia(2);
                break;
        }

        return tripulacion;
    }
}
