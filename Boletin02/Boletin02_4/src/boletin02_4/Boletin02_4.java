
package boletin02_4;

import java.util.Scanner;

public class Boletin02_4 {

 
    public static void main(String[] args) {
        double num1,num2,suma,resta,producto,cociente;
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea el primer numero:");
        num1 = sc.nextDouble();
        System.out.println("teclea el segundo numero");
        num2 = sc.nextDouble();
        suma= num1+num2;
        resta= num1-num2;
        producto= num1*num2;
        cociente=num1/num2;
        System.out.println("suma="+ suma +"\nresta=" + resta +"\nproducto="+producto+"\ncociente="+cociente);
         
    }
    
}
