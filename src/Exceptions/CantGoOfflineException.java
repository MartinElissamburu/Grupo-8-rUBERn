package Exceptions;

/**
 * Created by Florencia on 11/1/16.
 */
public class CantGoOfflineException extends RuntimeException {
    public CantGoOfflineException(){
        super("El chofer no puede pasar de trabajando a offline");
    }
}
