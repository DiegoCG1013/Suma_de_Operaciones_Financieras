public class Asignatura {

    int creditos;
    private String nombre, cuatrimestre, tipo;
    private Profesor profesor;

    public Asignatura() {
    }

    public Asignatura(String nombre, String cuatrimestre, int creditos, String tipo, Profesor profesor) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.creditos = creditos;
        this.tipo = tipo;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
