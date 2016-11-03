import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Florencia on 10/27/16.
 */
public class Factura {
    /*
    identificador de operacion (numero de transaccion)
    tipo de operacion (viaje)
    fecha (day,month,year)
    numero de tarjeta (de quien?)
    descripcion (de donde a donde)
    monto (positivo o negativo dependiendo si es pago o cobro)
     */

    private int numeroDeTransaccion = 0;
    private String tipoDeOperacion;
    private String fecha;
    private long tarjetaDeCredito;
    private String descripcion;
    private double costo;
    private ArrayList<Factura> facturas;


    public Factura(double costo, ArrayList<Factura> facturas, Chofer chofer){

        tipoDeOperacion = "Pago";
        fecha = this.getFecha();
        tarjetaDeCredito = chofer.getTarjeta();
        descripcion = "Pago a un chofer por un viaje";
        this.costo = -(costo * 0.9);
        numeroDeTransaccion++;
        this.facturas = facturas;
        facturas.add(this);
    }
    public Factura(double costo, ArrayList<Factura> facturas, Cliente cliente){
        tipoDeOperacion = "Cobro";
        fecha = this.getFecha();
        tarjetaDeCredito = cliente.getTarjeta();
        descripcion = "Cobro a un cliente por un viaje";
        this.costo = costo;
        numeroDeTransaccion++;
        this.facturas = facturas;
        facturas.add(this);
    }

    public void imprimirFacturas(){
        for(int i = 0; i < facturas.size(); i++){
            System.out.println(facturas.get(i).numeroDeTransaccion);
            System.out.println(facturas.get(i).tipoDeOperacion);
            System.out.println(facturas.get(i).fecha);
            System.out.println(facturas.get(i).tarjetaDeCredito);
            System.out.println(facturas.get(i).descripcion);
            System.out.println(facturas.get(i).costo);
        }
    }

    private String getFecha() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
