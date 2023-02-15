import java.util.ArrayList;

public class Titulacion {

    ArrayList<Asignatura> asignaturas = new ArrayList();
    String ciclo, nombre;
    int creditos;

    public Titulacion(ArrayList<Asignatura> asignaturas, String ciclo, String nombre, int creditos) {
        this.asignaturas = asignaturas;
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Titulacion() {
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
