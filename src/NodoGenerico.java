public class NodoGenerico<E> {
    private E dato;
    private NodoGenerico<E> siguiente;

    public NodoGenerico(E dato, NodoGenerico<E> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public E getDato(){
        return dato;
    }

    public NodoGenerico<E> getSiguiente(){
        return siguiente;
    }

    public void setDato(E dato){
        this.dato = dato;
    }

    public void setSiguiente(NodoGenerico<E> siguiente){
        this.siguiente = siguiente;
    }
}
