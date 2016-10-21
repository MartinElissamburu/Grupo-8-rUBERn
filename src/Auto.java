/**
 * Created by Usuario on 21/10/2016.
 */
public class Auto {
    private double capacidad;
    private int tipoDeAuto;

    public Auto(double capacidad, int tipoDeAuto) throws Exception {
        if(capacidad < 1 ) {
            throw new RuntimeException("La capacidad del auto debe ser mayor a 1");
        }
        else{
            this.capacidad=capacidad;
        }

        if (tipoDeAuto <1 || tipoDeAuto>3){
            throw new RuntimeException("La calidad del auto debe ser 1,2 o 3");

        }
        else{
            this.tipoDeAuto=tipoDeAuto;
        }

    }
    public double getCapacidad(){
        return capacidad;

    }
    public int getTipoDeAuto(){
        return tipoDeAuto;
    }

}
