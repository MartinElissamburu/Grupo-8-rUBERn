/**
 * Created by Tincho on 25-Oct-16.
 */
public class menuChoferes extends formulario{
    @Override
    protected void displayContent() throws Exception {
        System.out.println("---------\n"+
                "1. Lista de choferes y datos\n"+
                "2. Estado de choferes\n"+
                "3. Agregar choferes\n"+
                "4. Borrar choferes\n" +
                "5. Volver atras\n");

        int j = Scanner.getInt("Que operacion desea realizar: ");
        int i = 0;
        switch(j){
            case 1:

                //accede al array list de choferes y los imprime
                i = 0;
                break;
            case 2:
                int cantidadChoferes = Scanner.getInt("Cuantos usuarios desea agregar: ");
                for (int o = 0; o<cantidadChoferes; o++){
                    Chofer chofer = new Chofer();
                    //agregar este chofer a la lista de choferes
                }
                i = 0;
                break;
            case 3:
                //aca escribo la lista de choferes
                int choferABorrar = Scanner.getInt("Escriba el documento del chofer a borrar(en caso de no haber chofer con este documento volvera al menu principal): ");
                Chofer borrar;
                //recorro el arraylist de choferes y me fijo en cada chofer si el documento es igual
                //al ingresado o no, en caso de no haber ningun documento igual vuelvo al menu anterior
                i = 0;
                break;
            case 4:

                break;
            case 5:

                i = 0;
                break;
            default:
                i = 1;

        }
    }

    @Override
    protected void displayTitle() {
        System.out.println("Menu Choferes");
    }
}
