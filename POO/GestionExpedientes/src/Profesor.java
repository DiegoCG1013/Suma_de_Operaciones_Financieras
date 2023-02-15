import java.util.ArrayList;

public class Profesor extends Persona{

    private String departamento;
    private ArrayList<Asignatura> asignaturas = new ArrayList();


    public Profesor() {
    }

    public Profesor(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
