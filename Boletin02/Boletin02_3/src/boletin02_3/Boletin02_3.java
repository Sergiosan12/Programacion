
package boletin02_3;

import java.util.Scanner;

public class Boletin02_3 {

    public static void main(String[] args) {
        double €,cambio;
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea €:");
        € = sc.nextDouble();
        System.out.println("teclea cambio:");
        cambio= sc.nextDouble();
        double $=€*cambio;
        System.out.println(€+"€="+$+"$");    
    }
    
}
