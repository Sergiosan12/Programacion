
package boletin08_7;

import javax.swing.JOptionPane;

public class Figuras {
    
    public void verFiguras(){
        int figura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca o número correspondente á figura desexada tendo en conta que \nCadrado=1 \nTriangulo=2 \nCirculo=3"));
        
        
        
        switch(figura){
            case 1:
                float lado=Float.parseFloat(JOptionPane.showInputDialog("Teclea o valor do lado"));
                System.out.println("O área do cadrado é= "+(lado*lado)+" m²");
                        break;
            case 2:
                float base=Float.parseFloat(JOptionPane.showInputDialog("Teclea o valor da base"));
                float altura=Float.parseFloat(JOptionPane.showInputDialog("Teclea o valor da altura"));
                System.out.println("O área do triángulo é= "+(base*altura/2)+" m²");
                        break;
            case 3:
                float radio=Float.parseFloat(JOptionPane.showInputDialog("Teclea o valor do radio"));
                System.out.println("O área do círuclo é= "+(Math.PI*Math.pow(radio, 2))+" m²");
                        break;
            default: System.out.println("Opción incorrecta");
        
        }
    }
    
}
