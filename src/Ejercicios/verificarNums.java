package Ejercicios;
import utils.inputHelper;

public class verificarNums {

    public static void main(String[] args) {
        int numero = inputHelper.pedirNumeroPositivo("Ingrese un numero positivo: ");

        if (numero % 2 == 0 ){
            System.out.println("El numero " + numero + " es par.");
        }else{
            System.out.println("El numero " + numero + " es impar.");
        }
    }
}
