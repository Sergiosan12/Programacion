
package boletin07_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Distintos {
    
 public void verMaior(){
     
     //Scanner sc=new Scanner(System.in);
     //System.out.println("Escribe el primer numero: ");
     //float num1=sc.nextFloat();
     //System.out.println("Escribe el segundo numero distinto al primero: ");
     //float num2=sc.nextFloat();
     //System.out.println("Escribe el tercer numero distinto a los dos anteriores: ");
     //float num3=sc.nextFloat();
     
     float num1=Float.parseFloat(JOptionPane.showInputDialog("Teclea el primer numero"));
     float num2=Float.parseFloat(JOptionPane.showInputDialog("Teclea el segundo numero distinto del primero"));
     float num3=Float.parseFloat(JOptionPane.showInputDialog("Teclea el tercer numero distinto a los dos anteriores"));
  
     if(num1>num2&&num1>num3)
        System.out.println(num1+" é o maior");
     else if (num2>num1&&num2>num3)
        System.out.println(num2+" é o maior");
     else 
         System.out.println(num3+" é o maior");
 }   
    
}
