public class Piloto {
    private  String nombre;
    private int edad;
    private String nacionalidad;
    private Vehiculo v;
    private int puntos;
    private int podium;
    private int pole;
    private Escuderia escuderia;

    public Piloto(String nombre, int edad, String nacionalidad, Vehiculo v) throws Exception{
        try{
            this.nombre = nombre;
            this.edad = edad;
            this.nacionalidad = nacionalidad;
            this.v = v;
            puntos = 0;
            podium = 0;
            pole = 0;
            escuderia = null;
        }catch(Exception e){
            if(edad < 0 || edad > 100) {
                System.out.println("Edad incoherente.");
                throw new Exception();
            }
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public Vehiculo getVehiculo(){
        return v;
    }

    public int getPuntos(){
        return puntos;
    }

    public int getPodium(){
        return podium;
    }

    public int getPole(){
        return pole;
    }

    public Escuderia getEscuderia(){
        return escuderia;
    }

    public void setEscuderia(Escuderia esc){
        escuderia = esc;
    }

    public void setVehiculo(Vehiculo v){
        this.v = v;
    }

    public void mostrarPiloto(){
        System.out.println("Datos del piloto:");
        System.out.println("  Nombre: " + nombre);
        System.out.println("  Edad: " + edad);
        System.out.println("  Nacionalidad: " + nacionalidad);
        System.out.println("  Puntos obtenidos: " + puntos);
        System.out.println("  Número de podiums: " + podium);
        System.out.println("  Número de poles: " + pole);
        v.mostrarVehiculo();
    }

    public void setPuntos(int puesto){
        switch (puesto){
            case 1:{
                puntos += 50;
                podium++;
                pole++;
            }
                break;
            case 2:{
                puntos += 25;
                podium++;
            }
                break;
            case 3:{
                puntos += 15;
                podium++;
            }
                break;
            case 4: puntos += 12;
                break;
            case 5: puntos += 10;
                break;
            case 6: puntos += 8;
                break;
            case 7: puntos += 6;
                break;
            case 8: puntos += 4;
                break;
            case 9: puntos += 2;
                break;
            case 10: puntos += 1;
        }
    }

}
