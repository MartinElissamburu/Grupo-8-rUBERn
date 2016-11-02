package Exceptions;

/**
 * Created by Florencia on 11/1/16.
 */
public class AlreadyOfflineException extends RuntimeException {
    public AlreadyOfflineException(){
        super("Este chofer ya esta offline");
    }
}
