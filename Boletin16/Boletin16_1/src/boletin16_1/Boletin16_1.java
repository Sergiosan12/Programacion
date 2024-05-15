
package boletin16_1;

public class Boletin16_1 {

    public static void main(String[] args) {
        
        Revista rev=new Revista(5,5,"Juego de Tronos",2010);
        System.out.println(rev);
        
        Libro lib =new Libro(8,"Harry Potter",2008,true);
        
        System.out.println(lib);
    }
    
}
