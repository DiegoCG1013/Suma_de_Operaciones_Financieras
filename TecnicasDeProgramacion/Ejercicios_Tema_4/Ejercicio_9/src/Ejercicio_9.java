import java.util.Scanner;

public class Ejercicio_9 {
    //Enunciado: Escriba un programa que haga que el usuario escriba un múltiplo de tres y no se detenga hasta que el número sea correcto.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escriba un numero multiplo de 3");
        num = sc.nextInt();
        while (num % 3 != 0) {
            System.out.println("El numero no es multiplo de 3");
            System.out.println("Escriba un numero multiplo de 3");
            num = sc.nextInt();
        }
        System.out.println("El numero es multiplo de 3");
    }
}
