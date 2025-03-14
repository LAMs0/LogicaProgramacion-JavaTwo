package Ejercicios;
import utils.inputHelper;

public class contadorNums {
    public static void main(String[] args) {
       int numero = inputHelper.pedirNumeroPositivo("Ingrese un numero positivo: ");

       int contador = 1;
       while (contador <= numero) {
           System.out.println(contador);
           contador++;
        }
    }
}
