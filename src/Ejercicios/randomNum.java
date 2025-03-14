package Ejercicios;
import java.util.Random;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthIcon;

public class randomNum {
    public static void main(String[] args) {
        System.out.println("Este es un programa que adivina un numero entre 1 y 10");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10)+1;
        int intento;

        System.out.println("Estoy pensando en un numero del 1 al 10. ¿Puedes adivinarlo? ");

        do{
            System.out.println("Ingrese un numero: ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto){
                System.out.println("El numero es mayor. Intente de nuevo");
            }else if (intento > numeroSecreto){
                System.out.println("El numero es menor. Intente de nuevo");
            }else{
                System.out.println("¡Felicidades adivino el numero!");
            }
        }while (intento != numeroSecreto);

    }
}
