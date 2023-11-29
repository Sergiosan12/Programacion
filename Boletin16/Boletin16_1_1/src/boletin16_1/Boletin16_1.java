
package boletin16_1;

public class Boletin16_1 {

    public static void main(String[] args) {
        
        Revista rev=new Revista(5,5,"Hola",2020);
        System.out.println(rev);
        
        Libro lib =new Libro(8,"Harry Potter",2023);
        System.out.println(lib);
        
        
        Biblioteca bib=new Biblioteca(lib,rev);
        //Biblioteca bib2=new Biblioteca(new Libro(8,"H Potter",2023),new Revista(5,5,"Hola",2020));
        System.out.println(bib);
    }
    
}
