class Main{
    public static void main(String[] args){
        System.out.println("Bienvenido al programa de control de calidad de piezas industriales.");

        PiezaIndustrial pieza1 = new PiezaIndustrial("P001", 10.3, 10.0);
        PiezaIndustrial pieza2 = new PiezaIndustrial("P002", 9.8, 10.0);


        if(pieza1.esAceptable()){
            System.out.println("Pieza P001: Aceptada");
        } else{
            System.out.println("Pieza P001: Rechazada");
        }

        if(pieza2.esAceptable()){
            System.out.println("Pieza P002: Aceptada");
        } else{
            System.out.println("Pieza P002: Rechazada");
        }
    }

}