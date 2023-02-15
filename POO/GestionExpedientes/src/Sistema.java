import java.util.ArrayList;

public class Sistema {

    ArrayList<Expediente> expedientes = new ArrayList<>();


    public Sistema() {
    }

    public Sistema(ArrayList<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public ArrayList<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(ArrayList<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    //Metodos

}
