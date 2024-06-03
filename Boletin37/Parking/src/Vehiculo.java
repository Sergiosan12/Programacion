public class Vehiculo {
    protected int espacio;
    protected String ID;

    public Vehiculo(int espacio, String ID) {
        this.espacio = espacio;
        this.ID = ID;
    }

    public int getEspacio() {
        return espacio;
    }

    public String getID() {
        return ID;
    }
}
