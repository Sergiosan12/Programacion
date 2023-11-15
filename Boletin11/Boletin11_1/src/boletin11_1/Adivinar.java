
package boletin11_1;

import javax.swing.JOptionPane;

public class Adivinar {
    
    public void adivinarNumero(){
        int numero;
        int i=0;
        do{
        numero=Integer.parseInt(JOptionPane.showInputDialog("Tecela un número entre 1 e 50"));
        }while(numero<1||numero>50);
        int intentos=Integer.parseInt(JOptionPane.showInputDialog("Teclea o número máximo de intentos"));
        int adivinar;
        
        do{
            adivinar=Integer.parseInt(JOptionPane.showInputDialog("Adiviña o numero"));
            if (adivinar>numero){
                JOptionPane.showMessageDialog(null, "O número a adiviñar é menor");
            }
            if(adivinar<numero){
                JOptionPane.showMessageDialog(null, "O número a adiviñar é maior");    
            }
            i++;
            
        }while(adivinar!=numero&&i<intentos);
        
        
        if (adivinar==numero){
            JOptionPane.showMessageDialog(null, "Adivinaches o número, Felicidades!");
        }
        
        else 
            JOptionPane.showMessageDialog(null, "Se acabaron los intentos, non o adivinaches");

    }
    
}
