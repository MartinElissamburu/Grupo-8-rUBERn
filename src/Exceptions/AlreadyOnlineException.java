package Exceptions;

/**
 * Created by Florencia on 11/2/16.
 */
public class AlreadyOnlineException extends RuntimeException {
    public AlreadyOnlineException(){
        super("Este chofer ya esta online");
    }
}
