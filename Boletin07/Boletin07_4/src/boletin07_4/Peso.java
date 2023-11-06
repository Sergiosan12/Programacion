
package boletin07_4;

import javax.swing.JOptionPane;

public class Peso {
    
    public void verPeso(){
        String nombre1=JOptionPane.showInputDialog("Escribe el nombre de la persona 1");
        float peso1=Float.parseFloat(JOptionPane.showInputDialog("Teclea o peso da persona 1"));
        String nombre2=JOptionPane.showInputDialog("Escribe el nombre de la persona 2");
        float peso2=Float.parseFloat(JOptionPane.showInputDialog("Teclea o peso da persona 2"));
        
        if(peso1>peso2)
            JOptionPane.showMessageDialog(null,"A persoa 1 chámase "+nombre1+" pesa "+ peso1+" e pesa "+(peso1-peso2)+" kilos máis que "+nombre2);
        else
            JOptionPane.showMessageDialog(null,"A persoa 2 chámase "+nombre2+" pesa "+ peso2+" e pesa "+(peso2-peso1)+" kilos máis que "+nombre1);
        
    }
    
}
