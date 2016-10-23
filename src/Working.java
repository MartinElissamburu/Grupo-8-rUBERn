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

    public void goOffline() throws Exception {
        throw new Exception("No puede irse offline");
    }

    public void goWorking() throws Exception {
        throw new Exception("Ya esta trabajando");
    }
}
