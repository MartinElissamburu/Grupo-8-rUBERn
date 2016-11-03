import Exceptions.OpcionInvalida;

import java.util.ArrayList;

/**
 * Created by Tincho on 25-Oct-16.
 */
public class MenuUsuarios{
    private ArrayList<Cliente> clientes;

    public MenuUsuarios(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

    protected void displayContent() throws Exception, OpcionInvalida {
        boolean volver = true;

        do {
            int size = clientes.size();
            System.out.println("Menu usuarios");
            System.out.println("---------\n" +
                    "1. Lista de usuarios y datos\n" +
                    "2. Agregar usuario\n" +
                    "3. Borrar usuario\n" +
                    "4. Volver atras\n");

            int j = Scanner.getInt("Que operacion desea realizar: ");

            switch (j) {
                case 1:
                    if (size != 0) {
                        for (int k = 0; k < clientes.size(); k++) {
                            clientes.get(k).getDatos();
                        }
                        //accede al array list de usuarios y los imprime
                    }else {
                        System.out.println("No hay usuarios inicializados.");
                    }
                    break;
                case 2:
                        int cantidadUsuarios = Scanner.getInt("Cuantos usuarios desea agregar: ");
                        for (int o = 0; o < cantidadUsuarios; o++) {
                            Cliente cliente = new Cliente();
                            clientes.add(cliente);
                        }
                        break;
                case 3:
                    if (size != 0) {
                        for (int k = 0; k < clientes.size(); k++) {
                            clientes.get(k).getDatos();
                        }
                        int usuarioABorrar = Scanner.getInt("Escriba el documento del usuario a borrar (en caso de no haber usuario con este documento volvera al menu anterior): ");
                        int usuariosBorrados = 0;
                        for (int k = 0; k < clientes.size(); k++) {
                                if (clientes.get(k).getDni() == usuarioABorrar) {
                                    clientes.remove(k);
                                    usuariosBorrados ++;
                                }
                            //hacer un try and catch por si no concuerda el dni
                        }
                        try {
                            if (usuariosBorrados == 0){
                                throw new OpcionInvalida();
                            }
                        } catch (OpcionInvalida opcionInvalida) {
                            System.out.println("No hay ningun usuario con este documento.");
                        }
                    }else{
                        System.out.println("No hay usuarios inicializados");
                    }
                    //al ingresado o no, en caso de no haber ningun documento igual vuelvo al menu anterior

                    break;
                case 4:
                    volver = false;
                    break;
                default:


            }

            int borrar = Scanner.getInt("Si desea limpiar la pantalla ingrese 1, en caso de no querer limpiar lo que quiera: ");

            if (borrar == 1){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }

        }while(volver);

    }


    protected void displayTitle() {
        System.out.println("---------");
    }
}
