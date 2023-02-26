import java.util.Scanner;

public class Ejercicio_9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.
        char[][] tablero = {{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        char jugador1 = 'X';
        char jugador2 = 'O';
        int fila = 0;
        int columna = 0;
        int contador = 0;
        boolean ganador = false;
        while (ganador == false) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println("");
            }
            if (contador % 2 == 0) {
                System.out.println("Jugador 1, ingrese la fila en la que desea colocar su ficha: ");
                fila = sc.nextInt() - 1;
                System.out.println("Jugador 1, ingrese la columna en la que desea colocar su ficha: ");
                columna = sc.nextInt() - 1;
                if (tablero[fila][columna] == '*') {
                    tablero[fila][columna] = jugador1;
                    contador++;
                } else {
                    System.out.println("La celda ya está ocupada");
                }
            } else {
                System.out.println("Jugador 2, ingrese la fila en la que desea colocar su ficha: ");
                fila = sc.nextInt() - 1;
                System.out.println("Jugador 2, ingrese la columna en la que desea colocar su ficha: ");
                columna = sc.nextInt() - 1;
                if (tablero[fila][columna] == '*') {
                    tablero[fila][columna] = jugador2;
                    contador++;
                } else {
                    System.out.println("La celda ya está ocupada");
                }
            }
            if (tablero[0][0] == jugador1 && tablero[0][1] == jugador1 && tablero[0][2] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[1][0] == jugador1 && tablero[1][1] == jugador1 && tablero[1][2] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[2][0] == jugador1 && tablero[2][1] == jugador1 && tablero[2][2] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[0][0] == jugador1 && tablero[1][0] == jugador1 && tablero[2][0] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[0][1] == jugador1 && tablero[1][1] == jugador1 && tablero[2][1] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[0][2] == jugador1 && tablero[1][2] == jugador1 && tablero[2][2] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[0][0] == jugador1 && tablero[1][1] == jugador1 && tablero[2][2] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[0][2] == jugador1 && tablero[1][1] == jugador1 && tablero[2][0] == jugador1) {
                ganador = true;
                System.out.println("El jugador 1 ha ganado");
            } else if (tablero[0][0] == jugador2 && tablero[0][1] == jugador2 && tablero[0][2] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[1][0] == jugador2 && tablero[1][1] == jugador2 && tablero[1][2] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[2][0] == jugador2 && tablero[2][1] == jugador2 && tablero[2][2] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[0][0] == jugador2 && tablero[1][0] == jugador2 && tablero[2][0] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[0][1] == jugador2 && tablero[1][1] == jugador2 && tablero[2][1] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[0][2] == jugador2 && tablero[1][2] == jugador2 && tablero[2][2] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[0][0] == jugador2 && tablero[1][1] == jugador2 && tablero[2][2] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            } else if (tablero[0][2] == jugador2 && tablero[1][1] == jugador2 && tablero[2][0] == jugador2) {
                ganador = true;
                System.out.println("El jugador 2 ha ganado");
            }
        }
    }
}
