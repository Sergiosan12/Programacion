
package boletin06_1;

import javax.swing.JOptionPane;

public class Coche {
     private int velocidade ;

    public Coche(){
    velocidade =0 ;
}

    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(int valor){
        velocidade+=valor;
        System.out.println("Velocidade despois de acelerar= "+velocidade);
        amosar();
    }
    public void frenar(int menos){
        velocidade-=menos;
        System.out.println("Velocidade despois de frenar= "+velocidade);
        amosar();
    }
    public void  amosar(){
        JOptionPane.showMessageDialog(null, velocidade);
    }
    
}