
package boletin06_3;


public class Circulo {
    private double radio;
    public  final double pi=3.14;
    
    
    
    public Circulo(){
        
    }
    
    public Circulo(double ra){
        radio=ra;
    }
    public void setRadio(double ra){
        radio=ra;
    }

    public void calcularArea(){
        System.out.println("A área do círculo é: "+pi*Math.pow(radio, 2));
    }
    public double calcularLonxitude(){
        return 2*pi*radio;
    }
}

    
