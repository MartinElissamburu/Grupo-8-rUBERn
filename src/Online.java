import Exceptions.AlreadyOfflineException;

/**
 * Created by Florencia on 10/23/16.
 */
public class Online implements EstadoChofer {
    Chofer chofer;

    public Online(Chofer c){
        this.chofer = c;
    }

    public void goOnline() {
        try {
            new Online(chofer);
        } catch (AlreadyOfflineException.AlreadyOnlineException onlineException){
            throw new AlreadyOfflineException.AlreadyOnlineException();
        }
    }

    public void goOffline(){
        chofer.setEstado(new Offline(chofer));
    }

    public void goWorking(){
        chofer.setEstado(new Working(chofer));
    }
}
