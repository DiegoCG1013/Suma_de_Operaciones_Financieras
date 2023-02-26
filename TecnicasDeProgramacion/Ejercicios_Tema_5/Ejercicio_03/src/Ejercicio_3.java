import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<Integer>();
        int nota = 0;
        do {
            System.out.println("Introduce una nota: ");
            nota = sc.nextInt();
            if (nota != -1) {
                notas.add(nota);
            }
        } while (nota != -1);

        //Mostrar notas y media
        int suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
            suma += notas.get(i);
        }
        System.out.println("\nMedia: " + (suma / notas.size()));
    }
}
