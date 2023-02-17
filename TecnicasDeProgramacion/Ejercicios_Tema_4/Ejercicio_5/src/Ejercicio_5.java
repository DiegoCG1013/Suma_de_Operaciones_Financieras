import java.util.Scanner;

public class Ejercicio_5 {
    //Enunciado: Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //Elija un número del 1 al 100, luego presione cualquier tecla.
    //
    //a
    //
    //Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?
    //
    //-
    //
    //Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?
    //
    //+
    //
    //Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?
    //
    //+
    //
    //Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?
    //
    //=
    //
    //Fenomenal, lo he encontrado después de 4 intentos.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;
        int numeroAdivinar;
        int intentos = 0;
        String respuesta;

        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        scanner.nextLine();
        numeroAdivinar = (int) (Math.random() * 100) + 1;
        System.out.println("Pruebo con " + numeroAdivinar + ", ¿es mayor, menor o es el número (+/-/=)?");
        respuesta = scanner.nextLine();
        intentos++;
        while (!respuesta.equals("=")) {
            if (respuesta.equals("+")) {
                numeroAdivinar = (int) (Math.random() * (100 - numeroAdivinar)) + numeroAdivinar;
            } else if (respuesta.equals("-")) {
                numeroAdivinar = (int) (Math.random() * numeroAdivinar) + 1;
            }
            System.out.println("Pruebo con " + numeroAdivinar + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = scanner.nextLine();
            intentos++;
        }
        System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
    }
}
