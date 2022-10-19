import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /* Crea un programa que muestre por pantalla distintas figuras geométricas (triángulo, rectángulo, pentágono y hexágono).
         Según lo que escoja el usuario, se le pedirá que introduzca unos valores clave para calcular.
         el área de la figura seleccionada. Mostrar por pantalla el resultado.
         */

        Scanner dato = new Scanner(System.in);
        String producto = "";

        System.out.println("Seleccione una figura geométrica de la lista: ");
        System.out.println("Triangulo");
        System.out.println("Rectangulo");
        System.out.println("Pentagono");
        System.out.println("Hexagono");

        producto = dato.next();

       // Solicitamos datos según figura geométrica.


        switch (producto) {
            case "Triangulo":
                Scanner Triangulo = new Scanner(System.in);
                float baseT = 0f;
                float alturaT = 0f;

                System.out.println("Introduzca el valor de la base en cm");
                baseT = Triangulo.nextFloat();

                System.out.println("Introduzca el valor de la altura en cm");
                alturaT = Triangulo.nextFloat();

                float areaTriangulo = (baseT * alturaT)/2;

                System.out.println("El area del tríangulo es" +" "+ areaTriangulo);
                break;
            case "Rectangulo":
                Scanner Rectangulo = new Scanner(System.in);
                float baseR = 0f;
                float alturaR = 0f;

                System.out.println("Introduzca el valor de la base en cm");
                baseR = Rectangulo.nextFloat();

                System.out.println("Introduzca el valor de la altura en cm");
                alturaR = Rectangulo.nextFloat();

                float areaRectangulo = baseR * alturaR;

                System.out.println("El area del Rectángulo es" +" "+ areaRectangulo);
                break;
            case "Pentagono":
                Scanner Pentagono = new Scanner(System.in);
                float lP = 0f;
                float apP = 0f;

                System.out.println("Introduzca el valor del lado en cm");
                lP = Pentagono.nextFloat();

                System.out.println("Introduzca el valor del apotema en cm");
                apP = Pentagono.nextFloat();

                float areaPentagono = (5*lP*apP)/2;
                System.out.println("El area del Rectángulo es" +" "+ areaPentagono);
                break;
            case "Hexagono":
                Scanner Hexagono = new Scanner(System.in);
                float lH = 0f;
                float apH = 0f;

                System.out.println("Introduzca el valor del lado en cm");
                lH = Hexagono.nextFloat();

                System.out.println("Introduzca el valor del apotema en cm");
                apH = Hexagono.nextFloat();

                float areaHexagono = (3*lH*apH);
                System.out.println("El area del Rectángulo es" +" "+ areaHexagono);
                break;

        }
    }
}
