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

    public void goOffline() throws Exception {
        throw new Exception("Ya esta offline"); //hacer try and catch en todas las clases
    }

    public void goWorking(){
        chofer.setEstado(new Working(chofer));
    }
}
