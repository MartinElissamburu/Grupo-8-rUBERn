import java.util.ArrayList;

/**
 * Created by Florencia on 10/12/16.
 */
public class Chofer {
    private String name;
    private boolean isAvailable;
    private double ejeX;
    private double ejeY;
    private Coordenadas coordenadas = new Coordenadas(ejeX,ejeY);
    private int tipoDeAuto;
    private int cantidadPasajeros;


    public Chofer(){
        name = Scanner.getString("Nombre del chofer: ");
        ejeX = Scanner.getDouble("Coordenadas en x: ");
        ejeY = Scanner.getDouble("Coordenadas en y: ");
        isAvailable = true;
        tipoDeAuto = Scanner.getInt("Ingrese el tipo de auto: \n Sabiendo que 1 es muy bueno, 2 es bueno y 3 es regular: ");
        cantidadPasajeros = Scanner.getInt("Cantidad de pasajeros que permite: ");
    }


}
