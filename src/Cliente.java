/**
 * Created by Tincho on 12-Oct-16.
 */
public class Cliente {
    private String name;
    private long dni;
    private TarjetaDeCredito tarjeta;
    private long numeroClientes = 0;

    public Cliente() throws Exception {
        name = Scanner.getString("Nombre del usuario: ");
        dni = Scanner.getLong("Dni del usuario: ");
        this.tarjeta = new TarjetaDeCredito();
        numeroClientes ++;
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
        double costo = (distancia/100)+ 15; //multiplicado por el costo de imagen
    }

    public long getDni(){
        return dni;
    }

    public String getName(){
        return name;
    }

    public long getTarjeta(){
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
