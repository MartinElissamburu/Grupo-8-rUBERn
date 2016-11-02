package Exceptions;

/**
 * Created by Florencia on 11/1/16.
 */
public class DniNoValidoException extends RuntimeException {
    long aDni;

    public DniNoValidoException(long dni){
        super("El dni" + dni + "no corresponde a ningun chofer");
        this.aDni = dni;
    }
}
