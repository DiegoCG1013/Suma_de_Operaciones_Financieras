import java.util.Scanner;

public class Pintura extends Obra {

    //Atributos
    private final static Scanner sc = new Scanner(System.in);
    private String autor, tecnica;
    private static String[] tecnicas = {"Oleo", "Acuarela", "Pastel", "Tinta china"};

    //Constructor
    public Pintura(String nombre, int anyo, Ciudad ciudad, String autor) {
        super(nombre, anyo, ciudad);
        this.autor = autor;
        tecnica = elegirTecnica();
    }

    //Metodo para elegir la tecnica de pintura
    public static String elegirTecnica(){
        int tec = 0;
        boolean iterador = true;
        while (iterador) {
            System.out.println("Elija una tecnica (Introduce su posicion) : ");
            for (int i = 0; i < tecnicas.length; i++) System.out.println((i + 1) + ". " + tecnicas[i]);
            String var = sc.next();
            try {
                tec = Integer.parseInt(var);
                System.out.println("Has elegido: " + tecnicas[tec - 1]);
                iterador = false;
            } catch (Exception e) {
                System.out.println("No has introducido un numero o este no es valido");
            }
        }
        return tecnicas[tec - 1];
    }

    //Método toString
    @Override
    public String toString() {
        return "Pintura{" +
                "autor='" + autor + '\'' +
                ", tecnica='" + tecnica + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", ciudad=" + ciudad.getNombre() +
                '}';
    }
}
