/**
 * Created by Usuario on 21/10/2016.
 */
public class Auto {
    private double capacidad;
    private int tipoDeAuto;
    private double costoAdicional; //cuanto mejor el auto mas caro el viaje

    public Auto() throws Exception {
        capacidad = Scanner.getInt("Capacidad deseada para este auto: ");
        if(capacidad <= 0 ) {
            //hacer un try and catch
        }

        tipoDeAuto = this.setTipoDeAuto();
        if (tipoDeAuto <1 || tipoDeAuto>3) {
            this.setTipoDeAuto();
        }
        switch (tipoDeAuto){
            case 1:
                costoAdicional = 0.15;
                break;
            case 2:
                costoAdicional = 0.1;
                break;
            case 3:
                costoAdicional = 0.05;
                break;
        }
    }

    public int setTipoDeAuto(){
        tipoDeAuto = Scanner.getInt("Ingrese el tipo de auto\nSabiendo que 1 es muy bueno, 2 es bueno y 3 es regular: ");
        return tipoDeAuto;
    }
    public double getCapacidad(){
        return capacidad;

    }
    public int getTipoDeAuto(){
        return tipoDeAuto;
    }
}
