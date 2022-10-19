import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*Crea un programa que muestre por pantalla una selección de productos al
        usuario (3 o 4) y dependiendo de lo que escriba el usuario, se muestre el precio del producto.
        */

        //Pedimos al usuario que escriba uno de estos productos.

        Scanner dato = new Scanner(System.in);
        String producto = "";

        System.out.println("Seleccione un producto de la lista: ");
        System.out.println("Leche");
        System.out.println("Cacao");
        System.out.println("Avellanas");
        System.out.println("Azucar");

        producto = dato.next();

        switch (producto) {
            case "Leche":
                System.out.println("Precio 1,55€");
                break;
            case "Cacao":
                System.out.println("Precio 2€");
                break;
            case "Avellanas":
                System.out.println("Precio 2,59€");
                break;
            case "Azucar":
                System.out.println("Precio 0,55€");
                break;
        }

    }

}