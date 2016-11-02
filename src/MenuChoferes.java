import java.util.ArrayList;

/**
 * Created by Tincho on 25-Oct-16.
 */
public class MenuChoferes {
    private ArrayList<Chofer> choferes;

    public MenuChoferes(ArrayList<Chofer> choferes){
        this.choferes = choferes;
    }

    protected void displayContent() throws Exception {
        System.out.println("---------\n"+
                "1. Lista de choferes y datos\n"+
                "2. Estado de choferes\n"+
                "3. Agregar choferes\n"+
                "4. Borrar choferes\n" +
                "5. Desconectarse\n" +
                "6. Conectarse\n" +
                "7. Finalizar viaje\n" +
                "8. Volver atras\n");


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
                    System.out.println(choferes.get(k).getEstadoString());
                }
                i = 0;
                break;
            case 3:
                int cantidadChoferes = Scanner.getInt("Cuantos choferes desea agregar: ");
                for (int o = 0; o < cantidadChoferes; o++){
                    Chofer chofer = new Chofer();
                    choferes.add(chofer);
                }
                i = 0;
                break;
            case 4:
                int choferABorrar = Scanner.getInt("Escriba el documento del chofer a borrar(en caso de no haber " +
                        "chofer con este documento volvera al menu principal): ");
                for(int k = 0; k < choferes.size(); k++){
                    if(choferes.get(k).getDni() == choferABorrar){
                        choferes.remove(k);
                        try {
                            choferes.get(k).getDni();
                        } catch (Exceptions.DniNoValidoException dniNoExiste){
                            throw new Exceptions.DniNoValidoException(choferes.get(k).getDni());
                        }
                    }
                }
                break;
            case 5: //desconectarse
                int choferGoOffline = Scanner.getInt("Escriba el documento del chofer a desconectar (en caso de no " +
                        "haber chofer con este documento volvera al menu principal): ");
                for(int k = 0; k < choferes.size(); k++){
                    if(choferes.get(k).getDni() == choferGoOffline){
                        choferes.get(k).setEstado(new Offline(choferes.get(k)));
                    }
                }
                break;
            case 6: //conectarse
                int choferGoOnline = Scanner.getInt("Escriba el documento del chofer a conectar (en caso de no " +
                        "haber chofer con este documento volvera al menu principal): ");
                for(int k = 0; k < choferes.size(); k++){
                    if(choferes.get(k).getDni() == choferGoOnline){
                        choferes.get(k).setEstado(new Online(choferes.get(k)));
                    }
                }
                break;
            case 7:
                int choferFinViaje = Scanner.getInt("Escriba el documento del chofer que termina el viaje (en caso de no " +
                        "haber chofer con este documento volvera al menu principal): ");
                for(int k = 0; k < choferes.size(); k++){
                    if(choferes.get(k).getDni() == choferFinViaje){
                        if(choferes.get(k).getEstado().equals("Working")){
                            choferes.get(k).setEstado(new Online(choferes.get(k)));
                        } else {
                            System.out.println("Este chofer no esta en viaje");
                        }
                    }
                }
                break;
            case 8:

                i = 0;
                break;
            default:
                i = 1;

        }
    }

    protected void displayTitle() {
        System.out.println("Menu Choferes");
    }
}
