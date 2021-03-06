import Exceptions.AlreadyOfflineException;
import Exceptions.CantGoWorkingException;

/**
 * Created by Florencia on 10/23/16.
 */
public class Offline implements EstadoChofer {
    Chofer chofer;

    public Offline(Chofer c) {
        this.chofer = c;
    }

    public void goOnline(){
        chofer.setEstado(new Online(chofer));
    }

    public void goOffline(){
        try {
            if (chofer.getEstado() instanceof Offline){
                throw new AlreadyOfflineException();
            }else{
                new Offline(chofer);
            }
        } catch (AlreadyOfflineException onlineException){
            System.out.println("Este chofer ya esta offline");
        }
        //Fijarse si esta bien la exception que tira
    }

    public void goWorking() {
        try {
            if (chofer.getEstado() instanceof Offline) {
                throw new CantGoWorkingException();
            } else {
                new Working(chofer);
            }
        } catch (CantGoWorkingException cantGoOffline) {
            System.out.println("El chofer no puede pasar de trabajando a offline");
        }
    }
}
