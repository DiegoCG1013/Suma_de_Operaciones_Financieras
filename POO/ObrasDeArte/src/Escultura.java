public class Escultura extends Obra{

    //Atributo
    private String autor, material;

    //Constructor
    public Escultura(String nombre, int anyo, Ciudad ciudad, String autor, String material) {
        super(nombre, anyo, ciudad);
        this.autor = autor;
        this.material = material;
    }
    //Método toString
    @Override
    public String toString() {
        return "Escultura{" +
                "autor='" + autor + '\'' +
                ", material='" + material + '\'' +
                ", nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", ciudad=" + ciudad.getNombre() +
                '}';
    }
}
