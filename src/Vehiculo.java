public abstract class Vehiculo {
    private String matricula;
    private int numero;
    private String color;

    public Vehiculo(String matricula, int numero, String color) throws ExMatricula{
            this.matricula = matricula;
            this.numero = numero;
            this.color = color;
            valida();
    }

    public void valida() throws ExMatricula{
        if(matricula.length()!=7)
            throw new ExMatriculaLongitud();
        if(!Character.isDigit(matricula.charAt(0)) || !Character.isDigit(matricula.charAt(1)) || !Character.isDigit(matricula.charAt(2)) || !Character.isDigit(matricula.charAt(3)))
            throw new ExMatriculaNumerico();
        if(!Character.isLetter(matricula.charAt(4)) || !Character.isLetter(matricula.charAt(5)) || !Character.isLetter(matricula.charAt(6)))
            throw new ExMatriculaAlfabetico();
    }

    public String getMatricula(){
        return matricula;
    }

    public int getNumero(){
        return numero;
    }

    public String getColor(){
        return color;
    }

    public abstract void mostrarVehiculo();

}
