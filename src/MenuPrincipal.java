import Exceptions.OpcionInvalida;

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

    protected void displayContent() throws Exception, OpcionInvalida {
        while (true) {
            boolean menu = true;
            System.out.println("---------");
            System.out.println("Menu principal");
            System.out.println("------------\n" +
                    "Que operacion desea realizar:\n" +
                    "1. Realizar un viaje\n" +
                    "2. Menu Choferes\n" +
                    "3. Menu Usuarios\n" +
                    "4. Imprimir facturas\n" +
                    "5. Salir\n" );
            String impresion = null;
            int impresion2 = 888888;
            int j = Scanner.getInt("Que operación desea realizar: ");
            switch (j) {
                case 1:
                    for (int i =0; i < clientes.size(); i++){
                        clientes.get(i).getDatos();
                    }
                    long documentoCliente = Scanner.getLong("Ingrese el documento del pasajero: ");

                    PedirViaje a = new PedirViaje(choferes, clientes, documentoCliente);
                    facturas.add(a.getFacturaChofer());
                    //facturas.add(a.getFacturaUsuario());
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 2:
                    new MenuChoferes(choferes).displayTitle();
                    new MenuChoferes(choferes).displayContent();
                    impresion = "nada";
                    impresion2 = 9999999;
                    menu = false;
                    break;
                case 3:
                    new MenuUsuarios(clientes).displayTitle();
                    new MenuUsuarios(clientes).displayContent();
                    impresion = "nada";
                    impresion2 = 9999999;
                    menu = false;
                    break;
                case 4:
                    for(int l = 0; l < facturas.size(); l++){
                        facturas.get(l).imprimirFacturas();
                    }
                    impresion = "nada";
                    break;
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
            if (menu){
                int limpiar = Scanner.getInt("Si desea limpiar la consola ingrese 1, si desea que la consola quede sin limpiar ingrese 2 y si desea salir ingrese 3: ");
                if (limpiar == 1){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
    }


    protected void displayTitle() {
        clearScreen();
        System.out.println("\n" + "Bienvenido a rUBERn");

    }
}
