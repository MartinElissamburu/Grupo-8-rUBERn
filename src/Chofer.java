import java.util.ArrayList;

/**
 * Created by Florencia on 10/12/16.
 */
public class Chofer {
    private String name;
    private long dni;
    private static TarjetaDeCredito tarjeta;
    private boolean isAvailable;
    private double ejeX;
    private double ejeY;
    private Coordenadas coordenadas = new Coordenadas(ejeX,ejeY);
    private Auto auto;
    private EstadoChofer estado;


    public Chofer() throws Exception {
        name = Scanner.getString("Nombre del chofer: ");
        dni = Scanner.getLong("Numero de documento: ");
        ejeX = Scanner.getDouble("Coordenadas en x: ");
        ejeY = Scanner.getDouble("Coordenadas en y: ");
        this.tarjeta = new TarjetaDeCredito();
        isAvailable = true;
        auto = new Auto();
        estado = new Online(this);
    }

    public void setEstado(EstadoChofer nuevoEstado){
        estado = nuevoEstado;
    }

    public Coordenadas actualizarCoordenadas(long newX, long newY){
        coordenadas = new Coordenadas(newX,newY);
        return coordenadas;
    }

    public double calcularViaje(Coordenadas coorSalida, Coordenadas coorLlegada){
        double distancia = Math.sqrt(Math.pow(coorSalida.ejeX-coorLlegada.ejeX,2)+Math.pow(coorSalida.ejeY-coorLlegada.ejeY,2));
        double costo = (distancia/100)+15;
        return costo;
    }

    public String getName(){
        return name;
    }

    public long getDni(){
        return dni;
    }

    public static long getTarjeta(){
        return tarjeta.getCreditNumber();
    }

    public double getCapacidad(){
        return auto.getCapacidad();
    }

    public double getTipoDeAuto(){
        return auto.getTipoDeAuto();
    }

    public Coordenadas getCoordenadas(){
        return coordenadas;
    }

    public Auto getAuto() {
        return auto;
    }

    public EstadoChofer getEstado(){
        return estado;
    }

    public String getEstadoString(){
        return estado.toString();
    }

    public void getDatos(){
        System.out.println(this.getName());
        System.out.println(this.getDni());
        System.out.println(this.getTarjeta());
    }
}