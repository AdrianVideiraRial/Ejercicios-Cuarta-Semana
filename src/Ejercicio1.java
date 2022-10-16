import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*Crea
        un programa que muestre por pantalla si un número introducido por el usuario es mayor o menor que 10
        */

        //Pedimos el valor al usuario.
        Scanner entrada = new Scanner(System.in);
        float valor1=0f;
        System.out.println("Introduzca un valro numérico");
        valor1=entrada.nextFloat();

        //Introducimos nuestra condición con IF ELSE.
        if (valor1<=10) {
            System.out.println("El numero introducido es igual o menor a 10");
        } else {
            System.out.println("El número introducido es mayor a 10");
        }

    }
}

