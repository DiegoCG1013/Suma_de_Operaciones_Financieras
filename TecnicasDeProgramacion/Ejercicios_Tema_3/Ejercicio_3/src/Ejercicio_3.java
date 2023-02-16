import java.util.Scanner;

public class Ejercicio_3 {
    //Enunciado: Escriba el nombre del mes completo en función de su número (introducido por el usuario).

    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mes;
        System.out.println("Introduzca el numero del mes (Numero entero)");
        mes = scanner.nextLine();
        try {
            int mesInt = Integer.parseInt(mes);
            if (mesInt > 0 && mesInt < 13) System.out.println(meses[mesInt - 1]);
            else System.out.println("No has introducido un numero de mes valido");
        }catch (Exception e) {
            System.out.println("No has introducido un número entero");
        }
    }
}
