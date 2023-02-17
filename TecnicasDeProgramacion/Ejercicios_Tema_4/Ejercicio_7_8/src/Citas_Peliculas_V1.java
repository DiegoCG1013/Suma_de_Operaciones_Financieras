import java.util.Scanner;

public class Citas_Peliculas_V1 {

    //El programa debe mostrar un menú con una lista de películas y una opción para salir.
    //
    //Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.
    //
    //Si el usuario elige salir, el programa mostrará un mensaje antes de salir.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("1 - Una cita de la ciudad del miedo \n2 - Una cita de James Bond " +
                    "\n3 - Una cita de la vida es un largo río tranquilo \n4 - Una cita de Star Wars " +
                    "\n5 - Salir de esta aplicación");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Cuidado, es una auténtica carnicería");
                    break;
                case "2":
                    System.out.println("Me llamo Bond, James Bond");
                    break;
                case "3":
                    System.out.println("¿Qué es la vida? Una ilusión, una sombra, una ilusión");
                    break;
                case "4":
                    System.out.println("Yo soy tu padre");
                    break;
                case "5":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion.equals("5"));

    }

}
