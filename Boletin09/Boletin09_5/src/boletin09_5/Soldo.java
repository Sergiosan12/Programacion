
package boletin09_5;

import javax.swing.JOptionPane;

public class Soldo {
    
    public void calcularSoldo(){
            double salario;
            int i = 0;
            int j = 0;
            int nTrabajadores = 0;

            do {
                salario =Double.parseDouble(JOptionPane.showInputDialog("Introduzca salario del trabajador. Si no hay más teclee 0."));
                if (salario > 0) {
                    nTrabajadores++;
                    if (salario >= 1000 && salario <= 1750) {
                        i++;
                    } else if (salario < 1000) {
                        j++;
                    }
                }
            } while (salario != 0);

            float porcentaje = (float) j / nTrabajadores * 100;

            System.out.println("Número de trabajadores que ganan entre 1000 y 1750 €: " + i);
            System.out.println("Porcentaje de trabajadores que ganan menos de 1000 €: " + porcentaje + "%");
        }
    }
        
        
    
    

