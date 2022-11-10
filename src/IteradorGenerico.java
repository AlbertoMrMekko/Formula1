public class IteradorGenerico<E> {
    private NodoGenerico<E> actual;

    public IteradorGenerico(NodoGenerico<E> comienzo){
        actual = comienzo;
    }

    public boolean hasNext(){
        return actual != null;
    }

    public E next(){
        E resultado = actual.getDato();
        actual = actual.getSiguiente();
        return resultado;
    }
}
