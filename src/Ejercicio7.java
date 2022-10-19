import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        /*Crea un programa que pida una cadena de texto al usuario. Calcular si la
        cadena contiene un número de caracteres par o impar y mostrarlo por pantalla.

        Pista: Las cadenas de texto tienen la propiedad .length que devuelve el tamaño.
        */

        Scanner memoria = new Scanner(System.in);
        String cadena = "";

        System.out.println("Introduce cadena de texto");

        cadena = memoria.nextLine();

        int resultado = cadena.length();

        System.out.println("El numero de caracteres es" + " " + resultado);

        if (resultado%2==0){
            System.out.println("EL número de caracteres de la cadena de texto es PAR");
        } else {
            System.out.println("El número de caracteres de la cadena de texto es IMPAR");
        }

    }
}
