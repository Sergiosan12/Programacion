
package boletin07_1;

import java.util.Scanner;

public class Positivo {
    
    public void verPositivo(){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea o un numero: ");
        int numero = sc.nextInt();
        if (numero>=0)
            System.out.println(numero+ " es positivo");
                
    }
    
}
