public class AsignaturaCursada{

    Asignatura asignatura;
    Double nota;
    String convocatoria;

    public AsignaturaCursada(Asignatura asignatura, Double nota, String convocatoria) {
        this.asignatura = asignatura;
        this.nota = nota;
        this.convocatoria = convocatoria;
    }

    public AsignaturaCursada() {
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(String convocatoria) {
        this.convocatoria = convocatoria;
    }
}
