import java.util.Scanner;

public class Citas_Peliculas_V2 {

    //Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.

    static String[] frasesLaCiudad = {"Cita1 La Ciudad Del Miedo", "Cita2 La Ciudad Del Miedo", "Cita3 La Ciudad Del Miedo"};
    static String[] frasesJamesBond = {"Cita1 James Bond", "Cita2 James Bond", "Cita3 James Bond"};
    static String[] frasesLaVida = {"Cita1 La Vida Es Un Largo Rio Tranquilo", "Cita2 La Vida Es Un Largo Rio Tranquilo", "Cita3 La Vida Es Un Largo Rio Tranquilo"};
    static String[] frasesStarWars = {"Cita1 Star Wars", "Cita2 Star Wars", "Cita3 Star Wars"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        int frase;
        do {
            System.out.println("1 - Una cita de la ciudad del miedo \n2 - Una cita de James Bond " +
                    "\n3 - Una cita de la vida es un largo río tranquilo \n4 - Una cita de Star Wars " +
                    "\n5 - Salir de esta aplicación");
            opcion = sc.nextLine();

            frase = (int) (Math.random() * 3);

            switch (opcion) {
                case "1":
                    System.out.println(frasesLaCiudad[frase]);
                    break;
                case "2":
                    System.out.println(frasesJamesBond[frase]);
                    break;
                case "3":
                    System.out.println(frasesLaVida[frase]);
                    break;
                case "4":
                    System.out.println(frasesStarWars[frase]);
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
