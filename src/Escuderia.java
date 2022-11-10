public class Escuderia {
    private String nombre;
    private String pais;
    private Piloto[] pilotos;
    private int numPilotos;
    private int puntos;

    public Escuderia(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        pilotos = new Piloto[2];
        numPilotos = 0;
        puntos = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPais(){
        return pais;
    }

    public int getNumPilotos(){
        return numPilotos;
    }

    public int getPuntos(){
        return puntos;
    }

    public void insertarPiloto(Piloto p){
        if(numPilotos == 0) {
            pilotos[0] = p;
            numPilotos++;
        }
        else if(numPilotos == 1) {
            pilotos[1] = p;
            numPilotos++;
        }
        else
            System.out.println("La escudería ha alcanzado su nº máximo de pilotos.");
    }

    public void borrarPiloto(Piloto p){
        if(pilotos[0] == p){
            pilotos[0] = pilotos[1];
            pilotos[1] = null;
            numPilotos--;
        }
        else if(pilotos[1] == p){
            pilotos[1] = null;
            numPilotos--;
        }
        else
            System.out.println("El piloto no es de esta escudería.");
    }

    public void borrarPiloto(String nombre){
        if(pilotos[0].getNombre().equals(nombre)){
            pilotos[0] = pilotos[1];
            pilotos[1] = null;
            numPilotos--;
        }
        else if(pilotos[1].getNombre().equals(nombre)){
            pilotos[1] = null;
            numPilotos--;
        }
        else
            System.out.println("El piloto no es de esta escudería.");
    }

    public double mediaEdad(){
        return ((pilotos[0].getEdad() + pilotos[1].getEdad())/2.0);
    }

    public void coincideNacionalidad(){
        if(numPilotos == 0)
            System.out.println("No hay coincidencias.");
        else if(numPilotos == 1)
            if(pilotos[0].getNacionalidad().equals(pais))
                System.out.println("Tanto el piloto " + pilotos[0].getNombre() + " como la escudería " + nombre + " son de " + pais + ".");
            else
                System.out.println("No hay coincidencias.");
        else{
                if(pilotos[0].getNacionalidad().equals(pais) || pilotos[1].getNacionalidad().equals(pais)){
                    if(pilotos[0].getNacionalidad().equals(pais))
                        System.out.println("Tanto el piloto " + pilotos[0].getNombre() + " como la escudería " + nombre + " son de " + pais + ".");
                    if(pilotos[1].getNacionalidad().equals(pais))
                        System.out.println("Tanto el piloto " + pilotos[1].getNombre() + " como la escudería " + nombre + " son de " + pais + ".");
                }
                else
                    System.out.println("No hay coincidencias.");
            }
    }

    public void setPuntos(int puesto) {
        switch (puesto) {
            case 1:
                puntos += 50;
                break;
            case 2:
                puntos += 25;
                break;
            case 3:
                puntos += 15;
                break;
            case 4:
                puntos += 12;
                break;
            case 5:
                puntos += 10;
                break;
            case 6:
                puntos += 8;
                break;
            case 7:
                puntos += 6;
                break;
            case 8:
                puntos += 4;
                break;
            case 9:
                puntos += 2;
                break;
            case 10:
                puntos += 1;
        }
    }

    public void mostrarEscuderia(){
        System.out.println(" Nombre: " + nombre);
        System.out.println(" País: " + pais);
        System.out.println(" Puntos obtenidos: " + puntos);
        System.out.println(" " + numPilotos + " pilotos:");
        if(numPilotos > 0) {
            pilotos[0].mostrarPiloto();
                if(numPilotos == 2)
                    pilotos[1].mostrarPiloto();
        }
    }
}
