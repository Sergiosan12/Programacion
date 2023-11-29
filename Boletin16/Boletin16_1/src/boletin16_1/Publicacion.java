
package boletin16_1;

public class Publicacion {
    
    private int codigo;
    private String titulo;
    private int anoPublicacion;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }


    

    @Override
    public String toString() {
        return "Publicacion: " + "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion;
    }
    
    
    
}
