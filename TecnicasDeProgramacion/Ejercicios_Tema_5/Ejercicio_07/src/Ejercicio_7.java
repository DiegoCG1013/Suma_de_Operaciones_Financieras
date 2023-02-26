import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        char[][] tabla = new char[20][30];
        Scanner sc = new Scanner(System.in);
        char letra = 65535;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (char) (Math.random() * 65535);
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
