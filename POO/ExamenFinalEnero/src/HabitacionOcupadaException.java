public class HabitacionOcupadaException extends Exception{

    @Override
    public String getMessage(){
        return "Habitacion ocupada en la fecha elegida";
    }

}
