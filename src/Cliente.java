/**
 * Created by Tincho on 12-Oct-16.
 */
public class Cliente {
    private String name;
    private long dni;
    private static TarjetaDeCredito tarjeta;
    private double costo;

    public Cliente() throws Exception {
        name = Scanner.getString("Nombre del usuario: ");
        dni = Scanner.getLong("Dni del usuario: ");
        this.tarjeta = new TarjetaDeCredito();
    }

    public void pedirViaje(){
        double salidaX = Scanner.getDouble("Punto de salida Eje X: ");
        double salidaY = Scanner.getDouble("Punto de salida Eje Y: ");
        double llegadaX = Scanner.getDouble("Punto de llegada Eje X: ");
        double llegadaY = Scanner.getDouble("Punto de llegada Eje Y: ");
        Coordenadas coordenadasSalida = new Coordenadas(salidaX,salidaY);
        Coordenadas coordenadasLlegada = new Coordenadas(llegadaX,llegadaY);
        double distancia = Math.sqrt(Math.pow(salidaX-llegadaX,2)+Math.pow(salidaY-llegadaY,2));
        double precio = (distancia/100)+ 15;
        System.out.println("El precio de este viaje va a ser de :" + precio);
        this.costo = precio;
    }

    public long getDni(){
        return dni;
    }

    public String getName(){
        return name;
    }

    public double getCosto(){
        return costo;
    }

    public static long getTarjeta(){
        return tarjeta.getCreditNumber();
    }

    public void getDatos(){
        System.out.println(this.getName());
        System.out.println(this.getDni());
        System.out.println(this.getTarjeta());
    }

    @Override
    public String toString() {
        String name = this.name;
        String dni = String.valueOf(this.dni);
        String tarjetaCredito = String.valueOf(this.tarjeta);
        String cliente = "Nombre: " + name + "\n" + "Dni: " + dni + "\n" + "Numero de Tarjeta de Credito: " + tarjetaCredito + "\n";
        return cliente;
    }
}
