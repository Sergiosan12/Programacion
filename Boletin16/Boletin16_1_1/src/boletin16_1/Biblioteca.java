
package boletin16_1;

public class Biblioteca {
    
    private Libro libro;
    private Revista revista;

    public Biblioteca() {
    }

    public Biblioteca(Libro libro, Revista revista) {
        this.libro = libro;
        this.revista = revista;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        return "Biblioteca: " + "libro=" + libro + ", revista=" + revista;
    }
    
    
    
}
