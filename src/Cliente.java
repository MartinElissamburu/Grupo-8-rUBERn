/**
 * Created by Tincho on 12-Oct-16.
 */
public class Cliente {
    private String name;
    private TarjetaDeCredito tarjeta;
    public Cliente() throws Exception {
        name = Scanner.getString("Nombre del Usuario: ");
        this.tarjeta = new TarjetaDeCredito(Scanner.getLong("Ingrese numero de tarjeta: "));
    }

    public void pedirViaje(){
        Coordenadas coordenadasSalida = new Coordenadas(Scanner.getDouble("Punto de Salida Eje X: "), Scanner.getDouble("Punto de Salida Eje Y: "));
        Coordenadas coordenadasLlegada = new Coordenadas(Scanner.getDouble("Punto de Llegada Eje X: "), Scanner.getDouble("Punto de Llegada Eje Y: "));
    }
//probando arre loco

}
