import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Hotel  implements Impresion{

    private String nombre;
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();

    private final int MAX = 200;

    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void imprimirTodo() {
        System.out.println(nombre);
        for(Reserva x : reservas){
            x.imprimirTodo();
        }
        for(Habitacion x : habitaciones){
            x.imprimirTodo();
        }
    }

    public void añadirHabitacion(Habitacion hab) throws Exception{
        if (comprobarHabitacion(hab)) throw new Exception("La habitacion ya existe");
        habitaciones.add(hab);
    }

    public void añadirReserva(Habitacion hab, GregorianCalendar inicio, GregorianCalendar fin) throws Exception{
        comprobarReserva(hab, inicio, fin);
        reservas.add(new Reserva(hab, inicio, fin));
    }

    //Metodo para comprobar si la habitacion existe, para el metodo de añadir habitacion y el de comprobar reserva
    public boolean comprobarHabitacion (Habitacion hab){
        boolean comprobador = false;
        for (int i = 0; i < habitaciones.size() && !comprobador; i++){
            if (hab.getNumero() == habitaciones.get(i).getNumero() && hab.getPrecio() == habitaciones.get(i).getPrecio() && hab.getConBaño() == habitaciones.get(i).getConBaño()) comprobador = true;
        }
        return comprobador;
    }

    public void comprobarReserva(Habitacion hab, GregorianCalendar ini, GregorianCalendar fin)throws Exception{
        if (comprobarHabitacion(hab)) throw new HabitacionOcupadaException();
        boolean comprobar = false;
        for(int i = 0; i < reservas.size(); i++){
            if (reservas.get(i).getHabitacion().getNumero() == hab.numero) {
                   if(reservas.get(i).getFechaInicio().compareTo(ini) <= reservas.get(i).getFechaFin().compareTo(fin)) throw new HabitacionOcupadaException();
            }
        }
    }

    public int precioTotal (){
        int total = 0;
        for(Reserva x : reservas){
            total += x.getHabitacion().getPrecio();
        }
        return total;
    }
}
