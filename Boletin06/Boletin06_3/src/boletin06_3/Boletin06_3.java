
package boletin06_3;


public class Boletin06_3 {

    public static void main(String[] args) {
        //parametrizado
        Circulo obxCir= new Circulo(15);
        obxCir.calcularArea();
        System.out.println("A lonxitude do círculo é= "+ obxCir.calcularLonxitude());
       //por defecto
        Circulo obxC= new Circulo();
        obxC.setRadio(30);
        obxC.calcularArea();
        System.out.println("A lonxitude do círculo é= "+ obxC.calcularLonxitude());
    }
    
}
