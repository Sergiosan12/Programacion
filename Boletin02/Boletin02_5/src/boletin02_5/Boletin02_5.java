
package boletin02_5;

import java.util.Scanner;

public class Boletin02_5 {

    
    public static void main(String[] args) {
       double millasm,metros;
       final int VALOR = 1852;
       Scanner sc = new Scanner(System.in);
       System.out.println("teclea millas mariñas");
       millasm = sc.nextFloat();
       metros=millasm*VALOR;
       System.out.println(millasm+"millasm="+ metros +"m");
    }
    
}
