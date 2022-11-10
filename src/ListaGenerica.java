public class ListaGenerica<E> {
    private NodoGenerico<E> inicio, fin;
    private int numElementos;

    public ListaGenerica(){
        inicio = null;
        fin = null;
        numElementos = 0;
    }

    public int getNumElementos(){
        return numElementos;
    }

    public boolean vacia(){
        return inicio == null;
    }

    public void insertar(E e){
        NodoGenerico<E> nuevo = new NodoGenerico<>(e,null);
        if(this.vacia())
            inicio = nuevo;
        else
            fin.setSiguiente(nuevo);
        fin = nuevo;
        numElementos++;
    }

    public void borrar(E e){
        NodoGenerico<E> actual = inicio;
        NodoGenerico<E> anterior = null;
        boolean borrado = false;
        while(!borrado && actual != null) {
            if (actual.getDato() == e) {
                if (actual == inicio)
                    inicio = actual.getSiguiente();
                else
                    anterior.setSiguiente(actual.getSiguiente());
                if (actual == fin)
                    fin = anterior;
                numElementos--;
                borrado = true;
            } else {
                anterior = actual;
                actual = actual.getSiguiente();
            }
        }
        if(!borrado)
            System.out.println("El vehículo no está en la lista.");
    }

    public boolean contiene(E e){
        NodoGenerico<E> actual = inicio;
        while (actual != null && actual.getDato() != e)
            actual = actual.getSiguiente();
        if(actual != null)
            return true;
        else
            return false;
    }

    public E getElemento(int pos){
        int i = 0;
        NodoGenerico<E> actual = inicio;
        while(i != pos && actual != null){
            actual = actual.getSiguiente();
            i++;
        }
        if(actual != null)
            return actual.getDato();
        else
            return null;
    }

    public IteradorGenerico<E> getIterador(){
        return new IteradorGenerico<>(inicio);
    }
}
