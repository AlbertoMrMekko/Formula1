public class Moto extends Vehiculo{
    private String casco; //color del casco.

    public Moto(String matricula, int numero, String color, String casco) throws ExMatricula {
        super(matricula,numero,color);
        this.casco = casco;
    }

    public String getCasco(){
        return casco;
    }

    public void mostrarVehiculo(){
        System.out.println("  Datos de la moto:");
        System.out.println("    Matrícula: " + getMatricula());
        System.out.println("    Número: " + getNumero());
        System.out.println("    Color: " + getColor());
        System.out.println("    Casco: " + casco);
    }
}
