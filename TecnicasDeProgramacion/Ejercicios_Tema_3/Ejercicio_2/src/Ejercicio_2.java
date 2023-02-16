import java.util.Scanner;

public class Ejercicio_2 {
    // Enunciado: Modificar el algoritmo anterior para mostrar un mensaje según la temperatura

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temperatura;
        System.out.println("Introduzca la temperatura (Numero entero)");
        temperatura = scanner.nextLine();
        try {
            int temperaturaInt = Integer.parseInt(temperatura);
            if (temperaturaInt < 2) System.out.println("Riesgo de hielo");
            else if (temperaturaInt < 15) System.out.println("Hace frio");
            else if (temperaturaInt < 30) System.out.println("Buena temperatura");
            else System.out.println("Demasiado calor");
        }catch (Exception e) {
            System.out.println("No has introducido un número entero");
        }
    }
}
