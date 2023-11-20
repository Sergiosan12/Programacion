
package boletin12_01;

import javax.swing.JOptionPane;

public class Garaxe {
    
    private Coche coche;
    public static int nCoches=0;
    
   
    public void contarCoches(){
        
        
        while(nCoches<5){
            JOptionPane.showMessageDialog(null, "Prazas dispoñibles");
            Coche.datosCoche();
            Coche.facturaCoche();
            nCoches++;
        }
        
       JOptionPane.showMessageDialog(null, "Completo");
        
    }
    
   
   
    

    
}
