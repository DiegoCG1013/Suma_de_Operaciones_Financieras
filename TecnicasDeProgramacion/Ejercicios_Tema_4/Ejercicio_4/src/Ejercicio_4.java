import java.util.Scanner;

public class Ejercicio_4 {
    //Enunciado: Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número.
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //¿En qué número entre 1 y 100 estoy pensando?
    //
    //23
    //
    //Menor
    //
    //15
    //
    //Mayor
    //
    //19
    //
    //Menor
    //
    //17
    //
    //Bravo, lo ha encontrado

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 100 + 1);
        System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
        int intento = sc.nextInt();
        while (intento != numero) {
            if (intento < numero) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }
            System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
            intento = sc.nextInt();
        }
        System.out.println("Bravo, lo ha encontrado");
    }
}
