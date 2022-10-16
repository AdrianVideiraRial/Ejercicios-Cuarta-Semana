import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*Crea un programa que muestre por pantalla si una palabra que introduzca el
        usuario contiene la letra b minúscula.
        Pista: “variable”.contains(“texto”);
        */

        //Pedimos que el usuario intruduzca una palara
        Scanner entrada = new Scanner(System.in);
        String palabra = ""; // nuestra variable tipo texto (String)

        System.out.println("Introduzca una palabra");
        palabra=entrada.next();

        //Creamos la condicion.
        if (palabra.contains("b")){
            System.out.println("La palabra contiene la letra b");
        } else{
            System.out.println("La palabra NO contiene la letra b");
        }

    }
}
