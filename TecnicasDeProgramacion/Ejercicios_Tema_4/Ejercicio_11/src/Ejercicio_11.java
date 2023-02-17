import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_11 {
    //Enunciado: Dibujar una de las siguientes formas, según la elección del usuario
    //1 - rectángulo con relleno
    //
    //2 - rectángulo sin relleno
    //
    //3 - cruz de San Andrés
    //
    //4 - triángulo rectángulo
    //
    //5 - rombo
    //
    //6 - ajedrezado

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        int tamaño = 0;
        boolean mal = false;

        try {
            System.out.println("Que figura desea dibujar? \n1 - rectángulo con relleno \n2 - rectángulo sin relleno " +
                    "\n3 - cruz de San Andrés \n4 - triángulo rectángulo \n5 - rombo \n6 - ajedrezado");
            opcion = scanner.nextLine();
            System.out.println("Introduzca el tamaño de la figura");
            tamaño = scanner.nextInt();
            String figura[][] = new String[tamaño][tamaño];

            switch (opcion) {
                case "1":
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            figura[i][j] = "*";
                        }
                    }
                    break;
                case "2":
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                                figura[i][j] = "*";
                            } else {
                                figura[i][j] = " ";
                            }
                        }
                    }
                    break;
                case "3":
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == j || i + j == tamaño - 1) {
                                figura[i][j] = "*";
                            } else {
                                figura[i][j] = " ";
                            }
                        }
                    }
                    break;
                case "4":
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == tamaño-1 || j == 0 || i == j) {
                                figura[i][j] = "*";
                            } else {
                                figura[i][j] = " ";
                            }
                        }
                    }
                    break;
                case "5":
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i + j == tamaño / 2 || i + (j + 1)== tamaño + tamaño / 2 || i - j == tamaño / 2 || j - i == tamaño / 2) {
                                figura[i][j] = "*";
                            } else {
                                figura[i][j] = " ";
                            }
                        }
                    }
                    break;
                case "6":
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i % 2 == 0) {
                                if (j % 2 == 0) {
                                    figura[i][j] = "*";
                                } else {
                                    figura[i][j] = " ";
                                }
                            } else {
                                if (j % 2 == 0) {
                                    figura[i][j] = " ";
                                } else {
                                    figura[i][j] = "*";
                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("No ha introducido una opción válida");
                    mal = true;
                    break;
            }
            if(!mal) {
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        System.out.print(figura[i][j]);
                    }
                    System.out.println();
                }
            }


        } catch(InputMismatchException e){
            System.out.println("No ha introducido un número entero");
        }
    }
}
