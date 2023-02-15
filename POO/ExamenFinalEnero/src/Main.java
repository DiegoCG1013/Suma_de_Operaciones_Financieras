import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel UAX");

        Habitacion hs1 = new HabitacionSimple(20, 75, true, true);
        Habitacion hs2 = new HabitacionSimple(21, 75, true, true);
        Habitacion hd1 = new HabitacionDoble(220, 150, true, 1);
        Habitacion hd2 = new HabitacionDoble(204, 150, true, 2);
        Habitacion hd3 = new HabitacionDoble(207, 150, true, 3);
        Habitacion hd4 = new HabitacionDoble(200, 150, true, 4);
        Habitacion hst1 = new HabitacionSuite(37, 400, true, 200);
        Habitacion hst2 = new HabitacionSuite(38, 400, true, 200);
        Habitacion hst3 = new HabitacionSuite(39, 400, true, 200);

        try {

            hotel.añadirHabitacion(hs1);
            hotel.añadirHabitacion(hs2);
            hotel.añadirHabitacion(hd1);
            hotel.añadirHabitacion(hd2);
            hotel.añadirHabitacion(hd3);
            hotel.añadirHabitacion(hd4);
            hotel.añadirHabitacion(hst1);
            hotel.añadirHabitacion(hst2);
            hotel.añadirHabitacion(hst3);

            hotel.añadirReserva(hs1, new GregorianCalendar(2023, 1, 20), new GregorianCalendar(2023, 1, 22));

            hotel.añadirReserva(hd2, new GregorianCalendar(2023, 1, 19), new GregorianCalendar(2023, 12, 22));

            hotel.añadirReserva(hst1, new GregorianCalendar(2023, 1, 23), new GregorianCalendar(2023, 1, 29));

            hotel.añadirReserva(hst1, new GregorianCalendar(2023, 1, 27), new GregorianCalendar(2023, 1, 29));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(hotel.precioTotal());

        hotel.imprimirTodo();


    }

}
