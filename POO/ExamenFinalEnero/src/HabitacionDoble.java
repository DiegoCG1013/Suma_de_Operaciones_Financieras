public class HabitacionDoble extends Habitacion implements Impresion{

    private int maxPersonas;

    public HabitacionDoble(int numero, double precio, boolean conBaño, int maxPersonas) {
        super(numero, precio, conBaño);
        this.maxPersonas = maxPersonas;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Numero: " + numero + "\tPrecio: " + precio + (conBaño? "\tTiene Baño" : "No tiene baño") + "\tMáximo de personas: " + maxPersonas);
    }
}
