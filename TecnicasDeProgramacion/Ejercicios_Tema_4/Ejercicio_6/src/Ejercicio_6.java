import java.util.Scanner;

public class Ejercicio_6 {
    //Enunciado: Algo Trampa
    //Variable numIntento : entero <- 1
    //Variable valorIntroducido : texto
    //Constante MAX_INTENTOS : entero <- 5
    //Inicio
    //   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
    //   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0
    //         escribir("Respuesta incorrecta")
    //         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &
    //" intento(s)")
    //         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
    //   FMq
    //   Si MAX_INTENTOS - numIntento ≠ 0 Entonces
    //         escribir("Bravo")
    //   Si no
    //         escribir("Revise sus conocimientos en geografía")
    //   FSi
    //Fin
    //¿Qué hace?:///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //El problema con este codigo es que el programa no se detiene cuando el usuario no acierta la respuesta nunca, ya que
    //los intentos no se incrementan, por lo que el programa nunca llega a la condicion de que el maximo de intentos menos los intentos sea 0
    //Tampoco sale bien del bucle ya que para salir del bucle se necesita que la capital sea correcta
    //y que el numero de intentos sea menor que el maximo de intentos, ambas a la vez.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numIntento = 1;
        String valorIntroducido;
        final int MAX_INTENTOS = 5;
        System.out.println("¿Cuál es la capital de Francia? ");
        valorIntroducido = entrada.next();
        while (!valorIntroducido.equals("París") && MAX_INTENTOS - numIntento != 0) {
            System.out.println("Respuesta incorrecta");
            System.out.println("Solo quedan " + (MAX_INTENTOS - numIntento) + " intento(s)");
            System.out.println("¿Cuál es la capital de Francia? ");
            valorIntroducido = entrada.next();
            numIntento++;
        }
        if (MAX_INTENTOS - numIntento != 0) {
            System.out.println("Bravo");
        } else {
            System.out.println("Revise sus conocimientos en geografía");
        }
    }
}
