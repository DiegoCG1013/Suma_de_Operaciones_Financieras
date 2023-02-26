public class TablaEmpleados {
    private final int TAMANIO = 13;//Tiene que ser primo, para que haya menos colisiones en el hash, cuanto mas grande sea, menos colisiones habra
    private NodoListaEnlazada[] tabla = new NodoListaEnlazada[TAMANIO];

    public TablaEmpleados() {
        for (int i = 0; i < TAMANIO; i++) {
            tabla[i] = new NodoListaEnlazada(null);
        }
    }

    public void insertar(Empleado empleado) {
        int posicion = empleado.getNumeroEmpleado() % TAMANIO;
        NodoListaEnlazada nodoNuevo = new NodoListaEnlazada(empleado);
        NodoListaEnlazada<Empleado> nodo = tabla[posicion];
        while(nodo.getSiguiente() != null) {
            nodo = nodo.getSiguiente();
        }
        nodo.setSiguiente(nodoNuevo);
    }

    public Empleado buscar(int numeroEmpleado) {
        int posicion = numeroEmpleado % TAMANIO;
        NodoListaEnlazada<Empleado> nodo = tabla[posicion];
        while(nodo.getSiguiente() != null) {
            if(nodo.getElemento() != null && nodo.getElemento().getNumeroEmpleado() == numeroEmpleado) {
                return nodo.getElemento();
            }
            nodo = nodo.getSiguiente();
        }
        return null;
    }
}
