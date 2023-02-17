import java.util.Scanner;

public class Nota_Media_V2 {
    //Enunciado: El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //¿Nota (-1 para terminar)?
    //
    //9
    //
    //¿Nota (-1 para terminar)?
    //
    //18
    //
    //¿Nota (-1 para terminar)?
    //
    //-1
    //
    //La nota media es 13,5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("¿Nota (-1 para terminar)?");
            double nota = sc.nextDouble();
            double suma = 0;
            int numNotas = 0;
            while (nota != -1) {
                suma += nota;
                numNotas++;
                System.out.println("¿Nota (-1 para terminar)?");
                nota = sc.nextDouble();
            }
            System.out.println("La nota media es " + suma / numNotas);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
