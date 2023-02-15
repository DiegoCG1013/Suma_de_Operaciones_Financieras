public class HabitacionSuite extends Habitacion implements Impresion{

    private double superficie;

    public HabitacionSuite(int numero, double precio, boolean conBaño, double superficie) {
        super(numero, precio, conBaño);
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Numero: " + numero + "\tPrecio: " + precio + (conBaño? "\tTiene Baño" : "No tiene baño") + "Superficie: " + superficie + "m2");
    }
}
