
/**
 * Created by Tincho on 21-Oct-16.
 */
public class MenuPrincipal extends Formulario {
    @Override

    protected void displayContent() throws Exception {
        clearScreen();
        while (true) {

            System.out.println("------------\n" +
                    "Que operacion desea realizar:\n" +
                    "1. Realizar un viaje\n" +
                    "2. Menu Choferes\n" +
                    "3. Menu Usuarios\n" +
                    "4. Salir\n" );
            String impresion = null;
            int impresion2 = 888888;
            int j = Scanner.getInt("Que operación desea realizar: ");
            switch (j) {
                case 1:
                    //preguntar con que cliente desea viajar y crear el algoritmo de busqueda de viaje, podria ser otro metodo
                    //al final del viaje se crea una nueva factura
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 2:
                    new MenuChoferes().displayTitle();
                    new MenuChoferes().displayContent();
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 3:
                    new MenuUsuarios().displayTitle();
                    new MenuUsuarios().displayContent();
                    impresion = "nada";
                    impresion2 = 9999999;
                    break;
                case 4:
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

    @Override
    protected void displayTitle() {
        System.out.println("Bienvenido a rUBERn");
    }
}
