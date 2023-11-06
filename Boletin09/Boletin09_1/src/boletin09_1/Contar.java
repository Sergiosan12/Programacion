
package boletin09_1;

public class Contar {
    
    public void amosarConta(){
        int i=0;
        int negativos=0;
        int ceros=0;
        int positivos=0;
               
        while(i<10){
            int dato= LerDatos.lerEnteiro("Teclea o dato");
            i++;
            if(dato==0){
                ceros++;
            }
            else if (dato<0){
                negativos++;
            }
            else if (dato>0){
                positivos++;
            }
            
        }
        System.out.println("Hai "+ceros+ " ceros"+"\nHai "+positivos+" numeros positivos"+"\nHai "+negativos+ " numeros negativos" );

    }
    
    
}
