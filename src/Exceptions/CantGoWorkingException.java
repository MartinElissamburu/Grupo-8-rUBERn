package Exceptions;

/**
 * Created by Tincho on 02-Nov-16.
 */
public class CantGoWorkingException extends RuntimeException {
    public CantGoWorkingException(){
        super("El chofer no puede pasar de trabajando a offline");
    }
}
