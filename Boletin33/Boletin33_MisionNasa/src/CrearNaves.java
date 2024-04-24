public class CrearNaves {
    public static NaveEspacial crearNave(String nombre) {
        NaveEspacial nave = new NaveEspacial();

        switch (nombre) {
            case "Apollo12":
                nave.setNombre("Apollo12");
                nave.setTipo("Modulo Lunar");
                nave.setCapacidadTripulacion(2);
                break;
            case "Apollo11":
                nave.setNombre("Apollo11");
                nave.setTipo("Modulo de Comando");
                nave.setCapacidadTripulacion(4);
                break;
        }

        return nave;
    }
}