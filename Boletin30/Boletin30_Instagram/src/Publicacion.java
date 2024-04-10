public class Publicacion {
    private String nombreUsuario;
    private String mensaje;

    public Publicacion(String nombreUsuario, String mensaje) {
        this.nombreUsuario = nombreUsuario;
        this.mensaje = mensaje;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }
}
