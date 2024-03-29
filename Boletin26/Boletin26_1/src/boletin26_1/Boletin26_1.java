
package boletin26_1;

import java.util.ArrayList;
import java.util.List;

public class Boletin26_1 {
    public static void main(String[] args) {
        Operaciones<Integer> operaciones = new Operaciones<>();
        
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(5);
        lista.add(20);
        lista.add(15);
        lista.add(30);
        
        System.out.println("Elemento mínimo: " + operaciones.minimo(lista));
        System.out.println("Elemento máximo: " + operaciones.maximo(lista));
        
        int objetoBuscado = 20;
        int posicion = operaciones.buscar(lista, objetoBuscado);
        if (posicion != -1) {
            System.out.println("El objeto " + objetoBuscado + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El objeto " + objetoBuscado + " no se encuentra en la lista");
        }
        
        int objetoABorrar = 20;
        Integer objetoEliminado = operaciones.borrarPrimeraAparicion(lista, objetoABorrar);
        if (objetoEliminado != null) {
            System.out.println("Se eliminó el objeto " + objetoEliminado + " de la lista.");
        } else {
            System.out.println("El objeto " + objetoABorrar + " no se encuentra en la lista.");
        }
        
    }
}

