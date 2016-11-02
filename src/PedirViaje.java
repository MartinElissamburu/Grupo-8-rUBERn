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
    private Coordenadas coordSalida;
    private Coordenadas coordLlegada;
    private long documentoCliente;
    private boolean viajePendiente = true;

    public PedirViaje(ArrayList<Chofer> choferes, ArrayList<Cliente> clientes, long documentoCliente) throws Exception {
        this.choferes = choferes;
        this.clientes = clientes;
        this.documentoCliente = documentoCliente;

        for (int e = 0; e < choferes.size(); e++) {
            if (clientes.get(e).getDni() == documentoCliente) {
                clientes.get(e).pedirViaje();
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
                sort(choferesAptos);
                for (int f = 0; f < choferesAptos.size(); f++){
                    int respuesta = Scanner.getInt("Chofer " + choferesAptos.get(f).getName() + ", deseas aceptar un viaje? (1 si, 2 no): "); // try and catch
                    if (f+1 > choferesAptos.size()){
                        System.out.println("No hay choferes disponibles para el viaje");
                    }else {
                        if (respuesta == 1) {
                            choferesAptos.get(f).setEstado(new Working(choferesAptos.get(f)));
                            break;
                        } else if (respuesta != 2){
                            throw new Exception("try and catch");
                        }
                    }
                }
            }

            Factura factura = new Factura(clientes.get(e).getCosto(),facturas);
        }

    }
    public ArrayList<Chofer> sort(ArrayList<Chofer> choferesAptos){
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
}
