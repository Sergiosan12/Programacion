
package boletin09_4;

import javax.swing.JOptionPane;

public class Tabla {
    
    public void calcularTabla(){
        
     int numero;
     int i=1;
     do{
         numero=Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero positivo ou prema o 0 para rematar o programa "));
     }while(numero<0);
     
     while(i<=10&&numero>0){
        System.out.println(numero +"*"+i +"="+ (numero*i));
     i++;     
     
    }
      
     if(numero==0){
         System.out.println("Remata o programa");
     }
        
     

    }
}
