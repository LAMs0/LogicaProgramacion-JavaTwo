package utils;
import java.util.Scanner;

public class inputHelper {
    private static Scanner scanner = new Scanner(System.in);

    public static int pedirNumeroPositivo(String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("El número no puede ser negativo. Intente nuevamente.");
            }
        } while (numero < 0);
        return numero;
    }
}
