import java.util.ArrayList;

/**
 * Created by Florencia on 10/12/16.
 */
public class Chofer {
    private String name;
    private long dni;
    private TarjetaDeCredito tarjeta;
    private boolean isAvailable;
    private double ejeX;
    private double ejeY;
    private Coordenadas coordenadas = new Coordenadas(ejeX,ejeY);
    private Auto auto;
    EstadoChofer estado;


    public Chofer() throws Exception {
        name = Scanner.getString("Nombre del chofer: ");
        dni = Scanner.getLong("Numero de documento: ");
        ejeX = Scanner.getDouble("Coordenadas en x: ");
        ejeY = Scanner.getDouble("Coordenadas en y: ");
        isAvailable = true;
        auto = new Auto();
        estado = new Offline(this);
    }

    public void setEstado(EstadoChofer nuevoEstado){
        estado = nuevoEstado;
    }

    public Coordenadas actualizarCoordenadas(long newX, long newY){
        coordenadas = new Coordenadas(newX,newY);
        return coordenadas;
    }

    public String getName(){
        return name;
    }

    public long getDni(){
        return dni;
    }

    public long getCreditNumber(){
        return tarjeta.getCreditNumber();
    }

    public double getCapacidad(){
        return auto.getCapacidad();
    }

    public double getTipoDeAuto(){
        return auto.getTipoDeAuto();
    }
}