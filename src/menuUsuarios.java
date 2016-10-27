import java.util.ArrayList;

/**
 * Created by Tincho on 25-Oct-16.
 */
public class menuUsuarios extends formulario {

    @Override
    protected void displayContent() throws Exception {
        System.out.println("---------\n"+
                "1. Lista de usuarios y datos\n"+
                "2. Agregar usuario\n"+
                "3. Borrar usuario\n" +
                "4. Volver atras\n");

        int j = Scanner.getInt("Que operacion desea realizar: ");
        int i = 0;
        switch(j){
            case 1:

                //accede al array list de usuarios y los imprime
                i = 0;
                break;
            case 2:
                int cantidadUsuarios = Scanner.getInt("Cuantos usuarios desea agregar: ");
                for (int o = 0; o<cantidadUsuarios; o++){
                    Cliente cliente = new Cliente();
                    //agregar este cliente a la lista de clientes
                }
                i = 0;
                break;
            case 3:
                //aca escribo la lista de usuarios
                int usuarioABorrar = Scanner.getInt("Escriba el documento del usuario a borrar(en caso de no haber usuario con este documento volvera al menu principal): ");
                Cliente borrar;
                //recorro el arraylist de usuarios y me fijo en cada usuario si el documento es igual
                //al ingresado o no, en caso de no haber ningun documento igual vuelvo al menu anterior
                i = 0;
                break;
            case 4:
                i = 0;
                break;
            default:
                i = 1;

        }
    }


    @Override
    protected void displayTitle() {
        System.out.println("Menu Usuarios");
    }
}
