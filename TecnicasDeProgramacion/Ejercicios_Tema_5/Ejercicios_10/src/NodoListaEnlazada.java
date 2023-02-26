public class NodoListaEnlazada<E> {
    private NodoListaEnlazada<E> siguiente;
    private E elemento;

    public NodoListaEnlazada(E elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public NodoListaEnlazada<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaEnlazada<E> siguiente) {
        this.siguiente = siguiente;
    }

    public E getElemento() {
        return elemento;
    }

    public void setElemento(E elemento) {
        this.elemento = elemento;
    }
}

