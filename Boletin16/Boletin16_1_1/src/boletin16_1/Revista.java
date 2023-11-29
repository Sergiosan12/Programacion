
package boletin16_1;

public class Revista extends Publicacion{
    
    private int numero;

    public Revista() {
    }

    public Revista(int numero) {
        this.numero = numero;
    }

    public Revista(int numero, int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }
    
    @Override
    public int getAnoPublicacion(){
        return super.getAnoPublicacion();
    }
    
    @Override
    public String toString() {
        return "Revista: "+super.toString() + ", numero=" + numero;
    }
    
    
    
}
