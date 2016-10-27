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

    private int numeroDeTransaccion;
    private String tipoDeOperacion;
    private Date fecha;
    private long tarjetaDeCredito;
    private String descripcion;
    private double costo;
    private ArrayList<Factura> facturas;

    public Factura(){
        numeroDeTransaccion = 0;
        if(costo > 0){ //cobro, uber gana plata
            tipoDeOperacion = "Cobro";
        } else {
            tipoDeOperacion = "Pago";
        }
        //fecha = Date.from();
        if(tipoDeOperacion.equals("Cobro")){
            //tarjetaDeCredito = Cliente.getTarjeta();
        } else {
            //tarjetaDeCredito = Chofer.getTarjeta();
        }
        if(tipoDeOperacion.equals("Cobro")){
            descripcion = "Cobro a un cliente por un viaje";
        } else {
            descripcion = "Pago a un chofer por un viaje";
        }
        //costo = hacerviaje.getCosto()
        numeroDeTransaccion++;
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
}
