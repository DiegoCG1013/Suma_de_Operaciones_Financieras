import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        //Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:
        //
        //Solo hay un jugador.
        //
        //Solo hay cuatro filas y cuatro columnas.
        //
        //Solo hay un barco que ocupa una única celda (este espacio se elige al azar).
        Scanner sc = new Scanner(System.in);
        char[][] tablero = {{'*', '*', '*', '*'}, {'*', '*', '*', '*'}, {'*', '*', '*', '*'}, {'*', '*', '*', '*'}};
        int fila = 0;
        int columna = 0;
        int contador = 0;
        boolean ganador = false;
        int filaBarco = (int) (Math.random() * 4);
        int columnaBarco = (int) (Math.random() * 4);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        while (ganador == false) {
            System.out.println("Ingrese la fila en la que desea disparar: ");
            fila = sc.nextInt() - 1;
            System.out.println("Ingrese la columna en la que desea disparar: ");
            columna = sc.nextInt() - 1;
            if (tablero[fila][columna] == '*') {
                if (fila == filaBarco && columna == columnaBarco) {
                    tablero[fila][columna] = 'X';
                    ganador = true;
                    System.out.println("Has ganado");
                } else {
                    tablero[fila][columna] = 'O';
                    contador++;
                    System.out.println("Agua");
                }
            } else {
                System.out.println("Ya has disparado en esa celda");
            }
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}

