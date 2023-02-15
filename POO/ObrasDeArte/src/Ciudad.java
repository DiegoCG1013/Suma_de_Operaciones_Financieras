import java.util.ArrayList;

public class Ciudad {
    private String pais, nombre;
    private int habitantes;

    //Constructor
    public Ciudad(String pais, String nombre, int habitantes) {
        this.pais = pais;
        this.nombre = nombre;
        this.habitantes = habitantes;
    }

    //Getters necesarios para el codigo
    public String getPais() {
        return pais;
    }

    public String getNombre() {
        return nombre;
    }

    //Compara dos ciudades, devolviendo un numero positivo cuando el segundo va antes que el primero, negativo en el caso contrario, y cero cuendo son iguales.
    public int comparador (Ciudad otraCiudad) {
        return pais.compareTo(otraCiudad.pais) != 0 ? pais.compareTo(otraCiudad.pais) : otraCiudad.habitantes - habitantes != 0? otraCiudad.habitantes - habitantes : nombre.compareTo(otraCiudad.nombre);
    }

    @Override
    public String toString() {
        return "Ciudad { " +
                "pais = '" + pais + '\'' +
                ", nombre = '" + nombre + '\'' +
                ", habitantes = " + habitantes +
                '}';
    }
}
