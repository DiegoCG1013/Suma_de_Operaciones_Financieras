import java.util.Scanner;

public class Ejercicio_10 {
    //Enunciado: El arte ASCII consiste en hacer un diseño usando solo caracteres. Una de las formas más primitivas de este arte son los emoticonos: los caracteres :-) dibujan una carita sonriente.
    //
    //Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el ancho del rectángulo: ");
        int ancho = scanner.nextInt();
        System.out.println("Introduzca el alto del rectángulo: ");
        int alto = scanner.nextInt();
        System.out.println("Introduzca el carácter que desea utilizar: ");
        String caracter = scanner.next();
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

}
