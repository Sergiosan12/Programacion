
package boletin15_1;


public class Boletin15_1 {

    public static void main(String[] args) {
        
        Futbolista fut=new Futbolista(5,"Central",9,"Sergio","Ramos",35);
        
        SeleccionFutbol ent=new Entrenador("CC",8,"Pep","Mourinho",50);
        
        
        fut.setEdade(25);
        System.out.println(fut);
        System.out.println(ent);
    }
    
}
