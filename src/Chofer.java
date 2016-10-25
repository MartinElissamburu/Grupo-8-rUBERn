import java.util.ArrayList;

/**
 * Created by Florencia on 10/12/16.
 */
public class Chofer {
    private String name;
    //long dni
    //tarjeta de credito
    private boolean isAvailable;
    private double ejeX;
    private double ejeY;
    private Coordenadas coordenadas = new Coordenadas(ejeX,ejeY);
    private Auto auto;
    EstadoChofer estado;


    public Chofer() throws Exception {
        name = Scanner.getString("Nombre del chofer: ");
        ejeX = Scanner.getDouble("Coordenadas en x: ");
        ejeY = Scanner.getDouble("Coordenadas en y: ");
        isAvailable = true;
        auto = new Auto();
        estado = new Offline(this);
    }

    public void setEstado(EstadoChofer nuevoEstado){
        estado = nuevoEstado;
    }

    //public void actualizar cooordenadas
    //public void getname, getTarjeta
}