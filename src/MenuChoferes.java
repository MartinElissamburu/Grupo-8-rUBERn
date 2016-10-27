import java.util.ArrayList;

/**
 * Created by Tincho on 25-Oct-16.
 */
public class MenuChoferes extends Formulario {
    private ArrayList<Chofer> choferes;
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
                for(int k = 0; k < choferes.size(); k++){
                    choferes.get(k).getDatos();
                }
                i = 0;
                break;
            case 2:
                for(int k = 0; k < choferes.size(); k++){
                    choferes.get(k).getEstado();
                }
                i = 0;
                break;
            case 3:
                new CrearChoferes();
                // o Chofer chofer = new Chofer() ??
                //al ingresado o no, en caso de no haber ningun documento igual vuelvo al menu anterior
                i = 0;
                break;
            case 4:
                int choferABorrar = Scanner.getInt("Escriba el documento del chofer a borrar(en caso de no haber " +
                        "chofer con este documento volvera al menu principal): ");
                for(int k = 0; k < choferes.size(); k++){
                    if(choferes.get(k).getDni() == choferABorrar){
                        choferes.remove(k);
                        //hacer un try and catch en caso que el dni que nos pase no corresponda a ningun chofer
                    }
                }
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
