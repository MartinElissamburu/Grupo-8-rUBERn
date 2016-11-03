import Exceptions.OpcionInvalida;

import java.util.ArrayList;

/**
 * Created by Florencia on 11/2/16.
 */
public class PedirViaje {
    private ArrayList<Chofer> choferes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Factura> facturas = new ArrayList<>();
    private ArrayList<Chofer> choferesAptos = new ArrayList<>(

    );
    private Factura factura1;
    private Factura factura;
    private Coordenadas coordSalida;
    private Coordenadas coordLlegada;
    private long documentoCliente;
    private boolean viajePendiente = true;
    private Cliente viajador;
    private Chofer conductor;

    public PedirViaje(ArrayList<Chofer> choferes, ArrayList<Cliente> clientes, long documentoCliente) throws Exception {
        this.choferes = choferes;
        this.clientes = clientes;
        this.documentoCliente = documentoCliente;
        int size = choferes.size();

        double costo = 0;
        if (size != 0){
            for (int e = 0; e < clientes.size(); e++){
                try {
                    if (clientes.get(e).getDni() == documentoCliente){
                        viajador = clientes.get(e);
                    }else {
                        throw new OpcionInvalida();
                    }
                }catch (OpcionInvalida o){
                    System.out.println("No hay usuario con este documento");
                }
            }

            double salidaX = Scanner.getDouble("Punto de salida Eje X: ");
            double salidaY = Scanner.getDouble("Punto de salida Eje Y: ");
            double llegadaX = Scanner.getDouble("Punto de llegada Eje X: ");
            double llegadaY = Scanner.getDouble("Punto de llegada Eje Y: ");
            Coordenadas coordenadasSalida = new Coordenadas(salidaX,salidaY);
            Coordenadas coordenadasLlegada = new Coordenadas(llegadaX,llegadaY);
            double distancia = Math.sqrt(Math.pow(salidaX-llegadaX,2) + Math.pow(salidaY-llegadaY,2));
            double precio = (distancia/100)+ 15;
            costo = precio;
            System.out.println("El precio de este viaje va a ser de :" + precio);
            int cantidadDePasajeros = Scanner.getInt("Cuantos pasajeros van a viajar: ");
            ArrayList<Chofer> choferesOnline = new ArrayList<>();
            for (int g = 0; g < choferes.size(); g++) {
                if (choferes.get(g).getEstado() instanceof Online) {
                    choferesOnline.add(choferes.get(g));
                }
            }
            for (int f = 0; f < choferesOnline.size(); f++) {
                if (choferesOnline.get(f).getAuto().getCapacidad() >= cantidadDePasajeros) {
                    choferesAptos.add(choferesOnline.get(f));
                }
            }
            sort(choferesAptos, coordenadasSalida);
            for (int f = 0; f < choferesAptos.size(); f++){
                int respuesta = Scanner.getInt("Chofer " + choferesAptos.get(f).getName() + ", deseas aceptar un viaje? (1 si, 2 no): "); // try and catch
                if (f+1 > choferesAptos.size()){
                    System.out.println("No hay choferes disponibles para el viaje");
                }else {
                    try {
                        if (respuesta == 1) {
                            choferesAptos.get(f).setEstado(new Working(choferesAptos.get(f)));
                            choferesAptos.get(f).setCoordenadas(coordenadasLlegada);
                            conductor = choferesAptos.get(f);
                            break;
                        } else if (respuesta != 2){
                            throw new OpcionInvalida();
                        }
                    }catch (OpcionInvalida opcionInvalida) {
                        System.out.println("Opcion invalida");
                    }
                }
            }
            Factura factura = new Factura(costo,facturas,viajador);
            Factura factura1 = new Factura(costo, facturas, conductor);
            this.factura = factura;
            this.factura1 = factura1;
        }else{
            System.out.println("No hay usuario con este documento");
        }

    }

    public ArrayList<Chofer> sort(ArrayList<Chofer> choferesAptos, Coordenadas coordLlegada){
        if (choferesAptos.size() == 1){
         return choferesAptos;
        }else {
            for (int i = 0; i < choferesAptos.size(); i++) {
                for (int k = i + 1; k < choferesAptos.size(); k++) {
                    if (choferesAptos.get(i).calcularViaje(choferesAptos.get(i).getCoordenadas(), coordLlegada) <
                            choferesAptos.get(k).calcularViaje(choferesAptos.get(k).getCoordenadas(), coordLlegada)) {
                        Chofer aux = choferesAptos.get(i);
                        choferesAptos.set(i, choferesAptos.get(k));
                        choferesAptos.set(k, aux);
                    }
                }
            }
            return choferesAptos;
        }
    }

    public Factura getFacturaUsuario() {
        return factura;
    }

    public Factura getFacturaChofer() {
        return factura1;
    }
}
