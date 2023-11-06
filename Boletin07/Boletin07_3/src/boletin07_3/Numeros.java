
package boletin07_3;

import java.util.Scanner;

public class Numeros {
    
    public void verSigno(){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea un número");
        int numero = sc.nextInt();
        
        if(numero>0){
            System.out.println("+");
        }
        else if(numero==0)
            System.out.println("0");
        
            else
            System.out.println("-");
        
        
        
    }
    
    
    
}
