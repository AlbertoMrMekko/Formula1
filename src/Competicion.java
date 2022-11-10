public class Competicion {
    private String nombre;
    private ListaGenerica<Carrera> listaCarreras;

    public Competicion(String nombre){
        this.nombre = nombre;
        listaCarreras = new ListaGenerica<>();
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumCarreras(){
        return listaCarreras.getNumElementos();
    }

    public void aniadirCarrera(Carrera c){
        listaCarreras.insertar(c);
    }

    public void eliminarCarrera(Carrera c){
        listaCarreras.borrar(c);
    }

    public Carrera getCarrera(int pos){
        return listaCarreras.getElemento(pos);
    }

    public boolean contieneCarrera(Carrera c){
        return listaCarreras.contiene(c);
    }

    public int getNumVueltasTotal() {
        int suma = 0;
        IteradorGenerico<Carrera> itG = listaCarreras.getIterador();
        while (itG.hasNext())
            suma += itG.next().getNumVueltas();
        return suma;
    }

    public double getMediaVueltas() {
        double suma = 0.0;
        IteradorGenerico<Carrera> itG = listaCarreras.getIterador();
        while (itG.hasNext())
            suma += itG.next().getNumVueltas();
        return suma / listaCarreras.getNumElementos();
    }

    public void mostrarCompeticion(Piloto[] drivers, Escuderia[] teams){
        boolean finalizado = true;
        Carrera race;
        System.out.println("Nombre competición: " + nombre);
        System.out.println(getNumCarreras() + " carreras:");
        if(!listaCarreras.vacia()){
            IteradorGenerico<Carrera> itG = listaCarreras.getIterador();
            while(itG.hasNext()) {
                race = itG.next();
                System.out.print("-");
                race.mostrarCarrera();
                System.out.println();
                if(!race.carreraFinalizada())
                    finalizado = false;
            }
        }
        if(finalizado)
            mostrarClasificacion(drivers, teams);
        else
            System.out.println("** La competición no ha finalizado aún.");
    }

    public void mostrarClasificacion(Piloto[] drivers, Escuderia[] teams){
        System.out.println("---CLASIFICACIÓN---");
        System.out.println(" **Pilotos**");
        int i;
        Piloto pGanador;
        Escuderia escGanadora;
        ordenarPorPuntosPilotos(drivers);
        pGanador = drivers[0];
        for(i=0;i< drivers.length;i++)
            System.out.println("  " + (i+1) + ". " + drivers[i].getNombre() + "     " + drivers[i].getPuntos() + " puntos");
        System.out.println();
        System.out.println(" **Escuderías**");
        ordenarPorPuntosEscuderias(teams);
        escGanadora = teams[0];
        for(i=0;i< teams.length;i++)
            System.out.println("  " + (i+1) + ". " + teams[i].getNombre() + "     " + teams[i].getPuntos() + " puntos");
        System.out.println();
        System.out.println("El piloto ganador del campeonato \""+this.nombre+"\" es "+pGanador.getNombre()+" con "+ pGanador.getPuntos()+" puntos");
        System.out.println("La escudería ganadora del campeonato \""+this.nombre+"\" es "+escGanadora.getNombre()+" con "+ escGanadora.getPuntos()+" puntos");
        System.out.println("--------------------");
    }

    public void ordenarPorPuntosPilotos(Piloto[] drivers){
        Piloto[] aux = new Piloto[drivers.length];
        int i;
        boolean[] seleccionados = new boolean[drivers.length];
        for(i=0;i<seleccionados.length;i++)
            seleccionados[i] = false;
        for(i=0;i<aux.length;i++)
            aux[i] = maxPuntosPilotos(drivers,seleccionados);
        for(i=0;i<aux.length;i++)
            drivers[i] = aux[i];
    }

    public void ordenarPorPuntosEscuderias(Escuderia[] teams){
        Escuderia[] aux = new Escuderia[teams.length];
        int i;
        boolean[] seleccionadas = new boolean[teams.length];
        for(i=0;i<seleccionadas.length;i++)
            seleccionadas[i] = false;
        for(i=0;i<aux.length;i++)
            aux[i] = maxPuntosEscuderias(teams,seleccionadas);
        for(i=0;i<aux.length;i++)
            teams[i] = aux[i];
    }

    public Piloto maxPuntosPilotos(Piloto[] drivers, boolean[] seleccionados){
        int max,i,j;
        Piloto p = null;
        for(i=0,max=0,j=0;i<drivers.length;i++)
            if((drivers[i].getPuntos() >= max) && (!seleccionados[i])){
                p = drivers[i];
                max = drivers[i].getPuntos();
                j = i;
            }
        seleccionados[j] = true;
        return p;
    }

    public Escuderia maxPuntosEscuderias(Escuderia[] teams, boolean[] seleccionadas){
        int max,i,j;
        Escuderia esc = null;
        for(i=0,max=0,j=0;i<teams.length;i++)
            if((teams[i].getPuntos() >= max) && (!seleccionadas[i])){
                esc = teams[i];
                max = teams[i].getPuntos();
                j = i;
            }
        seleccionadas[j] = true;
        return esc;
    }
}
