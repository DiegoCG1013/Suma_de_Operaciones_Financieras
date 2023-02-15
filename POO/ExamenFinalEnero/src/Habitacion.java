public class Habitacion implements Impresion{

    protected int numero;
    protected double precio;
    protected boolean conBaño;

    public Habitacion(int numero, double precio, boolean conBaño) {
        this.numero = numero;
        this.precio = precio;
        this.conBaño = conBaño;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getConBaño() {
        return conBaño;
    }

    public void setConBaño(boolean conBaño) {
        this.conBaño = conBaño;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Numero: " + numero + "\tPrecio: " + precio + (conBaño? "\tTiene Baño" : "No tiene baño"));
    }
}

