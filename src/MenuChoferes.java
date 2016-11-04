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
        boolean volver = true;
        do {
            int size = choferes.size();
            System.out.println("Menu choferes");
            System.out.println("---------\n" +
                    "1. Lista de choferes y datos\n" +
                    "2. Estado de choferes\n" +
                    "3. Agregar choferes\n" +
                    "4. Borrar choferes\n" +
                    "5. Desconectarse\n" +
                    "6. Conectarse\n" +
                    "7. Finalizar viaje\n" +
                    "8. Volver atras\n");

            int j = Scanner.getInt("Que operacion desea realizar: ");

            switch (j) {
                case 1:
                    if (size >= 1) {
                        for (int k = 0; k < choferes.size(); k++) {
                            choferes.get(k).getDatos();
                        }

                    }else{
                        System.out.println("No hay choferes inicializados.");
                    }
                    break;
                case 2:
                    if (size >= 1) {
                        for (int k = 0; k < choferes.size(); k++) {
                            System.out.println("Chofer: " + choferes.get(k).getName()+ " esta "+ choferes.get(k).getEstadoString());
                        }
                    }else {
                        System.out.println("No hay choferes inicializados.");
                    }
                    break;
                case 3:
                    int cantidadChoferes = Scanner.getInt("Cuantos choferes desea agregar: ");
                    for (int o = 0; o < cantidadChoferes; o++) {
                        Chofer chofer = new Chofer();
                        choferes.add(chofer);
                    }
                    break;
                case 4:
                    if (size != 0) {
                        for (int k = 0; k < choferes.size(); k++) {
                            choferes.get(k).getDatos();
                        }
                        int choferABorrar = Scanner.getInt("Escriba el documento del chofer a borrar(en caso de no haber " +
                                "chofer con este documento volvera al menu anterior): ");
                        for (int k = 0; k < choferes.size(); k++) {
                            if (choferes.get(k).getDni() == choferABorrar) {
                                choferes.remove(k);
                                try {
                                    choferes.get(k).getDni();
                                } catch (Exceptions.DniNoValidoException dniNoExiste) {
                                    throw new Exceptions.DniNoValidoException(choferes.get(k).getDni());
                                }
                            }
                        }
                    }else{
                        System.out.println("No hay choferes inicializados.");
                    }
                    break;
                case 5: //desconectarse
                    if (size != 0) {
                        int choferGoOffline = Scanner.getInt("Escriba el documento del chofer a desconectar (en caso de no " +
                                "haber chofer con este documento volvera al menu anterior): ");
                        for (int k = 0; k < choferes.size(); k++) {
                            if (choferes.get(k).getDni() == choferGoOffline) {
                                choferes.get(k).setEstado(new Offline(choferes.get(k)));
                            }
                        }
                    }else{
                        System.out.println("No hay choferes inicializados");
                    }
                    break;
                case 6: //conectarse
                    if (size != 0) {
                        int choferGoOnline = Scanner.getInt("Escriba el documento del chofer a conectar (en caso de no " +
                                "haber chofer con este documento volvera al menu anterior): ");
                        for (int k = 0; k < choferes.size(); k++) {
                            if (choferes.get(k).getDni() == choferGoOnline) {
                                choferes.get(k).setEstado(new Online(choferes.get(k)));
                            }
                        }
                    }else {
                        System.out.println("No hay choferes inicializados");
                    }
                    break;
                case 7:
                    if (size != 0) {
                        int choferFinViaje = Scanner.getInt("Escriba el documento del chofer que termina el viaje (en caso de no " +
                                "haber chofer con este documento volvera al menu anterior): ");
                        for (int k = 0; k < choferes.size(); k++) {
                            if (choferes.get(k).getDni() == choferFinViaje) {
                                if (choferes.get(k).getEstado().equals("Working")) {
                                    choferes.get(k).setEstado(new Online(choferes.get(k)));
                                } else {
                                    System.out.println("Este chofer no esta en viaje");
                                }
                            }
                        }
                    }else {
                        System.out.println("No hay choferes inicializados");
                    }
                    break;
                case 8:
                    volver = false;
                    break;
                default:

            }
            int borrar = Scanner.getInt("Si desea limpiar la pantalla ingrese 1, en caso de no querer limpiar oprima cualquier tecla: ");

            if (borrar == 1){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        }while(volver);
    }

    protected void displayTitle() {
        System.out.println("---------");
    }
}
