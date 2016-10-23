/**
 * Created by Usuario on 21/10/2016.
 */
public class Auto {
    private double capacidad;
    private int tipoDeAuto;

    public Auto() throws Exception {
        capacidad = Scanner.getInt("Capacidad deseada para este auto");
        if(capacidad < 1 ) {
            throw new RuntimeException("La capacidad del auto debe ser mayor a 1");
        }

        tipoDeAuto = Scanner.getInt("Ingrese el tipo de auto\n Sabiendo que 1 es muy bueno, 2 es bueno y 3 es regular: ");
        if (tipoDeAuto <1 || tipoDeAuto>3) {
            throw new RuntimeException("La calidad del auto debe ser 1,2 o 3");
        }
    }
    public double getCapacidad(){
        return capacidad;

    }
    public int getTipoDeAuto(){
        return tipoDeAuto;
    }

}
