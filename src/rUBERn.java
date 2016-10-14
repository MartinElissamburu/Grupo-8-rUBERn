

import java.util.ArrayList;

/**
 * Created by Tincho on 12-Oct-16.
 */
public class rUBERn {

    public static void main(String[] args) throws Exception {
        ArrayList<Chofer> choferes = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        int cantidadChoferes = Scanner.getInt("Cuantos Choferes desea: ");
        for (int i = 0; i<cantidadChoferes; i++){
            Chofer chofer = new Chofer();
            choferes.add(i, chofer);
        }
        int cantidadUsuarios = Scanner.getInt("Cuantos Usuarios desea: ");
        for (int i = 0; i<cantidadUsuarios; i++){
            Cliente cliente = new Cliente();
            clientes.add(i, cliente);
        }
    }
}
/*while (true) {

                System.out.println("------------\n" +
                    "Que operacion desea realizar:\n" +
                    "1. Realizar un viaje\n" +
                    "2. Enunciar Choferes\n" +
                    "3. Enunciar Usuarios\n" +
                    "4. Salir\n" );
            String impresion = null;
            int impresion2 = 888888;
            int j = Scanner.getInt("Que operación desea realizar: ");
            switch (j) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    impresion = "Gracias por utilizar este programa";
                    impresion2 = 9999999;
                    break;
                default:
                    impresion = "Esta opcion no es valida";
                    impresion2 = 0;
                    break;
            }
            if (!impresion.equals("6")) {
                if (impresion2 != 9999999) {
                    System.out.println("");
                    System.out.println(impresion);
                    if (impresion2 != 888888) {
                        System.out.println(impresion2);
                        System.out.println("");
                    }
                } else {
                    System.out.println("");
                    System.out.println(impresion);
                    System.out.println("");
                    System.exit(0);
                }
            } else {
                System.out.println("No lo hice ese, era opcional");
            }
            int limpiar = Scanner.getInt("Si desea limpiar la consola ingrese 1, si desea que la consola quede sin limpiar ingrese 2 y si desea salir ingrese 3");
            if (limpiar == 1){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
            else if(limpiar == 3){
                System.out.println("Gracias por usar este programa");
                System.exit(0);
            }
            else{
                System.out.println("");
            }
        }*/



