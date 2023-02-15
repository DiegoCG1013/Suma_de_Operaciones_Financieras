import java.util.Scanner;

public class Arquitectura extends Obra{

    //Atributos
    private final String[] tipos = {"Castillo", "Catedral", "Plaza", "Museo", "Teatro"};
    String tipo;
    private final Scanner sc = new Scanner(System.in);

    //Constructor
    public Arquitectura(String nombre, int anyo, Ciudad ciudad) {
        super(nombre, anyo, ciudad);
        tipo = elegirTipo();
    }

    //Metodo para elegir el tipo de arquitectura
    private String elegirTipo(){
        int type = 0;
        boolean iterador = true;
        while (iterador) {
            System.out.println("Elija un tipo de arquitectura (Introduce la posicion) : ");
            for (int i = 0; i < tipos.length; i++) System.out.println((i + 1) + ". " + tipos[i]);
            String var = sc.next();
            try {
                type = Integer.parseInt(var);
                System.out.println("Has elegido: " + tipos[type - 1]);
                iterador = false;
            } catch (Exception e) {
                System.out.println("No has introducido un numero o no es valido");
            }
        }
        return tipos[type - 1];
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Arquitectura{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", ciudad=" + ciudad.getNombre() +
                '}';
    }
}
