import java.util.ArrayList;

public class Alumno extends Persona{

    Titulacion titulacion;
    private ArrayList<Asignatura> asignaturas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String direccion, Titulacion titulacion, ArrayList<Asignatura> asignaturas) {
        super(dni, nombre, direccion);
        this.titulacion = titulacion;
        this.asignaturas = asignaturas;
    }

    public Titulacion getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(Titulacion titulacion) {
        this.titulacion = titulacion;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
