
import Exceptions.AlreadyOnlineException;

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
            if (chofer.getEstado() instanceof Online){
                throw new AlreadyOnlineException();
            }else{
                new Online(chofer);
            }
        } catch (AlreadyOnlineException onlineException){
            System.out.println("Este chofer ya esta online");
        }
    }

    public void goOffline(){
        chofer.setEstado(new Offline(chofer));
    }

    public void goWorking(){
        chofer.setEstado(new Working(chofer));
    }
}
