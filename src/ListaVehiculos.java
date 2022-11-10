import java.util.LinkedList;
import java.util.Iterator;
public class ListaVehiculos { // implementacion con linked list
    private LinkedList<Vehiculo> lista;

    public ListaVehiculos(){
        lista = new LinkedList<Vehiculo>();
    }

    public void insertarVehiculo(Vehiculo v){
        if(!lista.contains(v))
            lista.add(v);
        else
            System.out.println("El vehículo ya estaba en la lista.");
    }

    public void borrarVehiculo(Vehiculo v){
        lista.remove(v);
    }

    public boolean buscarVehiculo(Vehiculo v){
        return lista.contains(v);
    }

    public void mostrarListaVehiculos(){
        Iterator<Vehiculo> itV = lista.listIterator();
        while(itV.hasNext())
            itV.next().mostrarVehiculo();
    }
}
