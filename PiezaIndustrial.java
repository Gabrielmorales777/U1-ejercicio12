public class PiezaIndustrial {

    private String codigoPieza;
    private double longitudMilimetros;
    private double longitudEstandar;


    public PiezaIndustrial(String codigoPieza, double longitudMilimetros, double longitudEstandar){

        if(longitudMilimetros <= 0 || longitudEstandar <= 0){
            throw new IllegalArgumentException("Las longitudes deben ser positivas");
        }
        this.codigoPieza = codigoPieza;
        this.longitudMilimetros = longitudMilimetros;
        this.longitudEstandar = longitudEstandar;

    }


    public boolean esAceptable(){
        return Math.abs(longitudMilimetros - longitudEstandar) <= 0.5;
    }
}
