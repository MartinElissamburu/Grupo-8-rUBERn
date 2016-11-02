package Exceptions;

/**
 * Created by Florencia on 11/1/16.
 */
public class AlreadyWorkingException extends RuntimeException {
    public AlreadyWorkingException(){
        super("Este chofer ya esta trabajando");
    }
}
