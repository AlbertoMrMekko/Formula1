import java.util.Random;

public class Carrera {
    private static final int CURRENT_YEAR = 2020;
    private String nombre;
    private String ciudad;
    private int anio;
    private int numVueltas;
    private Piloto[] posiciones;

    public Carrera(String nombre, String ciudad, int anio, int numVueltas) throws Exception{
        try{
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.anio = anio;
            this.numVueltas = numVueltas;
            posiciones = new Piloto[30];
        }catch (Exception e){
            if(anio > CURRENT_YEAR)
                System.out.println("Año incorrecto.");
            if(numVueltas < 0)
                this.numVueltas = 50;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public String getCiudad(){
        return ciudad;
    }

    public int getAnio(){
        return anio;
    }

    public int getNumVueltas(){
        return numVueltas;
    }

    public void setPosiciones(Piloto p, int puesto) throws Exception{
        try{
            posiciones[puesto - 1] = p;
        }catch (Exception e){
            if(puesto < 1 || puesto > 30)
                throw new Exception();
        }
        p.setPuntos(puesto);
        if(p.getEscuderia() != null)
            p.getEscuderia().setPuntos(puesto);
    }

    public boolean carreraFinalizada(){
        boolean res = true;
        int i;
        for(i=0;i<posiciones.length;i++)
            if(posiciones[i] == null)
                res = false;
        return res;
    }

    public void mostrarCarrera(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Año: " + anio);
        System.out.println("Vueltas: " + numVueltas);
        if(carreraFinalizada()){
            int i,j;
            for(i=0,j=1;i<posiciones.length;i++,j++){
                System.out.println("Posición " + j + ": " + posiciones[i].getNombre() + ".");
            }
        }
    }

    public void resultadosCarrera(Piloto[] drivers) throws Exception{
        boolean[] ocupada = new boolean[30];
        int i;
        for(i=0;i< ocupada.length;i++)
            ocupada[i] = false;
        Random rand = new Random();
        i=0;
        int num;
        while(i< posiciones.length){
            num = rand.nextInt(30);
            if(!ocupada[num]){
                ocupada[num] = true;
                posiciones[i] = drivers[num];
                i++;
            }
        }
        for(i=0;i<posiciones.length;i++)
            setPosiciones(posiciones[i],i+1);
    }
}
