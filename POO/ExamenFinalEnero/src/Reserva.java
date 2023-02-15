import java.util.GregorianCalendar;

public class Reserva  implements Impresion{

    private Habitacion habitacion;
    private GregorianCalendar fechaInicio, fechaFin;

    public Reserva(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) throws Exception{
        if (fechaInicio.compareTo(fechaFin) > 0) throw new IllegalArgumentException();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.habitacion = habitacion;

    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        if (fechaInicio.compareTo(fechaFin) > 0) throw new IllegalArgumentException();
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        if (fechaInicio.compareTo(fechaFin) > 0) throw new IllegalArgumentException();
        this.fechaFin = fechaFin;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("\tHabitacion: \n" + habitacion + "Fecha de inicio: " + fechaInicio.get(3) + "/" + fechaInicio.get(2) + "/" + fechaInicio.get(1) + "Fecha de finalizacion: " + fechaFin.get(3) + "/" + fechaFin.get(2) + "/" + fechaFin.get(1));
    }

    public static void main(String[] args) {
        System.out.println(new GregorianCalendar(2003, 10, 1).compareTo(new GregorianCalendar(2003, 10, 2)));
    }
}
