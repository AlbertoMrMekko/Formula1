public class Coche extends Vehiculo{
    private String aleron; //tipo inventado p. ej. AX54V.

    public Coche(String matricula, int numero, String color, String aleron) throws ExMatricula{
        super(matricula,numero,color);
        this.aleron = aleron;
    }

    public String getAleron(){
        return aleron;
    }

    public void mostrarVehiculo(){
        System.out.println("  Datos del coche:");
        System.out.println("    Matrícula: " + getMatricula());
        System.out.println("    Número: " + getNumero());
        System.out.println("    Color: " + getColor());
        System.out.println("    Alerón: " + aleron);
    }
}
