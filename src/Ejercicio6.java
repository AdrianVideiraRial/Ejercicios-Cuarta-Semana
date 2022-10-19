import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
       /* Crea un programa que calcule si un número dado por el usuario es par o
        impar y lo muestre por pantalla.
       */


        Scanner numero = new Scanner(System.in);
        System.out.println("Escriba un numero entero");

        int valor1 = numero.nextInt();

        //Operacion para saber si es numero par o impar.
        int resultado = valor1%2;


        if (resultado==0){
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
    }
}
