
package boletin09_3;

import javax.swing.JOptionPane;

public class Area {
    
    public void calcularArea(){
    
    float base,altura,area;
    
    do{
     base=Float.parseFloat(JOptionPane.showInputDialog("Teclea a base cun número positivo "));
    }while(base<=0);
    
    
    do{
     altura=Float.parseFloat(JOptionPane.showInputDialog("Teclea a altura cun número positivo "));
    }while(altura<=0);
    
    area=base*altura;
        System.out.println("A área do rectángulo é: "+ area + " m²");
    }
}