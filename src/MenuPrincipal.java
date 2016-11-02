import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Tincho on 21-Oct-16.
 */
public class MenuPrincipal extends Formulario {
    private ArrayList<Chofer> choferes;
    private ArrayList<Cliente> clientes;
    private ArrayList<Factura> facturas;

    public MenuPrincipal(ArrayList<Chofer> choferes, ArrayList<Cliente> clientes,ArrayList<Factura> facturas){
        this.choferes = choferes;
        this.clientes = clientes;
        this.facturas = facturas;
    }

    protected void displayContent() throws Exception {
        while (true) {

            System.out.println("------------\n" +
                    "Que operacion desea realizar:\n" +
                    "1. Realizar un viaje\n" +
                    "2. Menu Choferes\n" +
                    "3. Menu Usuarios\n" +
                    "4. Imprimir facturas\n" +
                    //nuevo tipo de auto
                    "5. Salir\n" );
            String impresion = null;
            int impresion2 = 888888;
            int j = Scanner.getInt("Que operación desea realizar: ");
            switch (j) {
                case 1:
                    long documentoCliente = Scanner.getLong("Ingrese el documento del pasajero: ");

                    new PedirViaje(choferes, clientes, documentoCliente);
                    /*for(int e = 0; e < clientes.size(); e++){
                        if(clientes.get(e).getDni() == documentoCliente){
                            clientes.get(e).pedirViaje();
                            int cantidadDePasajeros = Scanner.getInt("Cuantos pasajeros van a viajar: ");
                            ArrayList<Chofer> choferesOnline = new ArrayList<>();
                            ArrayList<Chofer> choferesAptos = new ArrayList<>();
                            for(int g = 0; g < choferes.size(); g++){
                                if(choferes.get(g).getEstado().equals("Online")){
                                    choferesOnline.add(choferes.get(g));
                                }
                            }
                            for(int f = 0; f < choferesOnline.size(); f++){
                                if(choferesOnline.get(f).getAuto().getCapacidad() >= cantidadDePasajeros){
                                    choferesAptos.add(choferes.get(f));
                                }
                            }

                            Factura factura = new Factura(clientes.get(e).getCosto(),facturas);
                        }
                    }*/
                    //preguntar con que cliente desea viajar y crear el algoritmo de busqueda de viaje, podria ser otro metodo
                    //al final del viaje se crea una nueva factura
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 2:
                    new MenuChoferes(choferes).displayTitle();
                    new MenuChoferes(choferes).displayContent();
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 3:
                    new MenuUsuarios(clientes).displayTitle();
                    new MenuUsuarios(clientes).displayContent();
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 4:
                    for(int l = 0; l < facturas.size(); l++){
                        facturas.get(l).imprimirFacturas();
                    }
                case 5:
                    impresion = "Gracias por utilizar rUBERn";
                    impresion2 = 9999999;
                    break;
                default:
                    impresion = "Esta opcion no es valida";
                    break;
            }
            if (!impresion.equals("nada")) {
                if (impresion2 != 9999999) {
                    System.out.println("");
                    System.out.println(impresion);
                } else {
                    System.out.println("");
                    System.out.println(impresion);
                    System.out.println("");
                    System.exit(0);
                }
            }
            System.out.println("\n");
            int limpiar = Scanner.getInt("Si desea limpiar la consola ingrese 1, si desea que la consola quede sin limpiar ingrese 2 y si desea salir ingrese 3: ");
            if (limpiar == 1){
                clearScreen();
            }
            else if(limpiar == 3){
                System.out.println("Gracias por usar este programa");
                System.exit(0);
            }
            else{
                System.out.println("");
            }
        }
    }


    protected void displayTitle() {
        clearScreen();
        System.out.println("Bienvenido a rUBERn");

    }
}
