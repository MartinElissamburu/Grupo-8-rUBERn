/**
 * Created by Tincho on 12-Oct-16.
 */
public class Cliente {
    private String name;
    //long dni
    private TarjetaDeCredito tarjeta;

    public Cliente() throws Exception {
        name = Scanner.getString("Nombre del Usuario: ");
        this.tarjeta = new TarjetaDeCredito(Scanner.getLong("Ingrese numero de tarjeta: "));
    }

    public void pedirViaje(){
        double salidaX = Scanner.getDouble("Punto de salida Eje X: ");
        double salidaY = Scanner.getDouble("Punto de salida Eje Y: ");
        double llegadaX = Scanner.getDouble("Punto de llegada Eje X: ");
        double llegadaY = Scanner.getDouble("Punto de llegada Eje Y: ");
        Coordenadas coordenadasSalida = new Coordenadas(salidaX,salidaY);
        Coordenadas coordenadasLlegada = new Coordenadas(llegadaX,llegadaY);
        int cantidadDePasajeros = Scanner.getInt("Cuantos pasajeros van a viajar: ");
        double distancia = Math.sqrt(Math.pow(salidaX-llegadaX,2)+Math.pow(salidaY-llegadaY,2));
        double costo = (distancia/100)+ 15 ;
    }
}
