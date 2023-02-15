public class Obra {

    //Atributos
    protected String nombre;
    protected int anyo;
    protected Ciudad ciudad;

    //Constructor
    public Obra(String nombre, int anyo, Ciudad ciudad) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.ciudad = ciudad;
    }

    //Getter necesario para el codigo
    public String getNombre() {
        return nombre;
    }

    //Metodo para comparar dos obras segun los criterios dados, de manera que devuelve un numero positivo si la segunda va antes que la primera
    //negativo en caso contrario,y cero en caso de qie sean iguales ante estos criterios
    public int comparador (Obra otraObra){
        return ciudad.getNombre().compareTo(otraObra.ciudad.getNombre()) != 0 ? ciudad.getNombre().compareTo(otraObra.ciudad.getNombre()) : otraObra.anyo - anyo != 0? otraObra.anyo - anyo : nombre.compareTo(otraObra.nombre);
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Obra{" +
                "nombre='" + nombre + '\'' +
                ", año=" + anyo +
                ", ciudad=" + ciudad.getNombre() +
                '}';
    }
}
