import java.util.Scanner;

public class Ejercicio_1 {
    //Enunciado: Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temperatura;
        System.out.println("Introduzca la temperatura (Numero entero)");
        temperatura = scanner.nextLine();
        try {
            int temperaturaInt = Integer.parseInt(temperatura);
            if (temperaturaInt < 2) System.out.println("Riesgo de hielo");
        }catch (Exception e) {
            System.out.println("No has introducido un número entero");
        }
    }
}
