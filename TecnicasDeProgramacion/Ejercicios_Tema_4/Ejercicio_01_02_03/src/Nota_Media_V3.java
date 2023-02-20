import java.util.Scanner;

public class Nota_Media_V3 {
    //Enunciado: Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("¿Nota (-1 para terminar)?");
            double nota = sc.nextDouble();
            double suma = 0;
            int numNotas = 0;
            int numNotasSuperiores = 0;
            while (nota != -1) {
                suma += nota;
                numNotas++;
                if (nota >= 10) {
                    numNotasSuperiores++;
                }
                System.out.println("¿Nota (-1 para terminar)?");
                nota = sc.nextDouble();
            }
            System.out.println("Media = " + suma / numNotas + " (" + numNotasSuperiores * 100 / numNotas + " % ≥10)");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
