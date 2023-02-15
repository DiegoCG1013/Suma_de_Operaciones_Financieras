public class HabitacionSimple extends Habitacion implements Impresion{

    private boolean tv;

    public HabitacionSimple(int numero, double precio, boolean conBaño, boolean tv) {
        super(numero, precio, conBaño);
        this.tv = tv;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Numero: " + numero + "\tPrecio: " + precio + (conBaño? "\tTiene Baño" : "No tiene baño") + (tv? "\tTiene TV" : "No tiene TV"));
    }
}
