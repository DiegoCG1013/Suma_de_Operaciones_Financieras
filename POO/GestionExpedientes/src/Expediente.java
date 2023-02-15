import java.time.LocalDate;
import java.util.ArrayList;

public class Expediente {

    String numExpediente;
    LocalDate fecha;
    Alumno alumno;
    ArrayList<AsignaturaCursada> asignaturas = new ArrayList<>();

    public Expediente(LocalDate fecha, Alumno alumno, ArrayList<AsignaturaCursada> asignaturas) {
        numExpediente = String.valueOf((int)(Math.random() * 10000));
        this.fecha = fecha;
        this.alumno = alumno;
        this.asignaturas = asignaturas;
    }

    public Expediente() {
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<AsignaturaCursada> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<AsignaturaCursada> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
