import Exceptions.AlreadyWorkingException;
import Exceptions.CantGoOfflineException;

/**
 * Created by Florencia on 10/23/16.
 */
public class Working implements EstadoChofer {
    Chofer chofer;

    public Working(Chofer c) {
        chofer = c;
    }

    public void goOnline(){
        chofer.setEstado(new Online(chofer));
    }

    public void goOffline() {
        try {
            if (chofer.getEstado() instanceof Working){
                throw new CantGoOfflineException();
            }else{
                new Working(chofer);
            }
        } catch (CantGoOfflineException cantGoOffline){
            throw new CantGoOfflineException();
        }
    }

    public void goWorking() {
        try{
            if (chofer.getEstado() instanceof Working) {
                throw new AlreadyWorkingException();
            }else {
                new Working(chofer);
            }
        } catch (AlreadyWorkingException workingException){
            throw new AlreadyWorkingException();
        }
    }
}
