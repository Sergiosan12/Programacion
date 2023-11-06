
package boletin09_2;

public class Suma {
    
    public void caclcularSuma(){
        double suma = 0;
        double producto = 1;
        double i = 10;

        while (i <= 90) {
            suma += i;
            producto *= i;
            i++;
        }
        System.out.println("La suma de los números entre 10 y 90 es: " + suma+"\nEl producto de los números entre 10 y 90 es: " + producto);
    }
        
        
}
    

