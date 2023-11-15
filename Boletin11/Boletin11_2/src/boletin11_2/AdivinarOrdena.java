
package boletin11_2;

import javax.swing.JOptionPane;
import java.util.Random;

public class AdivinarOrdena {
    
    public void adivinarRandom(){
        
        Random r = new Random();
        int numero = r.nextInt(50) + 1;
        int adivinar;
        int i=0;
        
        
        do{
            adivinar=Integer.parseInt(JOptionPane.showInputDialog("Adiviña o numero entre 1 e 50"));
            int diferencia = Math.abs(adivinar - numero);
            if (diferencia>20){
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            }
            if(diferencia >= 10 && diferencia <= 20){
                JOptionPane.showMessageDialog(null, "Lonxe");    
            }
            if (diferencia > 5 && diferencia < 10) {
                    JOptionPane.showMessageDialog(null, "Cerca ");
            }
            if (diferencia <= 5&&diferencia>0) {
                    JOptionPane.showMessageDialog(null, "Moi cerca ");
            }
            i++;
            
        }while(adivinar!=numero);
         JOptionPane.showMessageDialog(null, "Adivinaches o número con "+i+  " aciertos, Felicidades!");
        
       
        
        
    }
    
}
