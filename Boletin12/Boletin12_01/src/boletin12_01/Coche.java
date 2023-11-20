
package boletin12_01;
import javax.swing.JOptionPane;

public class Coche {
    
    private static String matricula;
    private static String marca;

    public Coche() {
    }    
    
    
    public static void datosCoche(){
        matricula=JOptionPane.showInputDialog("Introduzca a matrícula do coche");
        marca=JOptionPane.showInputDialog("Introduzca a marca do coche");

        
    }

    public static void facturaCoche(){
        
        float tiempo=Float.parseFloat(JOptionPane.showInputDialog("Tempo en horas no garaxe"));
        float precio;
        if(tiempo<=3){
            precio=(float)(tiempo*1.5);
        }else{
            precio=(float)(3*1.5+(tiempo-3)*0.20);
        }
        
        
        float cRecibidos=Float.parseFloat(JOptionPane.showInputDialog("O prezo é de: "+precio+"€"+" ,Por favor, pague a cantidade necesaria"));
        float cDevoltos=(float)(cRecibidos-precio);
        
        JOptionPane.showMessageDialog(null, "FACTURA"+"\nMATRICULA COCHE: "+matricula+"\nMARCA: "+marca +"\nTEMPO: "+tiempo+" horas"+
                "\nPREZO: "+precio+" €"+"\nCARTOS RECIBIDOS: "+cRecibidos+" €"+"\nCARTOS DEVOLTOS: "+cDevoltos+" €"+"\nGRAZAS POR USAR O NOSO APARCADOIRO");
        
    }
    
    
    
    
    
}
