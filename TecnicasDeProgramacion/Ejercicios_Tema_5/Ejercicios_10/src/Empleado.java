public class Empleado {
    private String nombre;
    private int seguridadSocial, numeroEmpleado;

    public Empleado (int num) {
        this.nombre = "No definido";
        this.seguridadSocial = 0;
        this.numeroEmpleado = num;
    }

    public Empleado(String nombre, int seguridadSocial, int numeroEmpleado) {
        this.nombre = nombre;
        this.seguridadSocial = seguridadSocial;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(int seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", seguridadSocial=" + seguridadSocial +
                ", numeroEmpleado=" + numeroEmpleado +
                '}';
    }
}
