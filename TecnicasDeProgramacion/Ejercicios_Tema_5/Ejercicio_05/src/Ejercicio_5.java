import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
    //Escriba un algoritmo que pida al usuario una palabra sin acento, en minúsculas y seguida de un carácter en particular para indicar el final (# por ejemplo), y que le diga al usuario si esta palabra es un palíndromo.
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        String palabraInvertida = "";
        System.out.println("Ingrese una palabra sin acento, en minúsculas y seguida de un carácter # para indicar el final: ");
        palabra = sc.nextLine();
        if (palabra.charAt(palabra.length() - 1) == ('#')){
            palabra = palabra.replaceAll("#", "");
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida += palabra.charAt(i);
            }
            if (palabra.equals(palabraInvertida)) {
                System.out.println("La palabra " + palabra + " es un palíndromo");
            } else {
                System.out.println("La palabra " + palabra + " no es un palíndromo");
            }
        } else {
            System.out.println("No has ingresado el carácter # al final de la palabra");

        }
    }
}
