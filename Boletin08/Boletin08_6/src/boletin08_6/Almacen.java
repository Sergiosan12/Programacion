
package boletin08_6;

import javax.swing.JOptionPane;

public class Almacen {
    
    public void verTipoArtigo(){
        
        String produto=JOptionPane.showInputDialog("Nome do producto");
        int ventas=Integer.parseInt(JOptionPane.showInputDialog("Introduzca o número de ventas"));
        
        if(ventas<=100){
        System.out.println("O produto "+produto+ "é de tipo baixo");
        }
        if(ventas>100&&ventas<=500){
            System.out.println("O produto "+produto+" é de tipo medio");
        }
        if(ventas>500&&ventas<=1000){
            System.out.println("O produto "+produto+ " é de tipo alto");
        }
        if(ventas>1000){ 
            System.out.println("O produto "+produto+ " é de primeira necesidade");
        }
    }
        
    
}
