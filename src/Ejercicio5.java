import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        /* Crea un programa que pida una frase al usuario y comprueba si en esa frase
        contiene alguna b o v. Si existe una b, buscar si tiene alguna p la frase. Si
        tiene v, buscar si tiene u. Estas cláusulas no son excluyentes. Mostrar por
        pantalla si son ciertos todos los casos.
        Pista: Se pueden concatenar múltiples operaciones lógicas. Ej: (A & B) & (C & D)
        */

        Scanner frase = new Scanner(System.in);
        String texto = "";

        System.out.println("Escriba una frase para analizar");
        texto= frase.nextLine();

        //CONDICION 1 SI HAY "b".
        if (texto.contains("b")){
            System.out.println("El texto contiene la b");
            if (texto.contains ("b")&& texto.contains("p")){
                System.out.println("El texto contiene la p");
            }
        } else {
            System.out.println("El texto no contiene la b");
        }
        //CONDICION 2 SI HAY "u".
        if (texto.contains("u")){
            System.out.println("El texto contiene la u");
            if (texto.contains ("u")&& texto.contains("v")){
                System.out.println("El texto contiene la v");
            }
        } else {
            System.out.println("El texto no contiene la u");
        }
    }

    }
