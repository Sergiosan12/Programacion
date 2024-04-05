import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validador validador = new Validador() {
            @Override
            public boolean validar(int numero) {
                return numero % 2 == 0;
            }
        };

        int numero;
        do {
            System.out.println("Ingrese un número (0 para salir):");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número. Inténtalo de nuevo:");
                scanner.next();
            }
            numero = scanner.nextInt();
            if(numero!=0) {
                if (validador.validar(numero)) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            }
        } while (numero != 0);

        scanner.close();
    }
}